 CREATE TABLE IF NOT EXISTS ddv_diseases (
    PID BIGINT(15) AUTO_INCREMENT NOT NULL PRIMARY KEY,
    DiseaseIdentifier BIGINT(15),
    versionID BIGINT(12),
    name VARCHAR(100),
    name_dk VARCHAR(100),
    ATCCode VARCHAR(10),
    ATCText VARCHAR(72),

    ddvModifiedDate DATETIME,
    ddvValidFrom DATETIME,
    ddvValidTo DATETIME,

    ModifiedDate DATETIME NOT NULL,
    ValidFrom DATETIME NOT NULL,
    ValidTo DATETIME,

    INDEX (DiseaseIdentifier, ValidTo, ValidFrom)
) ENGINE=InnoDB COLLATE=utf8_bin;


 CREATE TABLE IF NOT EXISTS ddv_diseases_vaccines (
    PID BIGINT(15) AUTO_INCREMENT NOT NULL PRIMARY KEY,
    VaccineIdentifier BIGINT(15),
    VaccineVersion BIGINT(12),
    DiseaseIdentifier BIGINT(15),
    DiseaseVersion BIGINT(12),

    ddvModifiedDate DATETIME,
    ddvValidFrom DATETIME,
    ddvValidTo DATETIME,

    ModifiedDate DATETIME NOT NULL,
    ValidFrom DATETIME NOT NULL,
    ValidTo DATETIME,

    INDEX (VaccineIdentifier, DiseaseIdentifier, ValidTo, ValidFrom)
) ENGINE=InnoDB COLLATE=utf8_bin;

 CREATE TABLE IF NOT EXISTS ddv_dosageoptions (
    PID BIGINT(15) AUTO_INCREMENT NOT NULL PRIMARY KEY,
    DosageoptionIdentifier BIGINT(15),
    VersionID BIGINT(12),
    DrugIdentifier BIGINT(15),
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

 CREATE TABLE IF NOT EXISTS ddv_ssidrugs (
    PID BIGINT(15) AUTO_INCREMENT NOT NULL PRIMARY KEY,
    DrugIdentifier BIGINT(15),
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

 CREATE TABLE IF NOT EXISTS ddv_vaccinationplanitems (
    PID BIGINT(15) AUTO_INCREMENT NOT NULL PRIMARY KEY,
    VaccinationPlanItemIdentifier BIGINT(15),
    VersionID BIGINT(12),
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

 CREATE TABLE IF NOT EXISTS ddv_vaccinationplans (
    PID BIGINT(15) AUTO_INCREMENT NOT NULL PRIMARY KEY,
    VaccinationPlanIdentifier BIGINT(15),
    VersionID BIGINT(12),
    Active BIGINT(1),
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

 CREATE TABLE IF NOT EXISTS ddv_vaccines (
    PID BIGINT(15) AUTO_INCREMENT NOT NULL PRIMARY KEY,
    VaccineIdentifier BIGINT(15),
    VersionID BIGINT(12),
    ATCCode VARCHAR(10),
    ATCText VARCHAR(72),
    ShortDescription VARCHAR(100),
    AllowCitizenSelfRegister BIGINT(1),
    AllowBulkRegister BIGINT(1),
    Keywords VARCHAR(2000),
    SearchBoost DECIMAL(8,3) UNSIGNED,

    ddvModifiedDate DATETIME,
    ddvValidFrom DATETIME,
    ddvValidTo DATETIME,

    ModifiedDate DATETIME NOT NULL,
    ValidFrom DATETIME NOT NULL,
    ValidTo DATETIME,

    INDEX (VaccineIdentifier, ValidTo, ValidFrom)
) ENGINE=InnoDB COLLATE=utf8_bin;

 CREATE TABLE IF NOT EXISTS ddv_vaccinesdrugs (
    PID BIGINT(15) AUTO_INCREMENT NOT NULL PRIMARY KEY,
    VaccineIdentifier BIGINT(15),
    VersionID BIGINT(12),
    DrugIdentifier BIGINT(15),
    DrugName VARCHAR(30),

    ddvModifiedDate DATETIME,
    ddvValidFrom DATETIME,
    ddvValidTo DATETIME,

    ModifiedDate DATETIME NOT NULL,
    ValidFrom DATETIME NOT NULL,
    ValidTo DATETIME,

    INDEX (VaccineIdentifier, ValidTo, ValidFrom)
) ENGINE=InnoDB COLLATE=utf8_bin;

