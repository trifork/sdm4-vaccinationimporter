CREATE TABLE diseases (
    DiseaseIdentifier BIGINT(15) AUTO_INCREMENT NOT NULL PRIMARY KEY,
    versionID BIGINT(12),
    name VARCHAR(100),
    name_dk VARCHAR(100),
    ATCCode VARCHAR(7),
    ATCText VARCHAR(72),

    ddvModifiedDate DATETIME,
    ddvValidFrom DATETIME,
    ddvValidTo DATETIME,

    ModifiedDate DATETIME NOT NULL,
    ValidFrom DATETIME NOT NULL,
    ValidTo DATETIME,

    INDEX (DiseaseIdentifier, ValidTo, ValidFrom)
) ENGINE=InnoDB COLLATE=utf8_bin;


CREATE TABLE diseases_vaccines (
    VaccineIdentifier BIGINT(15) AUTO_INCREMENT NOT NULL PRIMARY KEY,
    VaccineVersion BIGINT(12),
    DiseaseIdentifier BIGINT(15),
    DiseaseVersion BIGINT(12),

    ddvModifiedDate DATETIME,
    ddvValidFrom DATETIME,
    ddvValidTo DATETIME,

    ModifiedDate DATETIME NOT NULL,
    ValidFrom DATETIME NOT NULL,
    ValidTo DATETIME,

    INDEX (VaccineIdentifier, ValidTo, ValidFrom)
) ENGINE=InnoDB COLLATE=utf8_bin;

CREATE TABLE dosageoptions (
    DosageoptionIdentifier BIGINT(15) AUTO_INCREMENT NOT NULL PRIMARY KEY,
    VersionID BIGINT(12),
    DrugIdentifier BIGINT(12),
    DrugName VARCHAR(30),
    DosageText VARCHAR(100),

    ddvModifiedDate DATETIME,
    ddvValidFrom DATETIME,
    ddvValidTo DATETIME,

    ModifiedDate DATETIME NOT NULL,
    ValidFrom DATETIME NOT NULL,
    ValidTo DATETIME,

    INDEX (DosageoptionIdentifier, ValidTo, ValidFrom)
) ENGINE=InnoDB COLLATE=utf8_bin;

CREATE TABLE services (
    ServiceIdentifier BIGINT(15) AUTO_INCREMENT NOT NULL PRIMARY KEY,
    VersionID BIGINT(12),
    Number VARCHAR(4),
    Description VARCHAR(40),
    UsableFrom DATETIME,
    UsableTo DATETIME,
    PrimaryVaccineIdentifier BIGINT(15),
    PrimaryVaccineVersionID BIGINT(12),
    SecondaryVaccineIdentifier BIGINT(15),
    SecondaryVaccineVersionID BIGINT(12),

    ddvModifiedDate DATETIME,
    ddvValidFrom DATETIME,
    ddvValidTo DATETIME,

    ModifiedDate DATETIME NOT NULL,
    ValidFrom DATETIME NOT NULL,
    ValidTo DATETIME,

    INDEX (ServiceIdentifier, ValidTo, ValidFrom)
) ENGINE=InnoDB COLLATE=utf8_bin;

CREATE TABLE ssidrugs (
    DrugIdentifier BIGINT(15) AUTO_INCREMENT NOT NULL PRIMARY KEY,
    VersionID BIGINT(12),
    Name VARCHAR(30),
    FormTekst VARCHAR(150),
    ATCCode VARCHAR(10),
    ATCText VARCHAR(100),
    StyrkeTekst VARCHAR(30),
    UsableFrom DATETIME,
    UsableTo DATETIME,

    ddvModifiedDate DATETIME,
    ddvValidFrom DATETIME,
    ddvValidTo DATETIME,

    ModifiedDate DATETIME NOT NULL,
    ValidFrom DATETIME NOT NULL,
    ValidTo DATETIME,

    INDEX (DrugIdentifier, ValidTo, ValidFrom)
) ENGINE=InnoDB COLLATE=utf8_bin;


