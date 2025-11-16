package com.angrysurfer.atomic.broker.config;

import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerResponseContext;
import jakarta.ws.rs.container.ContainerResponseFilter;
import jakarta.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
public class CORSFilter implements ContainerResponseFilter {

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
        // Only set headers if they're not already set to avoid duplication
        if (responseContext.getHeaders().get("Access-Control-Allow-Origin") == null) {
            responseContext.getHeaders().add("Access-Control-Allow-Origin", "*");
        }
        if (responseContext.getHeaders().get("Access-Control-Allow-Credentials") == null) {
            responseContext.getHeaders().add("Access-Control-Allow-Credentials", "true");
        }
        if (responseContext.getHeaders().get("Access-Control-Allow-Headers") == null) {
            responseContext.getHeaders().add("Access-Control-Allow-Headers", "origin, content-type, accept, authorization, x-requested-with, X-Custom-Header, Content-Type");
        }
        if (responseContext.getHeaders().get("Access-Control-Allow-Methods") == null) {
            responseContext.getHeaders().add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");
        }
        if (responseContext.getHeaders().get("Access-Control-Expose-Headers") == null) {
            responseContext.getHeaders().add("Access-Control-Expose-Headers", "Content-Disposition, Content-Type, Location");
        }
    }
}