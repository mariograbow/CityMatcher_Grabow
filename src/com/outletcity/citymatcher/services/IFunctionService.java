package com.outletcity.citymatcher.services;

import com.outletcity.citymatcher.domain.Result;

public interface IFunctionService {

    default Result prepareResult(String name) {
        return new Result(name);
    }
}
