package com.outletcity.citymatcher.domain;

import java.util.Arrays;

public enum Function {
    AVERAGE("average"), SUM("sum"), MIN("min"), MAX("max");

    private final String func;

    Function(String func) {
        this.func = func;
    }

    public String getFunc() {
        return func;
    }

    /**
     *
     * @param func - function name
     * @return - enum item for function name
     */
    public static Function valueOfFunction(String func) {
        return Arrays.stream(values()).filter(e -> func.equals(e.getFunc())).findAny().orElse(null);
    }
}

