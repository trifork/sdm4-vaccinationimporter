package dk.nsi.sdm4.vaccination.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="VaccinationPlanItems", namespace="")
public class VaccinationPlanItems {

    private List<VaccinationPlanItem> vaccinationPlanItemsList;

    public void setVaccinationPlanItemsList(List<VaccinationPlanItem> vaccinationPlanItemsList) {
        this.vaccinationPlanItemsList = vaccinationPlanItemsList;
    }

    @XmlElement(name="VaccinationPlanItem")
    public List<VaccinationPlanItem> getVaccinationPlanItemsList() {
        return vaccinationPlanItemsList;
    }
    
}
