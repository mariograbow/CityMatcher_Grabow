package com.outletcity.citymatcher.services;

import com.outletcity.citymatcher.domain.Data;
import com.outletcity.citymatcher.domain.Operation;
import com.outletcity.citymatcher.domain.Result;
import com.outletcity.citymatcher.services.strategy.IFunctionStrategy;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class SumFunctionService extends FunctionService implements IFunctionService, IFunctionStrategy<Result, Operation, Data> {


    @Override
    public Result calculateResult(Operation operation, Data data) {
        throw new NotImplementedException();
    }
}
