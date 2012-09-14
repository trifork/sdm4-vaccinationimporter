package dk.nsi.sdm4.vaccination.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="VaccinationPlans", namespace="")
public class VaccinationPlans {

    private List<VaccinationPlan> vaccinationPlansList;

    public void setVaccinationPlansList(List<VaccinationPlan> vaccinationPlansList) {
        this.vaccinationPlansList = vaccinationPlansList;
    }

    @XmlElement(name="VaccinationPlan")
    public List<VaccinationPlan> getVaccinationPlansList() {
        return vaccinationPlansList;
    }
    
}
