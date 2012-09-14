package dk.nsi.sdm4.vaccination.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(name="Vaccine", namespace="")
public class Vaccine {

    String ddvModifiedDate;
    String ddvValidFrom;
    String ddvValidTo;

    long vaccineIdentifier;
    long versionID;
    String aTCCode;
    String aTCText;
    String shortDescription;
    long allowCitizenSelfRegister;
    long allowBulkRegister;
    String keywords;
    double SearchBoost;

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
    
    @XmlElement(name="vaccineIdentifier")
    public long getVaccineIdentifier() {
        return vaccineIdentifier;
    }
    public void setVaccineIdentifier(long vaccineIdentifier) {
        this.vaccineIdentifier = vaccineIdentifier;
    }
    @XmlElement(name="versionId")
    public long getVersionID() {
        return versionID;
    }
    public void setVersionID(long versionID) {
        this.versionID = versionID;
    }
    @XmlElement(name="atcCode")
    public String getaTCCode() {
        return aTCCode;
    }
    public void setaTCCode(String aTCCode) {
        this.aTCCode = aTCCode;
    }
    @XmlElement(name="atcText")
    public String getaTCText() {
        return aTCText;
    }
    public void setaTCText(String aTCText) {
        this.aTCText = aTCText;
    }
    @XmlElement(name="shortDescription")
    public String getShortDescription() {
        return shortDescription;
    }
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
    @XmlElement(name="allowCitizenSelfRegister")
    public long getAllowCitizenSelfRegister() {
        return allowCitizenSelfRegister;
    }
    public void setAllowCitizenSelfRegister(long allowCitizenSelfRegister) {
        this.allowCitizenSelfRegister = allowCitizenSelfRegister;
    }
    @XmlElement(name="allowBulkRegister")
    public long getAllowBulkRegister() {
        return allowBulkRegister;
    }
    public void setAllowBulkRegister(long allowBulkRegister) {
        this.allowBulkRegister = allowBulkRegister;
    }
    @XmlElement(name="keywords")
    public String getKeywords() {
        return keywords;
    }
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }
    @XmlElement(name="searchBoost")
    public double getSearchBoost() {
        return SearchBoost;
    }
    public void setSearchBoost(double searchBoost) {
        SearchBoost = searchBoost;
    }
    
} 