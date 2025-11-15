package com.angrysurfer.atomic.broker.service;

import jakarta.ws.rs.core.Response;

public interface IBrokerService {
    Response routeRequest(String service, String operation, String payload);
    Response healthCheck();
}