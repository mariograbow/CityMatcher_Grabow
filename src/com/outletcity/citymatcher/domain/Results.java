package com.outletcity.citymatcher.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.*;

/**
 *
 */
@XmlRootElement(name = "results")
@XmlAccessorType(XmlAccessType.FIELD)
public class Results {

    @XmlElement(name = "result")
    private List<Result> resultList;

    public Results() {
    }

    public List<Result> getResultList() {
        return resultList;
    }

    public void setResultList(List<Result> resultList) {
        this.resultList = resultList;
    }

    /**
     * @param result
     */
    public void addResult(Result result) {
        if (resultList == null || resultList.isEmpty()) {
            resultList = new ArrayList<>();
        }
        resultList.add(result);
    }
}
