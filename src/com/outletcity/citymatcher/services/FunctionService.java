package com.outletcity.citymatcher.services;

import com.outletcity.citymatcher.domain.City;
import com.outletcity.citymatcher.domain.Data;
import com.outletcity.citymatcher.domain.Operation;

import java.util.List;
import java.util.stream.Collectors;

public abstract class FunctionService {


    /**
     *
     * @param operation - Operation for data object
     * @param data - Data object
     * @return - List of Cities filtered by Pattern
     */
    protected List<City> filterInputData(Operation operation, Data data) {

        return data.getCities().stream()
                .filter(city -> city.getName().matches(operation.getFilter()))
                .collect(Collectors.toList());
    }
}
