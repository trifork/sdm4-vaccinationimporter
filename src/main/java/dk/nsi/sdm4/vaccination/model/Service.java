package dk.nsi.sdm4.vaccination.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(name="Service", namespace="")
public class Service {

    String ddvModifiedDate;
    String ddvValidFrom;
    String ddvValidTo;

    long serviceIdentifier;
    long versionID;
    String number;
    String description;
    String usableFrom;
    String usableTo;
    long primaryVaccineIdentifier;
    long primaryVaccineVersionID;
    long secondaryVaccineIdentifier;
    long secondaryVaccineVersionID;
    
    
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

    @XmlElement(name="serviceIdentifier")
    public long getServiceIdentifier() {
        return serviceIdentifier;
    }
    public void setServiceIdentifier(long serviceIdentifier) {
        this.serviceIdentifier = serviceIdentifier;
    }
    @XmlElement(name="versionId")
    public long getVersionID() {
        return versionID;
    }
    public void setVersionID(long versionID) {
        this.versionID = versionID;
    }
    @XmlElement(name="number")
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    @XmlElement(name="description")
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
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
    @XmlElement(name="primaryVaccineIdentifier")
    public long getPrimaryVaccineIdentifier() {
        return primaryVaccineIdentifier;
    }
    public void setPrimaryVaccineIdentifier(long primaryVaccineIdentifier) {
        this.primaryVaccineIdentifier = primaryVaccineIdentifier;
    }
    @XmlElement(name="primaryVaccineVersionId")
    public long getPrimaryVaccineVersionID() {
        return primaryVaccineVersionID;
    }
    public void setPrimaryVaccineVersionID(long primaryVaccineVersionID) {
        this.primaryVaccineVersionID = primaryVaccineVersionID;
    }
    @XmlElement(name="secondaryVaccineIdentifier")
    public long getSecondaryVaccineIdentifier() {
        return secondaryVaccineIdentifier;
    }
    public void setSecondaryVaccineIdentifier(long secondaryVaccineIdentifier) {
        this.secondaryVaccineIdentifier = secondaryVaccineIdentifier;
    }
    @XmlElement(name="secondaryVaccineVersionId")
    public long getSecondaryVaccineVersionID() {
        return secondaryVaccineVersionID;
    }
    public void setSecondaryVaccineVersionID(long secondaryVaccineVersionID) {
        this.secondaryVaccineVersionID = secondaryVaccineVersionID;
    }
    
} 