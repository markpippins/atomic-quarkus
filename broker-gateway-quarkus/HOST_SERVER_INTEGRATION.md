# Quarkus Broker Gateway - Host Server Integration

## Overview

Demonstrates **polyglot service registration**: Quarkus service registering with Spring Boot host-server.

## How It Works

### Auto-Registration on Startup

```java
@ApplicationScoped
public class HostServerRegistrationService {
    void onStart(@Observes StartupEvent ev) {
        registerService();  // Register with host-server
        startHeartbeats();  // Send periodic heartbeats
    }
}
```

### Configuration

```properties
host.server.url=http://localhost:8085
service.host=localhost
registration.enabled=true
heartbeat.interval.seconds=30
```

## Testing

```bash
# Start host-server
cd spring/host-server && mvn spring-boot:run

# Start Quarkus gateway
cd quarkus/broker-gateway-quarkus && ./mvnw quarkus:dev

# Verify registration
curl http://localhost:8085/api/registry/services
```

## Benefits

✅ Polyglot service mesh (Spring Boot + Quarkus + Node.js + Python)  
✅ Automatic registration  
✅ Periodic heartbeats  
✅ Framework flexibility  

See [README](README.md) for full documentation.