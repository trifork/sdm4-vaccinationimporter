package dk.nsi.sdm4.vaccination.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Services", namespace="")
public class Services {

    private List<Service> serviceList;

    public void setServicesList(List<Service> serviceList) {
        this.serviceList = serviceList;
    }

    @XmlElement(name="Service")
    public List<Service> getServicesList() {
        return serviceList;
    }
    
}
