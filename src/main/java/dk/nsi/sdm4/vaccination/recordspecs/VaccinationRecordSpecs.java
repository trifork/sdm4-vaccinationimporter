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
    
    public static final RecordSpecification DISEASES_RECORD_SPEC =
            RecordSpecification.createSpecification("ddv_diseases", "Id",
                field("Id", 32, true).calculated(),
                field("DiseaseIdentifier", 15, false).numerical(),
                field("versionID", 12, false).numerical(),
                field("name", 100, false),
                field("name_dk", 100, false),
                field("ATCCode", 10, true),
                field("ATCText", 72, true),
                field("ddvModifiedDate", 25, false).datetime(),
                field("ddvValidFrom", 25, false).datetime(),
                field("ddvValidTo", 25, false).datetime());

    public static final RecordSpecification DISEASESVACCINES_RECORD_SPEC =
            RecordSpecification.createSpecification("ddv_diseases_vaccines", "Id",
                field("Id", 32, true).calculated(),
                field("VaccineIdentifier", 15, false).numerical(),
                field("VaccineVersion", 12, false).numerical(),
                field("DiseaseIdentifier", 15, false).numerical(),
                field("DiseaseVersion", 12, false).numerical(),
                field("ddvModifiedDate", 25, false).datetime(),
                field("ddvValidFrom", 25, false).datetime(),
                field("ddvValidTo", 25, false).datetime());

    public static final RecordSpecification DOSAGEOPTIONS_RECORD_SPEC =
            RecordSpecification.createSpecification("ddv_dosageoptions", "Id",
                field("Id", 32, true).calculated(),
                field("DosageoptionIdentifier", 15, false).numerical(),
                field("VersionID", 12, false).numerical(),
                field("DrugIdentifier", 15, false).numerical(),
                field("DrugName", 30, false),
                field("DosageText", 100, false),
                field("ddvModifiedDate", 25, false).datetime(),
                field("ddvValidFrom", 25, false).datetime(),
                field("ddvValidTo", 25, false).datetime());

    public static final RecordSpecification SSIDRUGS_RECORD_SPEC =
            RecordSpecification.createSpecification("ddv_ssidrugs", "Id",
                field("Id", 32, true).calculated(),
                field("DrugIdentifier", 15, false).numerical(),
                field("VersionID", 12, false).numerical(),
                field("Name", 30, false),
                field("FormTekst", 150, true),
                field("ATCCode", 10, true),
                field("ATCText", 100, true),
                field("StyrkeTekst", 30, true),
                field("UsableFrom", 25, true).datetime(),
                field("UsableTo", 25, true).datetime(),
                field("ddvModifiedDate", 25, false).datetime(),
                field("ddvValidFrom", 25, false).datetime(),
                field("ddvValidTo", 25, false).datetime());

    public static final RecordSpecification VACCINATIONPLANITEMS_RECORD_SPEC =
            RecordSpecification.createSpecification("ddv_vaccinationplanitems", "Id",
                field("Id", 32, true).calculated(),
                field("VaccinationPlanItemIdentifier", 15, false).numerical(),
                field("VersionID", 12, false).numerical(),
                field("VaccineIdentifier", 15, false).numerical(),
                field("VaccineName", 100, false),
                field("VaccinationIndex", 12, false).numerical(),
                field("MinimumInterval", 11, false).numerical(),
                field("CoverageDuration", 100, true),
                field("Time", 11, false).numerical(),
                field("Description", 200, true),
                field("Series", 100, true),
                field("VaccinationPlanIdentifier", 15, false).numerical(),
                field("PlanVersionID", 12, false).numerical(),
                field("ddvModifiedDate", 25, false).datetime(),
                field("ddvValidFrom", 25, false).datetime(),
                field("ddvValidTo", 25, false).datetime());

    public static final RecordSpecification VACCINATIONPLANS_RECORD_SPEC =
            RecordSpecification.createSpecification("ddv_vaccinationplans", "Id",
                field("Id", 32, true).calculated(),
                field("VaccinationPlanIdentifier", 15, false).numerical(),
                field("VersionID", 12, false).numerical(),
                field("Active", 1, false).numerical(),
                field("Name", 60, false),
                field("UsableFrom", 25, true).datetime(),
                field("UsableTo", 25, true).datetime(),
                field("AllocationMethod", 1, false),
                field("Sex", 1, true),
                field("BirthCohorteFrom", 25, true).datetime(),
                field("BirthCohorteTo", 25, true).datetime(),
                field("AgeIntervalFrom", 11, true).numerical(),
                field("AgeIntervalTo", 11, true).numerical(),
                field("ddvModifiedDate", 25, false).datetime(),
                field("ddvValidFrom", 25, false).datetime(),
                field("ddvValidTo", 25, false).datetime());

    public static final RecordSpecification VACCINES_RECORD_SPEC =
            RecordSpecification.createSpecification("ddv_vaccines", "Id",
                field("Id", 32, true).calculated(),
                field("VaccineIdentifier", 15, false).numerical(),
                field("VersionID", 12, false).numerical(),
                field("ATCCode", 10, false),
                field("ATCText", 72, false),
                field("ShortDescription", 100, false),
                field("AllowCitizenSelfRegister", 1, true).numerical(),
                field("AllowBulkRegister", 1, true).numerical(),
                field("Keywords", 2000, true),
                field("SearchBoost", 8, true).decimal10_3(),
                field("ddvModifiedDate", 25, false).datetime(),
                field("ddvValidFrom", 25, false).datetime(),
                field("ddvValidTo", 25, false).datetime());

    public static final RecordSpecification VACCINESDRUGS_RECORD_SPEC =
            RecordSpecification.createSpecification("ddv_vaccinesdrugs", "Id",
                field("Id", 32, true).calculated(),
                field("VaccineIdentifier", 15, false).numerical(),
                field("VersionID", 12, false).numerical(),
                field("DrugIdentifier", 15, false).numerical(),
                field("DrugName", 30, false),
                field("ddvModifiedDate", 25, false).datetime(),
                field("ddvValidFrom", 25, false).datetime(),
                field("ddvValidTo", 25, false).datetime());
}
