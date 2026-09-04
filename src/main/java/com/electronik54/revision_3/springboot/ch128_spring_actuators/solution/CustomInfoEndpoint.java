package com.electronik54.revision_3.springboot.ch128_spring_actuators.solution;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/** Custom actuator endpoint at /actuator/custom/info. */
@Component
@Endpoint(id = "custom")
public class CustomInfoEndpoint {

    private final AtomicLong counter = new AtomicLong();

    @ReadOperation
    public Map<String, Object> info() {
        return Map.of(
                "app", "revision_3",
                "value", counter.incrementAndGet());
    }
}