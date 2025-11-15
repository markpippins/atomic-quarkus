package com.angrysurfer.atomic.broker.client;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "external-api")
@Path("/api")
public interface ExternalApiService {

    @GET
    @Path("/health")
    String getHealth();

    @POST
    @Path("/process")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    String processData(String data);
}