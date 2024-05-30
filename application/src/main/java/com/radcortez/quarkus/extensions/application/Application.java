package com.radcortez.quarkus.extensions.application;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;

import com.radcortez.quarkus.extensions.library.Library;

@Path("/hello")
public class Application {
    @Inject
    Library library;

    @GET
    @Path("/{name}")
    public Response get(@PathParam("name") String name) {
        return Response.ok().entity(library.sayHello(name)).build();
    }
}
