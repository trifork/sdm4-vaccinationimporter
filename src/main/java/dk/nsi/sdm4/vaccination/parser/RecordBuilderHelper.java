package dk.nsi.sdm4.vaccination.parser;

import static dk.nsi.sdm4.core.persistence.recordpersister.FieldSpecification.field;

import java.util.ArrayList;
import java.util.List;

import dk.nsi.sdm4.core.persistence.recordpersister.Record;
import dk.nsi.sdm4.core.persistence.recordpersister.RecordBuilder;
import dk.nsi.sdm4.core.persistence.recordpersister.RecordSpecification;
import dk.nsi.sdm4.vaccination.model.Disease;
import dk.nsi.sdm4.vaccination.model.Diseases;


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

}
