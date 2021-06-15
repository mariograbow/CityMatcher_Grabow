package com.outletcity.citymatcher.app;

import com.outletcity.citymatcher.constants.CityConstants;
import com.outletcity.citymatcher.domain.*;
import com.outletcity.citymatcher.factory.FunctionFactory;
import com.outletcity.citymatcher.util.FileUtil;

import javax.xml.bind.JAXBException;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 */
public class CityOperator {

//    private FunctionStrategy functionStrategy;

    private final static Logger LOGGER = Logger.getLogger(CityOperator.class.getName());

    /**
     *
     */
    public void run() {

        LOGGER.log(Level.INFO, "Start running ...");
        Operations operations = null;
        Data data = null;
        try {
            operations = FileUtil.<Operations>unmarshallXmlData(CityConstants.OPERATIONS_XML_FILE, Operations.class);
            if (operations == null || operations.getOperations().isEmpty()) {
                LOGGER.log(Level.SEVERE, "Operations are null or empty!");
                return;
            }

            data = FileUtil.<Data>unmarshallXmlData(CityConstants.DATA_XML_FILE, Data.class);
            if (data == null || data.getCities().isEmpty()) {
                LOGGER.log(Level.SEVERE, "Cities are null or empty!");
                return;
            }

        } catch (JAXBException | FileNotFoundException exception) {
            LOGGER.log(Level.SEVERE, "Exception in method run: ", exception);

            return;
        }

        processDataResult(operations, data);
    }

    /**
     * @param operations
     * @param data
     */
    private void processDataResult(Operations operations, Data data) {

        Results results = new Results();

        operations.getOperations().forEach(operation -> {
            Result result = FunctionFactory.getFunctionService(
                    Function.valueOfFunction(operation.getFunction()))
                    .calculateResult(operation, data);

            results.addResult(result);
        });

        try {
            FileUtil.marshallResults(results);
        } catch (JAXBException exception) {

        }

    }

}
