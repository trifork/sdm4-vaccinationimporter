/**
 * The MIT License
 *
 * Original work sponsored and donated by National Board of e-Health (NSI), Denmark
 * (http://www.nsi.dk)
 *
 * Copyright (C) 2011 National Board of e-Health (NSI), Denmark (http://www.nsi.dk)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package dk.nsi.sdm4.vaccination.parser;

import java.io.File;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import dk.nsi.sdm4.core.parser.Parser;
import dk.nsi.sdm4.core.parser.ParserException;
import dk.nsi.sdm4.core.persistence.recordpersister.Record;
import dk.nsi.sdm4.core.persistence.recordpersister.RecordPersister;
import dk.nsi.sdm4.core.persistence.recordpersister.RecordSpecification;
import dk.nsi.sdm4.vaccination.model.Diseases;
import dk.nsi.sdm4.vaccination.model.DiseasesVaccines;
import dk.nsi.sdm4.vaccination.model.Dosageoptions;
import dk.nsi.sdm4.vaccination.model.SSIDrugs;
import dk.nsi.sdm4.vaccination.model.VaccinationPlanItems;
import dk.nsi.sdm4.vaccination.model.VaccinationPlans;
import dk.nsi.sdm4.vaccination.model.Vaccines;
import dk.nsi.sdm4.vaccination.model.VaccinesDrugs;
import dk.nsi.sdm4.vaccination.recordspecs.VaccinationRecordSpecs;
import dk.sdsd.nsp.slalog.api.SLALogItem;
import dk.sdsd.nsp.slalog.api.SLALogger;


public class VaccinationParser implements Parser {
	private static final Logger log = Logger.getLogger(VaccinationParser.class);

	@Autowired
	private SLALogger slaLogger;

	@Autowired
	private JdbcTemplate jdbcTemplate;

    @Autowired
    private RecordPersister persister;

    private final Map<String, RecordSpecification> specsForFiles = new HashMap<String, RecordSpecification>() {
        {
            put("ExpDiseases.xml", VaccinationRecordSpecs.DISEASES_RECORD_SPEC);
            put("ExpDiseasesVaccines.xml", VaccinationRecordSpecs.DISEASESVACCINES_RECORD_SPEC);
            put("ExpDosageoptions.xml", VaccinationRecordSpecs.DOSAGEOPTIONS_RECORD_SPEC);
            put("ExpSSIDrugs.xml", VaccinationRecordSpecs.SSIDRUGS_RECORD_SPEC);
            put("ExpVaccinationPlanItems.xml", VaccinationRecordSpecs.VACCINATIONPLANITEMS_RECORD_SPEC);
            put("ExpVaccinationPlans.xml", VaccinationRecordSpecs.VACCINATIONPLANS_RECORD_SPEC);
            put("ExpVaccines.xml", VaccinationRecordSpecs.VACCINES_RECORD_SPEC);
            put("ExpVaccinesDrugs.xml", VaccinationRecordSpecs.VACCINESDRUGS_RECORD_SPEC);
        }
    };
	
    private final Map<String, Class> typesForFiles = new HashMap<String, Class>() {
        {
            put("ExpDiseases.xml", Diseases.class);
            put("ExpDiseasesVaccines.xml", DiseasesVaccines.class);
            put("ExpDosageoptions.xml", Dosageoptions.class);
            put("ExpSSIDrugs.xml", SSIDrugs.class);
            put("ExpVaccinationPlanItems.xml", VaccinationPlanItems.class);
            put("ExpVaccinationPlans.xml", VaccinationPlans.class);
            put("ExpVaccines.xml", Vaccines.class);
            put("ExpVaccinesDrugs.xml", VaccinesDrugs.class);
        }
    };

	public void process(File dataSet) throws ParserException {

	    SLALogItem slaLogItem = slaLogger.createLogItem("VaccinationParser", "All");

		try {
		    validateDataset(dataSet);
		    
		    truncateTables();
		    
            File[] input = null;
            if(dataSet.isDirectory()) {
                 input = dataSet.listFiles();
            } else {
                input = new File[] {dataSet};
            }

            for (int i = 0; i < input.length; i++) {
                File file = input[i];
                Object obj = unmarshallFile(file, typesForFiles.get(file.getName()));
                persistObject(obj, specsForFiles.get(file.getName()));
            }

			slaLogItem.setCallResultOk();
			slaLogItem.store();
		} catch (Exception e) {
			slaLogItem.setCallResultError("VaccinationParser failed - Cause: " + e.getMessage());
			slaLogItem.store();

			throw new ParserException(e);
		}
	}
	
    private void validateDataset(File dataSet) {
        File[] input = null;
        if(dataSet.isDirectory()) {
             input = dataSet.listFiles();
        } else {
            input = new File[] {dataSet};
        }

        for (int i = 0; i < input.length; i++) {
            File file = input[i];
            boolean contains = typesForFiles.keySet().contains(file.getName());
            if(!contains) {
                throw new ParserException("Validating files, found unknown file: " + file.getName());
            }
        }
    }

    private void persistObject(Object obj, RecordSpecification spec) {

        try {
            List<Record> records = null;
            if(obj instanceof Diseases) {
                records = RecordBuilderHelper.buildDiseaseRecords((Diseases)obj, spec);
            }
            else if(obj instanceof DiseasesVaccines) {
                records = RecordBuilderHelper.buildDiseaseVaccineRecords((DiseasesVaccines)obj, spec);
            }
            else if(obj instanceof Dosageoptions) {
                    records = RecordBuilderHelper.buildDosageoptionsRecords((Dosageoptions)obj, spec);
            }
            else if(obj instanceof VaccinationPlanItems) {
                records = RecordBuilderHelper.buildVaccinationPlanItemsRecords((VaccinationPlanItems)obj, spec);
            }
            else if(obj instanceof VaccinationPlans) {
                records = RecordBuilderHelper.buildVaccinationPlansRecords((VaccinationPlans)obj, spec);
            }
            else if(obj instanceof Vaccines) {
                records = RecordBuilderHelper.buildVaccinesRecords((Vaccines)obj, spec);
            }
            else if(obj instanceof VaccinesDrugs) {
                records = RecordBuilderHelper.buildVaccinesDrugsRecords((VaccinesDrugs)obj, spec);
            }
            else if(obj instanceof SSIDrugs) {
                records = RecordBuilderHelper.buildSSIDrugsRecords((SSIDrugs)obj, spec);
            } else {
                throw new ParserException("Cannot persist unknown object: "+ obj);
            }
            for (Record record : records) {
                persister.persist(record, spec);
            }
        } catch(SQLException e) {
            throw new ParserException("Error persisting object with recordSpecification " + spec, e);
        }
    }

    Object unmarshallFile(File file, Class clazz) {
        
        if(clazz == null) {
            throw new ParserException("Cannot unmarshall unknown filetype: "+file.getName());
        }
        
        Object jaxbObject = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(clazz.getPackage().getName());
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            
            jaxbObject =  jaxbUnmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            throw new ParserException("cannot unmarshal file: "+file.getName(), e);
        }
        return jaxbObject;
    }
	

    /*
     * Tables needs to be truncated before each run, because Vaccination has no history support
     */
    private void truncateTables() {
        Collection<RecordSpecification> values = specsForFiles.values();
        for (RecordSpecification spec : values) {
            jdbcTemplate.execute("truncate table "+ spec.getTable());
        }
    }

    @Override
	public String getHome() {
		return "vaccinationimporter";
	}
}
