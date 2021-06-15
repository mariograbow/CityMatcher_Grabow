package com.outletcity.citymatcher.services.strategy;

import com.outletcity.citymatcher.domain.City;

import java.util.List;

/**
 *
 */
public interface IFunctionStrategy<R, O, D> {
    R calculateResult(O operation, D data);
}
