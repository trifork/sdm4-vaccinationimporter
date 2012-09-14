package dk.nsi.sdm4.vaccination.parser;

import java.util.ArrayList;
import java.util.List;

import dk.nsi.sdm4.core.persistence.recordpersister.Record;
import dk.nsi.sdm4.core.persistence.recordpersister.RecordBuilder;
import dk.nsi.sdm4.core.persistence.recordpersister.RecordSpecification;
import dk.nsi.sdm4.vaccination.model.Disease;
import dk.nsi.sdm4.vaccination.model.DiseaseVaccine;
import dk.nsi.sdm4.vaccination.model.Diseases;
import dk.nsi.sdm4.vaccination.model.DiseasesVaccines;
import dk.nsi.sdm4.vaccination.model.Dosageoption;
import dk.nsi.sdm4.vaccination.model.Dosageoptions;
import dk.nsi.sdm4.vaccination.model.SSIDrug;
import dk.nsi.sdm4.vaccination.model.SSIDrugs;


public class RecordBuilderHelper {

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
            record.field("ddvModifiedDate", d.getDdvModifiedDate());
            record.field("ddvValidFrom", d.getDdvValidFrom());
            record.field("ddvValidTo", d.getDdvValidTo());
            
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
            
            record.field("ddvModifiedDate", d.getDdvModifiedDate());
            record.field("ddvValidFrom", d.getDdvValidFrom());
            record.field("ddvValidTo", d.getDdvValidTo());
            
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

            record.field("ddvModifiedDate", d.getDdvModifiedDate());
            record.field("ddvValidFrom", d.getDdvValidFrom());
            record.field("ddvValidTo", d.getDdvValidTo());
            
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
            record.field("UsableFrom", d.getUsableFrom());
            record.field("UsableTo", d.getUsableTo());

            record.field("ddvModifiedDate", d.getDdvModifiedDate());
            record.field("ddvValidFrom", d.getDdvValidFrom());
            record.field("ddvValidTo", d.getDdvValidTo());
            
            records.add(record.build());
        }
        return records;
    }

}
