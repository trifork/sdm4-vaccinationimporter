package dk.nsi.sdm4.vaccination.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="DiseasesVaccines", namespace="")
public class DiseasesVaccines {

    private List<DiseaseVaccine> diseasesVaccinesList;

    public void setDiseasesVaccinesList(List<DiseaseVaccine> diseasesVaccinesList) {
        this.diseasesVaccinesList = diseasesVaccinesList;
    }

    @XmlElement(name="DiseaseVaccine")
    public List<DiseaseVaccine> getDiseasesVaccinesList() {
        return diseasesVaccinesList;
    }
    
}
