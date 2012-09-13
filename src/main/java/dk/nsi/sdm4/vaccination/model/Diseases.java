package dk.nsi.sdm4.vaccination.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Diseases", namespace="")
public class Diseases {

    private List<Disease> diseasesList;

    public void setDiseasesList(List<Disease> diseasesList) {
        this.diseasesList = diseasesList;
    }

    @XmlElement(name="Disease")
    public List<Disease> getDiseasesList() {
        return diseasesList;
    }
    
}
