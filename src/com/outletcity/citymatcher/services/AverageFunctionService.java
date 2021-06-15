package com.outletcity.citymatcher.services;

import com.outletcity.citymatcher.domain.Data;
import com.outletcity.citymatcher.domain.Operation;
import com.outletcity.citymatcher.domain.Result;
import com.outletcity.citymatcher.services.strategy.IFunctionStrategy;

/**
 * Service function class to calculate the average value
 */
public class AverageFunctionService extends FunctionService implements IFunctionService, IFunctionStrategy<Result, Operation, Data> {


    /**
     * @param operation
     * @param data
     * @return
     */
    @Override
    public Result calculateResult(Operation operation, Data data) {

        Result result = prepareResult(operation.getName());
        Double average = filterInputData(operation, data).stream().mapToLong(city -> city.getPopulation()).average().orElse(0);
        result.setResult(average.toString());

        return result;
    }

}
