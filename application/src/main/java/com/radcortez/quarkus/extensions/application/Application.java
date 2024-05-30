package com.radcortez.quarkus.extensions.application;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

import com.radcortez.quarkus.extensions.library.Saiyan;

@Path("/")
public class Application {
    @Inject
    Saiyan saiyan;

    @GET
    public Response get() {
        return Response.ok().entity(saiyan.kamehameha()).build();
    }
}
