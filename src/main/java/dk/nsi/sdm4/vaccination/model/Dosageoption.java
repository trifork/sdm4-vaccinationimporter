package dk.nsi.sdm4.vaccination.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement
@XmlType(name="Dosageoption", namespace="")
public class Dosageoption {

    long dosageoptionIdentifier;
    long versionID;
    long drugIdentifier;
    String drugName;
    String dosageText;

    String ddvModifiedDate;
    String ddvValidFrom;
    String ddvValidTo;
    

    
    
    @XmlElement(name="modifiedDate")
    public String getDdvModifiedDate() {
        return ddvModifiedDate;
    }
    public void setDdvModifiedDate(String ddvModifiedDate) {
        this.ddvModifiedDate = ddvModifiedDate;
    }
    @XmlElement(name="validFrom")
    public String getDdvValidFrom() {
        return ddvValidFrom;
    }
    public void setDdvValidFrom(String ddvValidFrom) {
        this.ddvValidFrom = ddvValidFrom;
    }
    @XmlElement(name="validTo")
    public String getDdvValidTo() {
        return ddvValidTo;
    }
    public void setDdvValidTo(String ddvValidTo) {
        this.ddvValidTo = ddvValidTo;
    }
    @XmlElement(name="dosageoptionIdentifier")
    public long getDosageoptionIdentifier() {
        return dosageoptionIdentifier;
    }
    public void setDosageoptionIdentifier(long dosageoptionIdentifier) {
        this.dosageoptionIdentifier = dosageoptionIdentifier;
    }
    @XmlElement(name="versionId")
    public long getVersionID() {
        return versionID;
    }
    public void setVersionID(long versionID) {
        this.versionID = versionID;
    }
    @XmlElement(name="drugIdentifier")
    public long getDrugIdentifier() {
        return drugIdentifier;
    }
    public void setDrugIdentifier(long drugIdentifier) {
        this.drugIdentifier = drugIdentifier;
    }
    @XmlElement(name="drugName")
    public String getDrugName() {
        return drugName;
    }
    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }
    @XmlElement(name="dosageText")
    public String getDosageText() {
        return dosageText;
    }
    public void setDosageText(String dosageText) {
        this.dosageText = dosageText;
    }
} 