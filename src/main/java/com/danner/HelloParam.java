package com.danner;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/helloParam")
public class HelloParam {

    @GET
    @Produces("text/plain")
    @Path("{firstName}/{lastName}")
    public Response getDate(
            @PathParam("firstName") String firstName,
            @PathParam("lastName") String lastName) {

        String output = "Hello " + firstName + " " + lastName;
        return Response.status(200).entity(output).build();
    }
}


