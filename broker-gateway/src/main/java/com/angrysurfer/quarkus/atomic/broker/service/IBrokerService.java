package com.angrysurfer.quarkus.atomic.broker.service;

import com.angrysurfer.spring.atomic.broker.api.ServiceRequest;
import com.angrysurfer.spring.atomic.broker.api.ServiceResponse;
import jakarta.ws.rs.core.Response;

public interface IBrokerService {
    ServiceResponse<?> submit(ServiceRequest request);
    Response healthCheck();
}
