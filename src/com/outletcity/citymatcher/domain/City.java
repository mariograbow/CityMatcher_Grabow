package com.outletcity.citymatcher.domain;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "city")
@XmlAccessorType(XmlAccessType.FIELD)
public class City {

    @XmlAttribute(name = "name")
    private String name;

    @XmlAttribute(name = "population")
    private Long population;

    @XmlElement(name = "area")
    private Double area;

    private City() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
}
