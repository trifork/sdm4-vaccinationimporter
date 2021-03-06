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

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import dk.nsi.sdm4.core.persistence.recordpersister.Record;
import dk.nsi.sdm4.core.persistence.recordpersister.RecordBuilder;
import dk.nsi.sdm4.core.persistence.recordpersister.RecordSpecification;
import dk.nsi.sdm4.vaccination.model.*;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;


public class RecordBuilderHelper {

    // Format of dates: 2010-05-03T00:31:54Z
    private static final DateTimeFormatter dateTimeFormatter = ISODateTimeFormat.dateTimeNoMillis();

    private static void setIdOnRecords(EntityWithId entityWithId, RecordBuilder recordBuilder) {
        recordBuilder.field("Id", entityWithId.getId());
    }

    public static List<Record> buildDiseaseRecords(Diseases diseases, RecordSpecification spec) {
        
        List<Record> records = new ArrayList<Record>();
        for (Disease d : diseases.getDiseasesList()) {
            RecordBuilder record = new RecordBuilder(spec);

            record.field("DiseaseIdentifier", d.getDiseaseIdentifier());
            record.field("versionID", d.getVersionID());
            record.field("name", d.getName());
            record.field("name_dk", d.getName_dk());
            record.field("ATCCode", d.getATCCode()); 
            record.field("ATCText", d.getATCText());
            record.field("ddvModifiedDate", isoStringToDate(d.getDdvModifiedDate()));
            record.field("ddvValidFrom", isoStringToDate(d.getDdvValidFrom()));
            record.field("ddvValidTo", isoStringToDate(d.getDdvValidTo()));
            setIdOnRecords(d, record);

            records.add(record.build());
        }
        return records;
    }

    public static List<Record> buildDiseaseVaccineRecords(DiseasesVaccines dvs, RecordSpecification spec) {
        List<Record> records = new ArrayList<Record>();
        for (DiseaseVaccine d : dvs.getDiseasesVaccinesList()) {
            RecordBuilder record = new RecordBuilder(spec);

            record.field("VaccineIdentifier", d.getVaccineIdentifier());
            record.field("VaccineVersion", d.getVaccineVersion());
            record.field("DiseaseIdentifier", d.getDiseaseIdentifier());
            record.field("DiseaseVersion", d.getDiseaseVersion());

            record.field("ddvModifiedDate", isoStringToDate(d.getDdvModifiedDate()));
            record.field("ddvValidFrom", isoStringToDate(d.getDdvValidFrom()));
            record.field("ddvValidTo", isoStringToDate(d.getDdvValidTo()));
            setIdOnRecords(d, record);
            
            records.add(record.build());
        }
        return records;
    }

    public static List<Record> buildDosageoptionsRecords(Dosageoptions dos, RecordSpecification spec) {
        List<Record> records = new ArrayList<Record>();
        for (Dosageoption d : dos.getDosageoptionsList()) {
            RecordBuilder record = new RecordBuilder(spec);

            record.field("DosageoptionIdentifier", d.getDosageoptionIdentifier());
            record.field("VersionID", d.getVersionID());
            record.field("DrugIdentifier", d.getDrugIdentifier());
            record.field("DrugName", d.getDrugName());
            record.field("DosageText", d.getDosageText());

            record.field("ddvModifiedDate", isoStringToDate(d.getDdvModifiedDate()));
            record.field("ddvValidFrom", isoStringToDate(d.getDdvValidFrom()));
            record.field("ddvValidTo", isoStringToDate(d.getDdvValidTo()));
            setIdOnRecords(d, record);
            
            records.add(record.build());
        }
        return records;
    }

    public static List<Record> buildSSIDrugsRecords(SSIDrugs sds, RecordSpecification spec) {
        List<Record> records = new ArrayList<Record>();
        for (SSIDrug d : sds.getSSIDrugsList()) {
            RecordBuilder record = new RecordBuilder(spec);

            record.field("DrugIdentifier", d.getDrugIdentifier());
            record.field("VersionID", d.getVersionID());
            record.field("Name", d.getName());
            record.field("FormTekst", d.getFormTekst());
            record.field("ATCCode", d.getaTCCode());
            record.field("ATCText", d.getaTCText());
            record.field("StyrkeTekst", d.getStyrkeTekst());
            record.field("UsableFrom", isoStringToDate(d.getUsableFrom()));
            record.field("UsableTo", isoStringToDate(d.getUsableTo()));

            record.field("ddvModifiedDate", isoStringToDate(d.getDdvModifiedDate()));
            record.field("ddvValidFrom", isoStringToDate(d.getDdvValidFrom()));
            record.field("ddvValidTo", isoStringToDate(d.getDdvValidTo()));
            setIdOnRecords(d, record);
            
            records.add(record.build());
        }
        return records;
    }

