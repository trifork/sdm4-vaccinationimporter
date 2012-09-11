package dk.nsi.sdm4.vaccination.recordspecs;

import dk.nsi.sdm4.core.persistence.recordpersister.RecordSpecification;

import static dk.nsi.sdm4.core.persistence.recordpersister.FieldSpecification.field;

public class VaccinationRecordSpecs {
    public static final RecordSpecification VACCINATION_RECORD_SPEC = RecordSpecification.createSpecification("dummy", "Id", 
            field("Id", 15).numerical(),
		    field("data", 100));
    
}
