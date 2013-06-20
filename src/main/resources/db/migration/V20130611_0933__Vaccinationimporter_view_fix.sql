UPDATE SKRSColumns SET dataType=12 WHERE
  viewMap=(SELECT idSKRSViewMapping FROM SKRSViewMapping WHERE register='ddv' AND datatype='ssidrugs' AND version=1)
  AND tableColumnName='Name';
