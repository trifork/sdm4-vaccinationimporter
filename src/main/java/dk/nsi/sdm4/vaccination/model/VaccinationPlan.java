package dk.nsi.sdm4.vaccination.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(name="VaccinationPlan", namespace="")
public class VaccinationPlan {
    String ddvModifiedDate;
    String ddvValidFrom;
    String ddvValidTo;

    long vaccinationPlanIdentifier;
    long versionID;
    long active;
    String name;
    String usableFrom;
    String usableTo;
    String allocationMethod;
    String sex;
    String birthCohorteFrom;
    String birthCohorteTo;
    long ageIntervalFrom;
    long ageIntervalTo;

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
    @XmlElement(name="vaccinationPlanIdentifier")
    public long getVaccinationPlanIdentifier() {
        return vaccinationPlanIdentifier;
    }
    public void setVaccinationPlanIdentifier(long vaccinationPlanIdentifier) {
        this.vaccinationPlanIdentifier = vaccinationPlanIdentifier;
    }
    @XmlElement(name="versionId")
    public long getVersionID() {
        return versionID;
    }
    public void setVersionID(long versionID) {
        this.versionID = versionID;
    }
    @XmlElement(name="active")
    public long getActive() {
        return active;
    }
    public void setActive(long active) {
        this.active = active;
    }
    @XmlElement(name="name")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
    @XmlElement(name="allocationMethod")
    public String getAllocationMethod() {
        return allocationMethod;
    }
    public void setAllocationMethod(String allocationMethod) {
        this.allocationMethod = allocationMethod;
    }
    @XmlElement(name="sex")
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    @XmlElement(name="birthCohorteFrom")
    public String getBirthCohorteFrom() {
        return birthCohorteFrom;
    }
    public void setBirthCohorteFrom(String birthCohorteFrom) {
        this.birthCohorteFrom = birthCohorteFrom;
    }
    @XmlElement(name="birthCohorteTo")
    public String getBirthCohorteTo() {
        return birthCohorteTo;
    }
    public void setBirthCohorteTo(String birthCohorteTo) {
        this.birthCohorteTo = birthCohorteTo;
    }
    @XmlElement(name="ageIntervalFrom")
    public long getAgeIntervalFrom() {
        return ageIntervalFrom;
    }
    public void setAgeIntervalFrom(long ageIntervalFrom) {
        this.ageIntervalFrom = ageIntervalFrom;
    }
    @XmlElement(name="ageIntervalTo")
    public long getAgeIntervalTo() {
        return ageIntervalTo;
    }
    public void setAgeIntervalTo(long ageIntervalTo) {
        this.ageIntervalTo = ageIntervalTo;
    }
    
} 