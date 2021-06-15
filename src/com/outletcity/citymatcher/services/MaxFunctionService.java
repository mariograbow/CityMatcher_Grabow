package com.outletcity.citymatcher.services;

import com.outletcity.citymatcher.domain.Data;
import com.outletcity.citymatcher.domain.Operation;
import com.outletcity.citymatcher.domain.Result;
import com.outletcity.citymatcher.services.strategy.IFunctionStrategy;

/**
 * Service function class to calculate the maximum value
 */
public class MaxFunctionService extends FunctionService implements IFunctionService, IFunctionStrategy<Result, Operation, Data> {


    /**
     * @param operation
     * @param data
     * @return
     */
    @Override
    public Result calculateResult(Operation operation, Data data) {
        Result result = prepareResult(operation.getName());
        Double max = filterInputData(operation, data).stream().mapToDouble(city -> city.getArea()).max().orElse(0);
        result.setResult(max.toString());

        return result;
    }
}
