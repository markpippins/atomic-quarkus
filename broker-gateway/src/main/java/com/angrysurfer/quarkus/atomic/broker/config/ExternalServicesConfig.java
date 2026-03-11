package com.angrysurfer.quarkus.atomic.broker.config;

import io.smallrye.config.ConfigMapping;
import java.util.Map;

@ConfigMapping(prefix = "external.services")
public interface ExternalServicesConfig {
    Map<String, String> urls();
}
