package dk.nsi.sdm4.vaccination.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Dosageoptions", namespace="")
public class Dosageoptions {

    private List<Dosageoption> dosageoptionsList;

    public void setDosageoptionsList(List<Dosageoption> dosageoptionsList) {
        this.dosageoptionsList = dosageoptionsList;
    }

    @XmlElement(name="Dosageoption")
    public List<Dosageoption> getDosageoptionsList() {
        return dosageoptionsList;
    }
    
}
