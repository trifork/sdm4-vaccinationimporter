/*
Modify all tables to use VARCHAR for ddv-date columns. If not the Atom feed output from SKRS will be in the MySQL datetime format.
ValidTo, ValidFrom and ModifiedDate is handled specially by the Atom feed generator and the output is formatted correctly.
 */

ALTER TABLE ddv_diseases MODIFY ddvModifiedDate VARCHAR(24) NOT NULL, MODIFY ddvValidFrom VARCHAR(24) NOT NULL, MODIFY ddvValidTo VARCHAR(24);

ALTER TABLE ddv_diseases_vaccines MODIFY ddvModifiedDate VARCHAR(24) NOT NULL, MODIFY ddvValidFrom VARCHAR(24) NOT NULL, MODIFY ddvValidTo VARCHAR(24);

ALTER TABLE ddv_dosageoptions MODIFY ddvModifiedDate VARCHAR(24) NOT NULL, MODIFY ddvValidFrom VARCHAR(24) NOT NULL, MODIFY ddvValidTo VARCHAR(24);

ALTER TABLE ddv_ssidrugs MODIFY ddvModifiedDate VARCHAR(24) NOT NULL, MODIFY ddvValidFrom VARCHAR(24) NOT NULL, MODIFY ddvValidTo VARCHAR(24);

ALTER TABLE ddv_vaccinationplanitems MODIFY ddvModifiedDate VARCHAR(24) NOT NULL, MODIFY ddvValidFrom VARCHAR(24) NOT NULL, MODIFY ddvValidTo VARCHAR(24);

ALTER TABLE ddv_vaccinationplans MODIFY ddvModifiedDate VARCHAR(24) NOT NULL, MODIFY ddvValidFrom VARCHAR(24) NOT NULL, MODIFY ddvValidTo VARCHAR(24);

ALTER TABLE ddv_vaccines MODIFY ddvModifiedDate VARCHAR(24) NOT NULL, MODIFY ddvValidFrom VARCHAR(24) NOT NULL, MODIFY ddvValidTo VARCHAR(24);

ALTER TABLE ddv_vaccinesdrugs MODIFY ddvModifiedDate VARCHAR(24) NOT NULL, MODIFY ddvValidFrom VARCHAR(24) NOT NULL, MODIFY ddvValidTo VARCHAR(24);

