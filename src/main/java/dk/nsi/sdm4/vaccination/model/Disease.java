package dk.nsi.sdm4.vaccination.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(name="Disease", namespace="")
public class Disease {
    long diseaseIdentifier;
    long versionID;
    String name;
    String name_dk;
    String ATCCode; 
    String ATCText;
    String ddvModifiedDate;
    String ddvValidFrom;
    String ddvValidTo;

    @XmlElement(name="diseaseIdentifier")
    public long getDiseaseIdentifier() {
        return diseaseIdentifier;
    }
    public void setDiseaseIdentifier(long diseaseIdentifier) {
        this.diseaseIdentifier = diseaseIdentifier;
    }
    @XmlElement(name="versionId")
    public long getVersionID() {
        return versionID;
    }
    public void setVersionID(long versionID) {
        this.versionID = versionID;
    }
    @XmlElement(name="name")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @XmlElement(name="nameDk")
    public String getName_dk() {
        return name_dk;
    }
    public void setName_dk(String nameDk) {
        name_dk = nameDk;
    }
    @XmlElement(name="atcCode")
    public String getATCCode() {
        return ATCCode;
    }
    public void setATCCode(String aTCCode) {
        ATCCode = aTCCode;
    }
    @XmlElement(name="atcText")
    public String getATCText() {
        return ATCText;
    }
    public void setATCText(String aTCText) {
        ATCText = aTCText;
    }
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
    
} 