CREATE TABLE ssidrugs_lmsdrugs (
    SSIDrugIdentifier BIGINT(15) AUTO_INCREMENT NOT NULL PRIMARY KEY,
    LMSDrugID BIGINT(12),
    SSIDrugVersion INT(1),

    ddvModifiedDate DATETIME,
    ddvValidFrom DATETIME,
    ddvValidTo DATETIME,

    ModifiedDate DATETIME NOT NULL,
    ValidFrom DATETIME NOT NULL,
    ValidTo DATETIME,

    INDEX (SSIDrugIdentifier, ValidTo, ValidFrom)
) ENGINE=InnoDB COLLATE=utf8_bin;

CREATE TABLE vaccinationplanitems (
    VaccinationPlanItemIdentifier BIGINT(15) AUTO_INCREMENT NOT NULL PRIMARY KEY,
    VersionID BIGINT(10),
    VaccineIdentifier BIGINT(15),
    VaccineName VARCHAR(100),
    VaccinationIndex BIGINT(12),
    MinimumInterval BIGINT(11),
    CoverageDuration VARCHAR(100),
    Time BIGINT(11),
    Description VARCHAR(200),
    Series VARCHAR(100),
    VaccinationPlanIdentifier BIGINT(15),
    PlanVersionID BIGINT(12),

    ddvModifiedDate DATETIME,
    ddvValidFrom DATETIME,
    ddvValidTo DATETIME,

    ModifiedDate DATETIME NOT NULL,
    ValidFrom DATETIME NOT NULL,
    ValidTo DATETIME,

    INDEX (VaccinationPlanItemIdentifier, ValidTo, ValidFrom)
) ENGINE=InnoDB COLLATE=utf8_bin;

CREATE TABLE vaccinationplans (
    VaccinationPlanIdentifier BIGINT(15) AUTO_INCREMENT NOT NULL PRIMARY KEY,
    VersionID BIGINT(10),
    Active INT(1),
    Name VARCHAR(60),
    UsableFrom DATETIME,
    UsableTo DATETIME,
    AllocationMethod VARCHAR(1),
    Sex VARCHAR(1),
    BirthCohorteFrom DATETIME,
    BirthCohorteTo DATETIME,
    AgeIntervalFrom BIGINT(11),
    AgeIntervalTo BIGINT(11),

    ddvModifiedDate DATETIME,
    ddvValidFrom DATETIME,
    ddvValidTo DATETIME,

    ModifiedDate DATETIME NOT NULL,
    ValidFrom DATETIME NOT NULL,
    ValidTo DATETIME,

    INDEX (VaccinationPlanIdentifier, ValidTo, ValidFrom)
) ENGINE=InnoDB COLLATE=utf8_bin;

CREATE TABLE vaccines (
    VaccineIdentifier BIGINT(15) AUTO_INCREMENT NOT NULL PRIMARY KEY,
    VersionID BIGINT(12),
    ATCCode VARCHAR(8),
    ATCText VARCHAR(72),
    ShortDescription VARCHAR(100),
    AllowCitizenSelfRegister INT(1),
    AllowBulkRegister INT(1),
    Keywords VARCHAR(2000),
    SearchBoost DECIMAL(8,2) UNSIGNED,

    ddvModifiedDate DATETIME,
    ddvValidFrom DATETIME,
    ddvValidTo DATETIME,

    ModifiedDate DATETIME NOT NULL,
    ValidFrom DATETIME NOT NULL,
    ValidTo DATETIME,

    INDEX (VaccineIdentifier, ValidTo, ValidFrom)
) ENGINE=InnoDB COLLATE=utf8_bin;

CREATE TABLE vaccinesdrugs (
    VaccineIdentifier BIGINT(15) AUTO_INCREMENT NOT NULL PRIMARY KEY,
    VersionID BIGINT(12),
    DrugIdentifier BIGINT(12),
    DrugName VARCHAR(30),

    ddvModifiedDate DATETIME,
    ddvValidFrom DATETIME,
    ddvValidTo DATETIME,

    ModifiedDate DATETIME NOT NULL,
    ValidFrom DATETIME NOT NULL,
    ValidTo DATETIME,

    INDEX (VaccineIdentifier, ValidTo, ValidFrom)
) ENGINE=InnoDB COLLATE=utf8_bin;

