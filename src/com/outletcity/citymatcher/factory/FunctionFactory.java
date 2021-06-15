package com.outletcity.citymatcher.factory;

import com.outletcity.citymatcher.domain.Data;
import com.outletcity.citymatcher.domain.Function;
import com.outletcity.citymatcher.domain.Operation;
import com.outletcity.citymatcher.domain.Result;
import com.outletcity.citymatcher.services.*;
import com.outletcity.citymatcher.services.strategy.IFunctionStrategy;

/**
 *
 */
public class FunctionFactory {

    private FunctionFactory() {
    }


    /**
     * @param function - Enum of function name (AVERAGE, SUM, MIN, MAX)
     * @return - dedicated service function instance
     */
    public static IFunctionStrategy<Result, Operation, Data> getFunctionService(Function function) {

        if (function == null) {
            return null;
        }

        switch (function) {
            case AVERAGE:
                return new AverageFunctionService();
            case MAX:
                return new MaxFunctionService();
            case MIN:
                return new MinFunctionService();
            case SUM:
                return new SumFunctionService();
            default:
                return null;
        }
    }
}
