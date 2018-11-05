package com.danner;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/helloRest")
public class HelloRest {

    @GET
    @Produces(MediaType.APPLICATION_JSON)

    public Person getMyBean() {
        return new Person("John", "Danner");
    }
}