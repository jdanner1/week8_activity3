package com.danner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.starwars.Response;
import com.starwars.ResultsItem;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class HelloRestTest {
    private final Logger logger = LogManager.getLogger(this.getClass());

    @Test
    void getMyBean() throws Exception {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("http://localhost:8080/services/helloRest/");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);
        String expectedResult = "???";
        logger.info(response);
        assertEquals(expectedResult, response);
    }

}


