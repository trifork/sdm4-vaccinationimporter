
-- -----------------------------------------------------
-- Someone has to create the SKRS tables first time
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SKRSViewMapping` (
  `idSKRSViewMapping` BIGINT(15) NOT NULL AUTO_INCREMENT ,
  `register` VARCHAR(255) NOT NULL ,
  `datatype` VARCHAR(255) NOT NULL ,
  `version` INT NOT NULL ,
  `tableName` VARCHAR(255) NOT NULL ,
  `createdDate` TIMESTAMP NOT NULL ,
  PRIMARY KEY (`idSKRSViewMapping`) ,
  INDEX `idx` (`register` ASC, `datatype` ASC, `version` ASC) ,
  UNIQUE INDEX `unique` (`register` ASC, `datatype` ASC, `version` ASC) )
  ENGINE = InnoDB;
CREATE  TABLE IF NOT EXISTS `SKRSColumns` (
  `idSKRSColumns` BIGINT(15) NOT NULL AUTO_INCREMENT ,
  `viewMap` BIGINT(15) NOT NULL ,
  `isPID` TINYINT NOT NULL ,
  `tableColumnName` VARCHAR(255) NOT NULL ,
  `feedColumnName` VARCHAR(255) NULL ,
  `feedPosition` INT NOT NULL ,
  `dataType` INT NOT NULL ,
  `maxLength` INT NULL ,
  PRIMARY KEY (`idSKRSColumns`) ,
  INDEX `viewMap_idx` (`viewMap` ASC) ,
  UNIQUE INDEX `viewColumn` (`tableColumnName` ASC, `viewMap` ASC) ,
  CONSTRAINT `viewMap`
  FOREIGN KEY (`viewMap` )
  REFERENCES `SKRSViewMapping` (`idSKRSViewMapping` )
    ON DELETE CASCADE
    ON UPDATE NO ACTION)
  ENGINE = InnoDB;


-- ---------------------------------------------------------------------------------------------------------------------
-- Vaccination
INSERT IGNORE INTO SKRSViewMapping (register, datatype, version, tableName, createdDate) VALUES ('ddv', 'diseases', 1, 'ddv_diseases', NOW());
INSERT IGNORE INTO SKRSColumns (viewMap, isPID, tableColumnName, feedColumnName, feedPosition, dataType, maxLength) VALUES
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='diseases' AND version=1), 1, 'PID',                              NULL, 0, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='diseases' AND version=1), 0, 'DiseaseIdentifier', 'DiseaseIdentifier', 1, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='diseases' AND version=1), 0, 'versionID',                 'versionID', 2, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='diseases' AND version=1), 0, 'name',                           'name', 3, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='diseases' AND version=1), 0, 'name_dk',                     'name_dk', 4, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='diseases' AND version=1), 0, 'ATCCode',                     'ATCCode', 5, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='diseases' AND version=1), 0, 'ATCText',                     'ATCText', 6, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='diseases' AND version=1), 0, 'ddvModifiedDate',     'ddvModifiedDate', 7, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='diseases' AND version=1), 0, 'ddvValidFrom',           'ddvValidFrom', 8, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='diseases' AND version=1), 0, 'ddvValidTo',               'ddvValidTo', 9, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='diseases' AND version=1), 0, 'ModifiedDate',                     NULL, 0, 93, 12),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='diseases' AND version=1), 0, 'ValidFrom',                 'ValidFrom',10, 93, 12),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='diseases' AND version=1), 0, 'ValidTo',                     'ValidTo',11, 93, 12);

INSERT IGNORE INTO SKRSViewMapping (register, datatype, version, tableName, createdDate) VALUES ('ddv', 'diseases_vaccines', 1, 'ddv_diseases_vaccines', NOW());
INSERT IGNORE INTO SKRSColumns (viewMap, isPID, tableColumnName, feedColumnName, feedPosition, dataType, maxLength) VALUES
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='diseases_vaccines' AND version=1), 1, 'PID',                              NULL, 0, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='diseases_vaccines' AND version=1), 0, 'VaccineIdentifier', 'VaccineIdentifier', 1, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='diseases_vaccines' AND version=1), 0, 'VaccineVersion',       'VaccineVersion', 2, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='diseases_vaccines' AND version=1), 0, 'DiseaseIdentifier', 'DiseaseIdentifier', 3, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='diseases_vaccines' AND version=1), 0, 'DiseaseVersion',       'DiseaseVersion', 4, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='diseases_vaccines' AND version=1), 0, 'ddvModifiedDate',     'ddvModifiedDate', 5, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='diseases_vaccines' AND version=1), 0, 'ddvValidFrom',           'ddvValidFrom', 6, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='diseases_vaccines' AND version=1), 0, 'ddvValidTo',               'ddvValidTo', 7, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='diseases_vaccines' AND version=1), 0, 'ModifiedDate',                     NULL, 0, 93, 12),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='diseases_vaccines' AND version=1), 0, 'ValidFrom',                 'ValidFrom', 8, 93, 12),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='diseases_vaccines' AND version=1), 0, 'ValidTo',                     'ValidTo', 9, 93, 12);

INSERT IGNORE INTO SKRSViewMapping (register, datatype, version, tableName, createdDate) VALUES ('ddv', 'dosageoptions', 1, 'ddv_dosageoptions', NOW());
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='dosageoptions' AND version=1), 0, 'DosageoptionIdentifier', 'DosageoptionIdentifier', 1, -5, NULL),
INSERT IGNORE INTO SKRSColumns (viewMap, isPID, tableColumnName, feedColumnName, feedPosition, dataType, maxLength) VALUES
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='dosageoptions' AND version=1), 1, 'PID',                                        NULL, 0, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='dosageoptions' AND version=1), 0, 'VersionID',                           'VersionID', 2, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='dosageoptions' AND version=1), 0, 'DrugIdentifier',                 'DrugIdentifier', 3, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='dosageoptions' AND version=1), 0, 'DrugName',                             'DrugName', 4, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='dosageoptions' AND version=1), 0, 'DosageText',                         'DosageText', 5, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='dosageoptions' AND version=1), 0, 'ddvModifiedDate',               'ddvModifiedDate', 6, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='dosageoptions' AND version=1), 0, 'ddvValidFrom',                     'ddvValidFrom', 7, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='dosageoptions' AND version=1), 0, 'ddvValidTo',                         'ddvValidTo', 8, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='dosageoptions' AND version=1), 0, 'ModifiedDate',                               NULL, 0, 93, 12),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='dosageoptions' AND version=1), 0, 'ValidFrom',                           'ValidFrom', 9, 93, 12),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='dosageoptions' AND version=1), 0, 'ValidTo',                               'ValidTo',10, 93, 12);

INSERT IGNORE INTO SKRSViewMapping (register, datatype, version, tableName, createdDate) VALUES ('ddv', 'ssidrugs', 1, 'ddv_ssidrugs', NOW());
INSERT IGNORE INTO SKRSColumns (viewMap, isPID, tableColumnName, feedColumnName, feedPosition, dataType, maxLength) VALUES
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='ssidrugs' AND version=1), 1, 'PID',                         NULL, 0, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='ssidrugs' AND version=1), 0, 'DrugIdentifier',  'DrugIdentifier', 1, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='ssidrugs' AND version=1), 0, 'VersionID',            'VersionID', 2, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='ssidrugs' AND version=1), 0, 'Name',                      'Name', 3, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='ssidrugs' AND version=1), 0, 'FormTekst',            'FormTekst', 4, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='ssidrugs' AND version=1), 0, 'ATCCode',                'ATCCode', 5, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='ssidrugs' AND version=1), 0, 'ATCText',                'ATCText', 6, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='ssidrugs' AND version=1), 0, 'StyrkeTekst',        'StyrkeTekst', 7, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='ssidrugs' AND version=1), 0, 'UsableFrom',          'UsableFrom', 8, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='ssidrugs' AND version=1), 0, 'UsableTo',              'UsableTo', 9, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='ssidrugs' AND version=1), 0, 'ddvModifiedDate','ddvModifiedDate',10, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='ssidrugs' AND version=1), 0, 'ddvValidFrom',      'ddvValidFrom',11, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='ssidrugs' AND version=1), 0, 'ddvValidTo',          'ddvValidTo',12, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='ssidrugs' AND version=1), 0, 'ModifiedDate',                NULL, 0, 93, 12),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='ssidrugs' AND version=1), 0, 'ValidFrom',            'ValidFrom',13, 93, 12),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='ssidrugs' AND version=1), 0, 'ValidTo',                'ValidTo',14, 93, 12);

INSERT IGNORE INTO SKRSViewMapping (register, datatype, version, tableName, createdDate) VALUES ('ddv', 'vaccinationplanitems', 1, 'ddv_vaccinationplanitems', NOW());
INSERT IGNORE INTO SKRSColumns (viewMap, isPID, tableColumnName, feedColumnName, feedPosition, dataType, maxLength) VALUES
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplanitems' AND version=1), 1, 'PID',                                                     NULL, 0, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplanitems' AND version=1), 0, 'VaccinationPlanItemIdentifier','VaccinationPlanItemIdentifier', 1, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplanitems' AND version=1), 0, 'VersionID',                                        'VersionID', 2, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplanitems' AND version=1), 0, 'VaccineIdentifier',                        'VaccineIdentifier', 3, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplanitems' AND version=1), 0, 'VaccineName',                                    'VaccineName', 4, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplanitems' AND version=1), 0, 'VaccinationIndex',                          'VaccinationIndex', 5, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplanitems' AND version=1), 0, 'MinimumInterval',                            'MinimumInterval', 6, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplanitems' AND version=1), 0, 'CoverageDuration',                          'CoverageDuration', 7, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplanitems' AND version=1), 0, 'Time',                                                  'Time', 8, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplanitems' AND version=1), 0, 'Description',                                    'Description', 9, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplanitems' AND version=1), 0, 'Series',                                              'Series',10, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplanitems' AND version=1), 0, 'VaccinationPlanIdentifier',        'VaccinationPlanIdentifier',11, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplanitems' AND version=1), 0, 'PlanVersionID',                                'PlanVersionID',12, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplanitems' AND version=1), 0, 'ddvModifiedDate',                            'ddvModifiedDate',13, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplanitems' AND version=1), 0, 'ddvValidFrom',                                  'ddvValidFrom',14, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplanitems' AND version=1), 0, 'ddvValidTo',                                      'ddvValidTo',15, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplanitems' AND version=1), 0, 'ModifiedDate',                                            NULL, 0, 93, 12),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplanitems' AND version=1), 0, 'ValidFrom',                                        'ValidFrom',16, 93, 12),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplanitems' AND version=1), 0, 'ValidTo',                                            'ValidTo',17, 93, 12);

INSERT IGNORE INTO SKRSViewMapping (register, datatype, version, tableName, createdDate) VALUES ('ddv', 'vaccinationplan', 1, 'ddv_vaccinationplans', NOW());
INSERT IGNORE INTO SKRSColumns (viewMap, isPID, tableColumnName, feedColumnName, feedPosition, dataType, maxLength) VALUES
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplan' AND version=1), 1, 'PID',                         NULL, 0, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplan' AND version=1), 0, 'VaccinationPlanIdentifier','VaccinationPlanIdentifier', 1, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplan' AND version=1), 0, 'VersionID',                                'VersionID', 2, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplan' AND version=1), 0, 'Active',                                      'Active', 3, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplan' AND version=1), 0, 'Name',                                          'Name', 4, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplan' AND version=1), 0, 'UsableFrom',                              'UsableFrom', 5, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplan' AND version=1), 0, 'UsableTo',                                  'UsableTo', 6, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplan' AND version=1), 0, 'AllocationMethod',                  'AllocationMethod', 7, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplan' AND version=1), 0, 'Sex',                                            'Sex', 8, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplan' AND version=1), 0, 'BirthCohorteFrom',                  'BirthCohorteFrom', 9, 93, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplan' AND version=1), 0, 'BirthCohorteTo',                      'BirthCohorteTo',10, 93, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplan' AND version=1), 0, 'AgeIntervalFrom',                    'AgeIntervalFrom',11, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplan' AND version=1), 0, 'AgeIntervalTo',                        'AgeIntervalTo',12, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplan' AND version=1), 0, 'ddvModifiedDate',                    'ddvModifiedDate',13, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplan' AND version=1), 0, 'ddvValidFrom',                          'ddvValidFrom',14, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplan' AND version=1), 0, 'ddvValidTo',                              'ddvValidTo',15, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplan' AND version=1), 0, 'ModifiedDate',                                    NULL, 0, 93, 12),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplan' AND version=1), 0, 'ValidFrom',                                'ValidFrom',16, 93, 12),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplan' AND version=1), 0, 'ValidTo',                                    'ValidTo',17, 93, 12);

INSERT IGNORE INTO SKRSViewMapping (register, datatype, version, tableName, createdDate) VALUES ('ddv', 'vaccines', 1, 'ddv_vaccines', NOW());
INSERT IGNORE INTO SKRSColumns (viewMap, isPID, tableColumnName, feedColumnName, feedPosition, dataType, maxLength) VALUES
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccines' AND version=1), 1, 'PID',                                            NULL, 0, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccines' AND version=1), 0, 'VaccineIdentifier',               'VaccineIdentifier', 1, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccines' AND version=1), 0, 'VersionID',                               'VersionID', 2, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccines' AND version=1), 0, 'ATCCode',                                   'ATCCode', 3, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccines' AND version=1), 0, 'ATCText',                                   'ATCText', 4, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccines' AND version=1), 0, 'ShortDescription',                 'ShortDescription', 5, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccines' AND version=1), 0, 'AllowCitizenSelfRegister', 'AllowCitizenSelfRegister', 6, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccines' AND version=1), 0, 'AllowBulkRegister',               'AllowBulkRegister', 7, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccines' AND version=1), 0, 'Keywords',                                 'Keywords', 8, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccines' AND version=1), 0, 'SearchBoost',                           'SearchBoost', 9,  3, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccines' AND version=1), 0, 'ddvModifiedDate',                   'ddvModifiedDate',10, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccines' AND version=1), 0, 'ddvValidFrom',                         'ddvValidFrom',11, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccines' AND version=1), 0, 'ddvValidTo',                             'ddvValidTo',12, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccines' AND version=1), 0, 'ModifiedDate',                                   NULL, 0, 93, 12),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccines' AND version=1), 0, 'ValidFrom',                               'ValidFrom',13, 93, 12),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccines' AND version=1), 0, 'ValidTo',                                   'ValidTo',14, 93, 12);

INSERT IGNORE INTO SKRSViewMapping (register, datatype, version, tableName, createdDate) VALUES ('ddv', 'vaccines_drugs', 1, 'ddv_vaccinesdrugs', NOW());
INSERT IGNORE INTO SKRSColumns (viewMap, isPID, tableColumnName, feedColumnName, feedPosition, dataType, maxLength) VALUES
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccines_drugs' AND version=1), 1, 'PID',                              NULL, 0, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccines_drugs' AND version=1), 0, 'VaccineIdentifier', 'VaccineIdentifier', 1, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccines_drugs' AND version=1), 0, 'VersionID',                 'VersionID', 2, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccines_drugs' AND version=1), 0, 'DrugIdentifier',       'DrugIdentifier', 3, -5, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccines_drugs' AND version=1), 0, 'DrugName',                   'DrugName', 4, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccines_drugs' AND version=1), 0, 'ddvModifiedDate',     'ddvModifiedDate', 5, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccines_drugs' AND version=1), 0, 'ddvValidFrom',           'ddvValidFrom', 6, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccines_drugs' AND version=1), 0, 'ddvValidTo',               'ddvValidTo', 7, 12, NULL),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccines_drugs' AND version=1), 0, 'ModifiedDate',                     NULL, 0, 93, 12),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccines_drugs' AND version=1), 0, 'ValidFrom',                 'ValidFrom', 8, 93, 12),
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccines_drugs' AND version=1), 0, 'ValidTo',                     'ValidTo', 9, 93, 12);
