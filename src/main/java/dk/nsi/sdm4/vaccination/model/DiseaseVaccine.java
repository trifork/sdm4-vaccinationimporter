package dk.nsi.sdm4.vaccination.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement
@XmlType(name="DiseaseVaccine", namespace="")
public class DiseaseVaccine {
    
    long vaccineIdentifier;
    long vaccineVersion;
    long diseaseIdentifier;
    long diseaseVersion;
    String ddvModifiedDate;
    String ddvValidFrom;
    String ddvValidTo;
    
    
    @XmlElement(name="vaccineIdentifier")
    public long getVaccineIdentifier() {
        return vaccineIdentifier;
    }
    public void setVaccineIdentifier(long vaccineIdentifier) {
        this.vaccineIdentifier = vaccineIdentifier;
    }
    @XmlElement(name="vaccineVersion")
    public long getVaccineVersion() {
        return vaccineVersion;
    }
    public void setVaccineVersion(long vaccineVersion) {
        this.vaccineVersion = vaccineVersion;
    }
    @XmlElement(name="diseaseIdentifier")
    public long getDiseaseIdentifier() {
        return diseaseIdentifier;
    }
    public void setDiseaseIdentifier(long diseaseIdentifier) {
        this.diseaseIdentifier = diseaseIdentifier;
    }
    @XmlElement(name="diseaseVersion")
    public long getDiseaseVersion() {
        return diseaseVersion;
    }
    public void setDiseaseVersion(long diseaseVersion) {
        this.diseaseVersion = diseaseVersion;
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