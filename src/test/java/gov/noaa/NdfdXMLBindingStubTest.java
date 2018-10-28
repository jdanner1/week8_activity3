package gov.noaa;

import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.*;

class NdfdXMLBindingStubTest {
    @Test
    void latLonListZipCode() throws JAXBException, Exception {

        NdfdXMLBindingStub binding = (NdfdXMLBindingStub) new NdfdXMLLocator().getndfdXMLPort();
        String response = binding.latLonListZipCode("53711");

        JAXBContext jaxbContext = JAXBContext.newInstance(DwmlType.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        DwmlType dwml = (DwmlType) jaxbUnmarshaller.unmarshal(new StringReader(response));

        String latLonList = dwml.getLatLonList();
        String expectedResult = "43.0798,-89.3875";

        assertEquals(latLonList, expectedResult);
    }
}