package com.outletcity.citymatcher.domain;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "operation")
@XmlAccessorType(XmlAccessType.FIELD)
public class Operation {

    @XmlAttribute(name = "name")
    private String name;
    @XmlAttribute(name = "type")
    private String type;
    @XmlAttribute(name = "func")
    private String function;
    @XmlAttribute(name = "attrib")
    private String attribute;
    @XmlAttribute(name = "filter")
    private String filter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }
}
