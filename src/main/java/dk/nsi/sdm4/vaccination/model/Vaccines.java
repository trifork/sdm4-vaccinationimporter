package dk.nsi.sdm4.vaccination.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Vaccines", namespace="")
public class Vaccines {

    private List<Vaccine> vaccinesList;

    public void setVaccinesList(List<Vaccine> vaccinesList) {
        this.vaccinesList = vaccinesList;
    }

    @XmlElement(name="Vaccine")
    public List<Vaccine> getVaccinesList() {
        return vaccinesList;
    }
    
}
