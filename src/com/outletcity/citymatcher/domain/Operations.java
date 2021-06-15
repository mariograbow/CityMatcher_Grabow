package com.outletcity.citymatcher.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 *
 */
@XmlRootElement(name = "operations")
@XmlAccessorType(XmlAccessType.FIELD)
public class Operations {

    @XmlElement(name = "operation")
    private List<Operation> operations;

    private Operations() {
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }
}
