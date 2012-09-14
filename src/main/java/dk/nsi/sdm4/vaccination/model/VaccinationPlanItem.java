package dk.nsi.sdm4.vaccination.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(name="VaccinationPlanItem", namespace="")
public class VaccinationPlanItem {
    String ddvModifiedDate;
    String ddvValidFrom;
    String ddvValidTo;

    long vaccinationPlanItemIdentifier;
    long versionID;
    long vaccineIdentifier;
    String vaccineName;
    long vaccinationIndex;
    long minimumInterval;
    String coverageDuration;
    long time;
    String description;
    String series;
    long vaccinationPlanIdentifier;
    long planVersionID;

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
    @XmlElement(name="vaccinationPlanItemIdentifier")
    public long getVaccinationPlanItemIdentifier() {
        return vaccinationPlanItemIdentifier;
    }
    public void setVaccinationPlanItemIdentifier(long vaccinationPlanItemIdentifier) {
        this.vaccinationPlanItemIdentifier = vaccinationPlanItemIdentifier;
    }
    @XmlElement(name="versionId")
    public long getVersionID() {
        return versionID;
    }
    public void setVersionID(long versionID) {
        this.versionID = versionID;
    }
    @XmlElement(name="vaccineIdentifier")
    public long getVaccineIdentifier() {
        return vaccineIdentifier;
    }
    public void setVaccineIdentifier(long vaccineIdentifier) {
        this.vaccineIdentifier = vaccineIdentifier;
    }
    @XmlElement(name="vaccineName")
    public String getVaccineName() {
        return vaccineName;
    }
    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }
    @XmlElement(name="vaccinationIndex")
    public long getVaccinationIndex() {
        return vaccinationIndex;
    }
    public void setVaccinationIndex(long vaccinationIndex) {
        this.vaccinationIndex = vaccinationIndex;
    }
    @XmlElement(name="minimuminterval")
    public long getMinimumInterval() {
        return minimumInterval;
    }
    public void setMinimumInterval(long minimumInterval) {
        this.minimumInterval = minimumInterval;
    }
    @XmlElement(name="coverageDuration")
    public String getCoverageDuration() {
        return coverageDuration;
    }
    public void setCoverageDuration(String coverageDuration) {
        this.coverageDuration = coverageDuration;
    }
    @XmlElement(name="time")
    public long getTime() {
        return time;
    }
    public void setTime(long time) {
        this.time = time;
    }
    @XmlElement(name="description")
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    @XmlElement(name="series")
    public String getSeries() {
        return series;
    }
    public void setSeries(String series) {
        this.series = series;
    }
    @XmlElement(name="vaccinationPlanIdentifier")
    public long getVaccinationPlanIdentifier() {
        return vaccinationPlanIdentifier;
    }
    public void setVaccinationPlanIdentifier(long vaccinationPlanIdentifier) {
        this.vaccinationPlanIdentifier = vaccinationPlanIdentifier;
    }
    @XmlElement(name="planVersionId")
    public long getPlanVersionID() {
        return planVersionID;
    }
    public void setPlanVersionID(long planVersionID) {
        this.planVersionID = planVersionID;
    }
    
} 