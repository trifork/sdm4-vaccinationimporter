package dk.nsi.sdm4.vaccination.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(name="SSIDrug", namespace="")
public class SSIDrug {

    String ddvModifiedDate;
    String ddvValidFrom;
    String ddvValidTo;

    long drugIdentifier;
    long versionID;
    String name;
    String formTekst;
    String aTCCode;
    String aTCText;
    String styrkeTekst;
    String usableFrom;
    String usableTo;
    

    
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
    
    @XmlElement(name="drugIdentifier")
    public long getDrugIdentifier() {
        return drugIdentifier;
    }
    public void setDrugIdentifier(long drugIdentifier) {
        this.drugIdentifier = drugIdentifier;
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
    @XmlElement(name="formTekst")
    public String getFormTekst() {
        return formTekst;
    }
    public void setFormTekst(String formTekst) {
        this.formTekst = formTekst;
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
    @XmlElement(name="styrkeTekst")
    public String getStyrkeTekst() {
        return styrkeTekst;
    }
    public void setStyrkeTekst(String styrkeTekst) {
        this.styrkeTekst = styrkeTekst;
    }
    @XmlElement(name="usableFrom")
    public String getUsableFrom() {
        return usableFrom;
    }
    public void setUsableFrom(String usableFrom) {
        this.usableFrom = usableFrom;
    }
    @XmlElement(name="usableTo")
    public String getUsableTo() {
        return usableTo;
    }
    public void setUsableTo(String usableTo) {
        this.usableTo = usableTo;
    }
    
} 