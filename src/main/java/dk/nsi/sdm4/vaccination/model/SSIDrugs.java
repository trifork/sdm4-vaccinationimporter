package dk.nsi.sdm4.vaccination.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="SSIDrugs", namespace="")
public class SSIDrugs {

    private List<SSIDrug> ssiDrugsList;

    public void setSSIDrugsList(List<SSIDrug> ssiDrugsList) {
        this.ssiDrugsList = ssiDrugsList;
    }

    @XmlElement(name="SSIDrug")
    public List<SSIDrug> getSSIDrugsList() {
        return ssiDrugsList;
    }
    
}
