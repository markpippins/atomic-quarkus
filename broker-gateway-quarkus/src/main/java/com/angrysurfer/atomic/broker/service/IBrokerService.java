package com.angrysurfer.atomic.broker.service;

import com.angrysurfer.atomic.broker.api.ServiceRequest;
import com.angrysurfer.atomic.broker.api.ServiceResponse;
import jakarta.ws.rs.core.Response;

public interface IBrokerService {
    ServiceResponse<?> submit(ServiceRequest request);
    Response healthCheck();
}