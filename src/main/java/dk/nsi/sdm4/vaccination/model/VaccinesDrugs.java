package dk.nsi.sdm4.vaccination.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="VaccinesDrugs", namespace="")
public class VaccinesDrugs {

    private List<VaccineDrug> vaccinesDrugsList;

    public void setVaccinesDrugsList(List<VaccineDrug> vaccinesDrugsList) {
        this.vaccinesDrugsList = vaccinesDrugsList;
    }

    @XmlElement(name="VaccineDrug")
    public List<VaccineDrug> getVaccinesDrugsList() {
        return vaccinesDrugsList;
    }
    
}
