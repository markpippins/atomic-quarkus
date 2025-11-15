package com.angrysurfer.atomic.broker.resource;

import com.angrysurfer.atomic.broker.service.IBrokerService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BrokerResource {

    @Inject
    IBrokerService brokerService;

    @POST
    @Path("/route/{service}/{operation}")
    public Response routeRequest(@PathParam("service") String service, 
                                @PathParam("operation") String operation, 
                                String payload) {
        return brokerService.routeRequest(service, operation, payload);
    }

    @GET
    @Path("/health")
    public Response healthCheck() {
        return brokerService.healthCheck();
    }

    @GET
    @Path("/services")
    public Response listServices() {
        return Response.ok("Available services: user-service, file-service, login-service, search-service").build();
    }
}