    public static List<Record> buildVaccinationPlanItemsRecords(VaccinationPlanItems obj, RecordSpecification spec) {
        List<Record> records = new ArrayList<Record>();
        for (VaccinationPlanItem d : obj.getVaccinationPlanItemsList()) {
            RecordBuilder record = new RecordBuilder(spec);

            record.field("VaccinationPlanItemIdentifier", d.getVaccinationPlanItemIdentifier());
            record.field("VersionID", d.getVersionID());
            record.field("VaccineIdentifier", d.getVaccineIdentifier());
            record.field("VaccineName", d.getVaccineName());
            record.field("VaccinationIndex", d.getVaccinationIndex());
            record.field("MinimumInterval", d.getMinimumInterval());
            record.field("CoverageDuration", d.getCoverageDuration());
            record.field("Time", d.getTime());
            record.field("Description", d.getDescription());
            record.field("Series", d.getSeries());
            record.field("VaccinationPlanIdentifier", d.getVaccinationPlanIdentifier());
            record.field("PlanVersionID", d.getPlanVersionID());

            record.field("ddvModifiedDate", isoStringToDate(d.getDdvModifiedDate()));
            record.field("ddvValidFrom", isoStringToDate(d.getDdvValidFrom()));
            record.field("ddvValidTo", isoStringToDate(d.getDdvValidTo()));
            setIdOnRecords(d, record);
            
            records.add(record.build());
        }
        return records;
    }

    public static List<Record> buildVaccinationPlansRecords(VaccinationPlans obj, RecordSpecification spec) {
        List<Record> records = new ArrayList<Record>();
        for (VaccinationPlan d : obj.getVaccinationPlansList()) {
            RecordBuilder record = new RecordBuilder(spec);

            record.field("VaccinationPlanIdentifier", d.getVaccinationPlanIdentifier());
            record.field("VersionID", d.getVersionID());
            record.field("Active", d.getActive());
            record.field("Name", d.getName());
            record.field("UsableFrom", isoStringToDate(d.getUsableFrom()));
            record.field("UsableTo", isoStringToDate(d.getUsableTo()));
            record.field("AllocationMethod", d.getAllocationMethod());
            record.field("Sex", d.getSex());
            record.field("BirthCohorteFrom", isoStringToDate(d.getBirthCohorteFrom()));
            record.field("BirthCohorteTo", isoStringToDate(d.getBirthCohorteTo()));
            record.field("AgeIntervalFrom", d.getAgeIntervalFrom());
            record.field("AgeIntervalTo", d.getAgeIntervalTo());
            
            record.field("ddvModifiedDate", isoStringToDate(d.getDdvModifiedDate()));
            record.field("ddvValidFrom", isoStringToDate(d.getDdvValidFrom()));
            record.field("ddvValidTo", isoStringToDate(d.getDdvValidTo()));
            setIdOnRecords(d, record);
            
            records.add(record.build());
        }
        return records;
    }

    public static List<Record> buildVaccinesRecords(Vaccines obj, RecordSpecification spec) {
        List<Record> records = new ArrayList<Record>();
        for (Vaccine d : obj.getVaccinesList()) {
            RecordBuilder record = new RecordBuilder(spec);

            record.field("VaccineIdentifier", d.getVaccineIdentifier());
            record.field("VersionID", d.getVersionID());
            record.field("ATCCode", d.getaTCCode());
            record.field("ATCText", d.getaTCText());
            record.field("ShortDescription", d.getShortDescription());
            record.field("AllowCitizenSelfRegister", d.getAllowCitizenSelfRegister());
            record.field("AllowBulkRegister", d.getAllowBulkRegister());
            record.field("Keywords", d.getKeywords());
            record.field("SearchBoost", d.getSearchBoost());

            record.field("ddvModifiedDate", isoStringToDate(d.getDdvModifiedDate()));
            record.field("ddvValidFrom", isoStringToDate(d.getDdvValidFrom()));
            record.field("ddvValidTo", isoStringToDate(d.getDdvValidTo()));
            setIdOnRecords(d, record);
            
            records.add(record.build());
        }
        return records;
    }

    public static List<Record> buildVaccinesDrugsRecords(VaccinesDrugs obj, RecordSpecification spec) {
        List<Record> records = new ArrayList<Record>();
        for (VaccineDrug d : obj.getVaccinesDrugsList()) {
            RecordBuilder record = new RecordBuilder(spec);

            record.field("VaccineIdentifier", d.getVaccineIdentifier());
            record.field("VersionID", d.getVersionID());
            record.field("DrugIdentifier", d.getDrugIdentifier());
            record.field("DrugName", d.getDrugName());

            record.field("ddvModifiedDate", isoStringToDate(d.getDdvModifiedDate()));
            record.field("ddvValidFrom", isoStringToDate(d.getDdvValidFrom()));
            record.field("ddvValidTo", isoStringToDate(d.getDdvValidTo()));
            setIdOnRecords(d, record);
            
            records.add(record.build());
        }
        return records;
    }

    private static java.sql.Date isoStringToDate(String dateString) {
        if (dateString != null && dateString.length() > 0) {
            DateTime dateTime = dateTimeFormatter.parseDateTime(dateString);
            long millis = dateTime.getMillis();
            return new java.sql.Date(millis);
        }
        return null;
    }

}