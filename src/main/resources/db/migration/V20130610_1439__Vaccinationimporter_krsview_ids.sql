
-- ddv_diseases
INSERT IGNORE INTO SKRSColumns
(viewMap, isPID, tableColumnName, feedColumnName, feedPosition, dataType, maxLength) VALUES
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='diseases' AND version=1),
 0, 'Id', 'Id', 0, 12, 32);

-- ddv_diseases_vaccines
INSERT IGNORE INTO SKRSColumns
(viewMap, isPID, tableColumnName, feedColumnName, feedPosition, dataType, maxLength) VALUES
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='diseases_vaccines' AND version=1),
 0, 'Id', 'Id', 0, 12, 32);

-- ddv_dosageoptions
INSERT IGNORE INTO SKRSColumns
(viewMap, isPID, tableColumnName, feedColumnName, feedPosition, dataType, maxLength) VALUES
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='dosageoptions' AND version=1),
 0, 'Id', 'Id', 0, 12, 32);

-- ddv_ssidrugs
INSERT IGNORE INTO SKRSColumns
(viewMap, isPID, tableColumnName, feedColumnName, feedPosition, dataType, maxLength) VALUES
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='ssidrugs' AND version=1),
 0, 'Id', 'Id', 0, 12, 32);

-- ddv_vaccinationplanitems
INSERT IGNORE INTO SKRSColumns
(viewMap, isPID, tableColumnName, feedColumnName, feedPosition, dataType, maxLength) VALUES
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplanitems' AND version=1),
 0, 'Id', 'Id', 0, 12, 32);

-- ddv_vaccinationplans
INSERT IGNORE INTO SKRSColumns
(viewMap, isPID, tableColumnName, feedColumnName, feedPosition, dataType, maxLength) VALUES
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplan' AND version=1),
 0, 'Id', 'Id', 0, 12, 32);

-- ddv_vaccines
INSERT IGNORE INTO SKRSColumns
(viewMap, isPID, tableColumnName, feedColumnName, feedPosition, dataType, maxLength) VALUES
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccines' AND version=1),
 0, 'Id', 'Id', 0, 12, 32);

-- ddv_vaccinesdrugs
INSERT IGNORE INTO SKRSColumns
(viewMap, isPID, tableColumnName, feedColumnName, feedPosition, dataType, maxLength) VALUES
((SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccines_drugs' AND version=1),
 0, 'Id', 'Id', 0, 12, 32);
