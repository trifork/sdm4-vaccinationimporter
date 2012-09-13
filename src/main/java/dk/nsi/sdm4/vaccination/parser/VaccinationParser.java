package dk.nsi.sdm4.vaccination.parser;

import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import dk.nsi.sdm4.core.parser.Parser;
import dk.nsi.sdm4.core.parser.ParserException;
import dk.nsi.sdm4.core.persistence.recordpersister.RecordPersister;
import dk.nsi.sdm4.core.persistence.recordpersister.RecordSpecification;
import dk.nsi.sdm4.vaccination.model.Diseases;
import dk.nsi.sdm4.vaccination.recordspecs.VaccinationRecordSpecs;
import dk.sdsd.nsp.slalog.api.SLALogItem;
import dk.sdsd.nsp.slalog.api.SLALogger;

public class VaccinationParser implements Parser {
	private static final Logger log = Logger.getLogger(VaccinationParser.class);

	@Autowired
	private SLALogger slaLogger;

	@Autowired
	private RecordPersister persister;

	@Autowired
	private JdbcTemplate jdbcTemplate;

    private final Map<String, RecordSpecification> specsForFiles = new HashMap<String, RecordSpecification>() {
        {
            put("ExpDiseases.xml", VaccinationRecordSpecs.DISEASES_RECORD_SPEC);
            put("ExpDiseasesVaccines.xml", VaccinationRecordSpecs.DISEASESVACCINES_RECORD_SPEC);
            put("ExpDosageoptions.xml", VaccinationRecordSpecs.DOSAGEOPTIONS_RECORD_SPEC);
            put("ExpServices.xml", VaccinationRecordSpecs.SERVICES_RECORD_SPEC);
            put("ExpSSIDrugLMSDrugs.xml", VaccinationRecordSpecs.SSIDRUGSLMSDRUGS_RECORD_SPEC);
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
//            put("ExpDiseasesVaccines.xml", );
//            put("ExpDosageoptions.xml", );
//            put("ExpServices.xml", );
//            put("ExpSSIDrugLMSDrugs.xml", );
//            put("ExpSSIDrugs.xml", );
//            put("ExpVaccinationPlanItems.xml", );
//            put("ExpVaccinationPlans.xml", );
//            put("ExpVaccines.xml", );
//            put("ExpVaccinesDrugs.xml", );
        }
    };

	public void process(File datadir) throws ParserException {

	    SLALogItem slaLogItem = slaLogger.createLogItem("VaccinationParser", "All");

		try {
		    // TODO validate fileset
		    
		    truncateTables();
		    // TODO fetch file
		    
		    unmarshallFile(datadir, Diseases.class);

			slaLogItem.setCallResultOk();
			slaLogItem.store();
		} catch (Exception e) {
			slaLogItem.setCallResultError("VaccinationParser failed - Cause: " + e.getMessage());
			slaLogItem.store();

			throw new ParserException(e);
		}
	}
	
    Object unmarshallFile(File file, Class clazz) {
        
        Object jaxbObject = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(clazz.getPackage().getName());
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            
            jaxbObject =  jaxbUnmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            // TODO
            e.printStackTrace();
        }
        return jaxbObject;
    }
	

    /*
     * Tables needs to be truncated before each run, because SOR-Relation tables must not support history
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
