package dk.nsi.sdm4.vaccination.recordspecs;

import dk.nsi.sdm4.core.persistence.recordpersister.RecordSpecification;

import static dk.nsi.sdm4.core.persistence.recordpersister.FieldSpecification.field;

public class VaccinationRecordSpecs {
    
    public static final RecordSpecification DISEASES_RECORD_SPEC = RecordSpecification.createSpecification("ddv_diseases", "DiseaseIdentifier", 
            field("DiseaseIdentifier", 15).numerical(),
            field("versionID", 12).numerical(),
		    field("name", 100),
            field("name_dk", 100),
            field("ATCCode", 7), 
            field("ATCText", 72),
            field("ddvModifiedDate", 25),
            field("ddvValidFrom", 25),
            field("ddvValidTo", 25));

    public static final RecordSpecification DISEASESVACCINES_RECORD_SPEC = RecordSpecification.createSpecification("ddv_diseases_vaccines", "VaccineIdentifier", 
            field("VaccineIdentifier", 15).numerical(),
            field("VaccineVersion", 12).numerical(),
            field("DiseaseIdentifier", 15).numerical(),
            field("DiseaseVersion", 12).numerical(),
            field("ddvModifiedDate", 25),
            field("ddvValidFrom", 25),
            field("ddvValidTo", 25));

    public static final RecordSpecification DOSAGEOPTIONS_RECORD_SPEC = RecordSpecification.createSpecification("ddv_dosageoptions", "DosageoptionIdentifier", 
            field("DosageoptionIdentifier", 15).numerical(),
            field("VersionID", 12).numerical(),
            field("DrugIdentifier", 12).numerical(),
            field("DrugName", 30),
            field("DosageText", 100),
            field("ddvModifiedDate", 25),
            field("ddvValidFrom", 25),
            field("ddvValidTo", 25));

    public static final RecordSpecification SSIDRUGS_RECORD_SPEC = RecordSpecification.createSpecification("ddv_ssidrugs", "DrugIdentifier", 
            field("DrugIdentifier", 15).numerical(),
            field("VersionID", 12).numerical(),
            field("Name", 30),
            field("FormTekst", 150),
            field("ATCCode", 10),
            field("ATCText", 100),
            field("StyrkeTekst", 30),
            field("UsableFrom", 25),
            field("UsableTo", 25),
            field("ddvModifiedDate", 25),
            field("ddvValidFrom", 25),
            field("ddvValidTo", 25));

    public static final RecordSpecification VACCINATIONPLANITEMS_RECORD_SPEC = RecordSpecification.createSpecification("ddv_vaccinationplanitems", "VaccinationPlanItemIdentifier", 
            field("VaccinationPlanItemIdentifier", 15).numerical(),
            field("VersionID", 10).numerical(),
            field("VaccineIdentifier", 15).numerical(),
            field("VaccineName", 100),
            field("VaccinationIndex", 12).numerical(),
            field("MinimumInterval", 11).numerical(),
            field("CoverageDuration", 100),
            field("Time", 11).numerical(),
            field("Description", 200),
            field("Series", 100),
            field("VaccinationPlanIdentifier", 15).numerical(),
            field("PlanVersionID", 12).numerical(),
            field("ddvModifiedDate", 25),
            field("ddvValidFrom", 25),
            field("ddvValidTo", 25));

    public static final RecordSpecification VACCINATIONPLANS_RECORD_SPEC = RecordSpecification.createSpecification("ddv_vaccinationplans", "VaccinationPlanIdentifier", 
            field("VaccinationPlanIdentifier", 15).numerical(),
            field("VersionID", 10).numerical(),
            field("Active", 1).numerical(),
            field("Name", 60),
            field("UsableFrom", 25),
            field("UsableTo", 25),
            field("AllocationMethod", 1),
            field("Sex", 1),
            field("BirthCohorteFrom", 25),
            field("BirthCohorteTo", 25),
            field("AgeIntervalFrom", 11).numerical(),
            field("AgeIntervalTo", 11),
            field("ddvModifiedDate", 25),
            field("ddvValidFrom", 25),
            field("ddvValidTo", 25));

    public static final RecordSpecification VACCINES_RECORD_SPEC = RecordSpecification.createSpecification("ddv_vaccines", "VaccineIdentifier", 
            field("VaccineIdentifier", 15).numerical(),
            field("VersionID", 12).numerical(),
            field("ATCCode", 8),
            field("ATCText", 72),
            field("ShortDescription", 100),
            field("AllowCitizenSelfRegister", 1).numerical(),
            field("AllowBulkRegister", 1).numerical(),
            field("Keywords", 2000),
            field("SearchBoost", 8),
            field("ddvModifiedDate", 25),
            field("ddvValidFrom", 25),
            field("ddvValidTo", 25));

    public static final RecordSpecification VACCINESDRUGS_RECORD_SPEC = RecordSpecification.createSpecification("ddv_vaccinesdrugs", "VaccineIdentifier", 
            field("VaccineIdentifier", 15).numerical(),
            field("VersionID", 12).numerical(),
            field("DrugIdentifier", 12).numerical(),
            field("DrugName", 30),
            field("ddvModifiedDate", 25),
            field("ddvValidFrom", 25),
            field("ddvValidTo", 25));
}
