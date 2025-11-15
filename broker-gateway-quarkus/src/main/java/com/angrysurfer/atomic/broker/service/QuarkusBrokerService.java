package com.angrysurfer.atomic.broker.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@ApplicationScoped
public class QuarkusBrokerService implements IBrokerService {

    @Override
    public Response routeRequest(String service, String operation, String payload) {
        try {
            Map<String, Object> result = new HashMap<>();
            result.put("service", service);
            result.put("operation", operation);
            result.put("payload", payload);
            result.put("status", "routed");
            result.put("timestamp", System.currentTimeMillis());
            
            return Response.ok(result).build();
        } catch (Exception e) {
            Map<String, String> error = new HashMap<>();
            error.put("error", e.getMessage());
            error.put("service", service);
            return Response.serverError().entity(error).build();
        }
    }

    @Override
    public Response healthCheck() {
        Map<String, String> health = new HashMap<>();
        health.put("status", "UP");
        health.put("service", "broker-gateway-quarkus");
        health.put("port", "8090");
        
        return Response.ok(health).build();
    }
}