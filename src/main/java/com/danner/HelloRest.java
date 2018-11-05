package com.danner;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloRest {

    @GET
    @Produces("application/json")
    public Person getMyBean() {
        return new Person("John", "Danner");
    }
}