package com.outletcity.citymatcher.util;

import com.outletcity.citymatcher.constants.CityConstants;
import com.outletcity.citymatcher.domain.Results;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 */
public class FileUtil {

    private FileUtil() {
    }

    /**
     * @param filePath    - Path to file
     * @param targetClass - Type of return
     * @param <T>         - Type of expected return object
     * @return -return the unmarshalled Xml as pojo
     * @throws JAXBException -
     */
    public static <T> T unmarshallXmlData(String filePath, Class<T> targetClass) throws JAXBException, FileNotFoundException {

        JAXBContext jaxbContext = JAXBContext.newInstance(targetClass);

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        return targetClass.cast(jaxbUnmarshaller.unmarshal(new File(filePath)));
    }

    /**
     * @param results - Results object to serialize as XML
     * @throws JAXBException -
     */
    public static void marshallResults(Results results) throws JAXBException {

        JAXBContext jaxbContext = JAXBContext.newInstance(Results.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        jaxbMarshaller.marshal(results, new File(CityConstants.RESULT_XML_FILE));
    }


}
