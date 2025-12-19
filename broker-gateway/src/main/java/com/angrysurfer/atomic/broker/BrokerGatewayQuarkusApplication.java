package com.angrysurfer.atomic.broker;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class BrokerGatewayQuarkusApplication {
    
    public static void main(String[] args) {
        Quarkus.run(args);
    }
}