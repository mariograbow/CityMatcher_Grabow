package com.outletcity.citymatcher.domain;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 *
 */
@XmlRootElement(name = "data")
@XmlAccessorType(XmlAccessType.FIELD)
public class Data {

    @XmlElement(name = "city")
    private List<City> cities;

    private Data() {
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}
