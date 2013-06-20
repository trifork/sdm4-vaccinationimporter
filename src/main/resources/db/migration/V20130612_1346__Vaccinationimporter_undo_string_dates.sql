/*
All dates fields were converted into string because of a missing Date type in core, this has been added
  and now we should not use strings for dates
 */

ALTER TABLE ddv_diseases
  MODIFY ddvModifiedDate DATETIME NOT NULL,
  MODIFY ddvValidFrom DATETIME NOT NULL,
  MODIFY ddvValidTo DATETIME;

ALTER TABLE ddv_diseases_vaccines
  MODIFY ddvModifiedDate DATETIME NOT NULL,
  MODIFY ddvValidFrom DATETIME NOT NULL,
  MODIFY ddvValidTo DATETIME;

ALTER TABLE ddv_dosageoptions
  MODIFY ddvModifiedDate DATETIME NOT NULL,
  MODIFY ddvValidFrom DATETIME NOT NULL,
  MODIFY ddvValidTo DATETIME;

ALTER TABLE ddv_ssidrugs
  MODIFY ddvModifiedDate DATETIME NOT NULL,
  MODIFY ddvValidFrom DATETIME NOT NULL,
  MODIFY ddvValidTo DATETIME;

ALTER TABLE ddv_vaccinationplanitems
  MODIFY ddvModifiedDate DATETIME NOT NULL,
  MODIFY ddvValidFrom DATETIME NOT NULL,
  MODIFY ddvValidTo DATETIME;

ALTER TABLE ddv_vaccinationplans
  MODIFY ddvModifiedDate DATETIME NOT NULL,
  MODIFY ddvValidFrom DATETIME NOT NULL,
  MODIFY ddvValidTo DATETIME,
  MODIFY UsableFrom DATETIME,
  MODIFY UsableTo DATETIME;

ALTER TABLE ddv_vaccines
  MODIFY ddvModifiedDate DATETIME NOT NULL,
  MODIFY ddvValidFrom DATETIME NOT NULL,
  MODIFY ddvValidTo DATETIME;

ALTER TABLE ddv_vaccinesdrugs
  MODIFY ddvModifiedDate DATETIME NOT NULL,
  MODIFY ddvValidFrom DATETIME NOT NULL,
  MODIFY ddvValidTo DATETIME;


UPDATE SKRSColumns SET dataType=93 WHERE
  viewMap=(SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='diseases' AND version=1)
  AND tableColumnName='ddvModifiedDate' OR tableColumnName='ddvValidFrom' OR tableColumnName='ddvValidTo';

UPDATE SKRSColumns SET dataType=93 WHERE
  viewMap=(SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='diseases_vaccines' AND version=1)
  AND tableColumnName='ddvModifiedDate' OR tableColumnName='ddvValidFrom' OR tableColumnName='ddvValidTo';

UPDATE SKRSColumns SET dataType=93 WHERE
  viewMap=(SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='dosageoptions' AND version=1)
  AND tableColumnName='ddvModifiedDate' OR tableColumnName='ddvValidFrom' OR tableColumnName='ddvValidTo';

UPDATE SKRSColumns SET dataType=93 WHERE
  viewMap=(SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='ssidrugs' AND version=1)
  AND tableColumnName='ddvModifiedDate' OR tableColumnName='ddvValidFrom' OR tableColumnName='ddvValidTo';

UPDATE SKRSColumns SET dataType=93 WHERE
  viewMap=(SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplanitems' AND version=1)
  AND tableColumnName='ddvModifiedDate' OR tableColumnName='ddvValidFrom' OR tableColumnName='ddvValidTo';

UPDATE SKRSColumns SET dataType=93 WHERE
  viewMap=(SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccinationplan' AND version=1)
  AND tableColumnName='ddvModifiedDate' OR tableColumnName='ddvValidFrom' OR tableColumnName='ddvValidTo' OR tableColumnName='UsableFrom' OR tableColumnName='UsableTo';

UPDATE SKRSColumns SET dataType=93 WHERE
  viewMap=(SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccines' AND version=1)
  AND tableColumnName='ddvModifiedDate' OR tableColumnName='ddvValidFrom' OR tableColumnName='ddvValidTo';

UPDATE SKRSColumns SET dataType=93 WHERE
  viewMap=(SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='vaccines_drugs' AND version=1)
  AND tableColumnName='ddvModifiedDate' OR tableColumnName='ddvValidFrom' OR tableColumnName='ddvValidTo';
