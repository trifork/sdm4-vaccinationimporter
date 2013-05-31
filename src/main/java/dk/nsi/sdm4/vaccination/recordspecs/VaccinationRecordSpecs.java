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
package dk.nsi.sdm4.vaccination.recordspecs;

import dk.nsi.sdm4.core.persistence.recordpersister.RecordSpecification;

import static dk.nsi.sdm4.core.persistence.recordpersister.FieldSpecification.field;

public class VaccinationRecordSpecs {
    
    public static final RecordSpecification DISEASES_RECORD_SPEC = RecordSpecification.createSpecification("ddv_diseases", "DiseaseIdentifier", 
            field("DiseaseIdentifier", 15, true).numerical(),
            field("versionID", 12, true).numerical(),
		    field("name", 100, true),
            field("name_dk", 100, true),
            field("ATCCode", 10, true),
            field("ATCText", 72, true),
            field("ddvModifiedDate", 25, true),
            field("ddvValidFrom", 25, true),
            field("ddvValidTo", 25, true));

    public static final RecordSpecification DISEASESVACCINES_RECORD_SPEC = RecordSpecification.createSpecification("ddv_diseases_vaccines", "VaccineIdentifier", 
            field("VaccineIdentifier", 15, true).numerical(),
            field("VaccineVersion", 12, true).numerical(),
            field("DiseaseIdentifier", 15, true).numerical(),
            field("DiseaseVersion", 12, true).numerical(),
            field("ddvModifiedDate", 25, true),
            field("ddvValidFrom", 25, true),
            field("ddvValidTo", 25, true));

    public static final RecordSpecification DOSAGEOPTIONS_RECORD_SPEC = RecordSpecification.createSpecification("ddv_dosageoptions", "DosageoptionIdentifier", 
            field("DosageoptionIdentifier", 15, true).numerical(),
            field("VersionID", 12, true).numerical(),
            field("DrugIdentifier", 15, true).numerical(),
            field("DrugName", 30, true),
            field("DosageText", 100, true),
            field("ddvModifiedDate", 25, true),
            field("ddvValidFrom", 25, true),
            field("ddvValidTo", 25, true));

    public static final RecordSpecification SSIDRUGS_RECORD_SPEC = RecordSpecification.createSpecification("ddv_ssidrugs", "DrugIdentifier", 
            field("DrugIdentifier", 15, true).numerical(),
            field("VersionID", 12, true).numerical(),
            field("Name", 30, true),
            field("FormTekst", 150, true),
            field("ATCCode", 10, true),
            field("ATCText", 100, true),
            field("StyrkeTekst", 30, true),
            field("UsableFrom", 25, true),
            field("UsableTo", 25, true),
            field("ddvModifiedDate", 25, true),
            field("ddvValidFrom", 25, true),
            field("ddvValidTo", 25, true));

    public static final RecordSpecification VACCINATIONPLANITEMS_RECORD_SPEC = RecordSpecification.createSpecification("ddv_vaccinationplanitems", "VaccinationPlanItemIdentifier", 
            field("VaccinationPlanItemIdentifier", 15, true).numerical(),
            field("VersionID", 12, true).numerical(),
            field("VaccineIdentifier", 15, true).numerical(),
            field("VaccineName", 100, true),
            field("VaccinationIndex", 12, true).numerical(),
            field("MinimumInterval", 11, true).numerical(),
            field("CoverageDuration", 100, true),
            field("Time", 11, true).numerical(),
            field("Description", 200, true),
            field("Series", 100, true),
            field("VaccinationPlanIdentifier", 15, true).numerical(),
            field("PlanVersionID", 12, true).numerical(),
            field("ddvModifiedDate", 25, true),
            field("ddvValidFrom", 25, true),
            field("ddvValidTo", 25, true));

    public static final RecordSpecification VACCINATIONPLANS_RECORD_SPEC = RecordSpecification.createSpecification("ddv_vaccinationplans", "VaccinationPlanIdentifier", 
            field("VaccinationPlanIdentifier", 15, true).numerical(),
            field("VersionID", 12, true).numerical(),
            field("Active", 1, true).numerical(),
            field("Name", 60, true),
            field("UsableFrom", 25, true),
            field("UsableTo", 25, true),
            field("AllocationMethod", 1, true),
            field("Sex", 1, true),
            field("BirthCohorteFrom", 25, true),
            field("BirthCohorteTo", 25, true),
            field("AgeIntervalFrom", 11, true).numerical(),
            field("AgeIntervalTo", 11, true).numerical(),
            field("ddvModifiedDate", 25, true),
            field("ddvValidFrom", 25, true),
            field("ddvValidTo", 25, true));

    public static final RecordSpecification VACCINES_RECORD_SPEC = RecordSpecification.createSpecification("ddv_vaccines", "VaccineIdentifier", 
            field("VaccineIdentifier", 15, true).numerical(),
            field("VersionID", 12, true).numerical(),
            field("ATCCode", 10, true),
            field("ATCText", 72, true),
            field("ShortDescription", 100, true),
            field("AllowCitizenSelfRegister", 1, true).numerical(),
            field("AllowBulkRegister", 1, true).numerical(),
            field("Keywords", 2000, true),
            field("SearchBoost", 8, true).decimal10_3(),
            field("ddvModifiedDate", 25, true),
            field("ddvValidFrom", 25, true),
            field("ddvValidTo", 25, true));

    public static final RecordSpecification VACCINESDRUGS_RECORD_SPEC = RecordSpecification.createSpecification("ddv_vaccinesdrugs", "VaccineIdentifier", 
            field("VaccineIdentifier", 15, true).numerical(),
            field("VersionID", 12, true).numerical(),
            field("DrugIdentifier", 15, true).numerical(),
            field("DrugName", 30, true),
            field("ddvModifiedDate", 25, true),
            field("ddvValidFrom", 25, true),
            field("ddvValidTo", 25, true));
}
