package com.electronik54.revision_3.springboot.ch128_spring_actuators;

/**
 * Challenge 128: Spring Actuator
 *
 * Problem:
 * Expose a custom actuator endpoint at /actuator/custom/info that returns
 * a Map with app name and a counter. Also observe the built-in actuator
 * endpoints (/actuator/health, /actuator/info, /actuator/metrics) that are
 * already enabled in application.yaml.
 *
 * Hint:
 * - @Endpoint(id="custom") defines a new actuator endpoint
 * - @ReadOperation on a GET method returns data as JSON
 * - Built-in endpoints are enabled via management.endpoints.web.exposure.include
 * - actuator endpoints live under the base path /actuator (or configured management.base-path)
 *
 * Expected Output (curl):
 * GET /actuator/custom/info -> {"app":"revision_3","value":1}
 * GET /actuator/health -> {"status":"UP"}
 *
 * TODO:
 * 1. Create a CustomInfoEndpoint annotated with @Endpoint(id="custom")
 * 2. Add a @ReadOperation method returning a Map
 * 3. Verify it is exposed under /actuator/custom/info
 *
 * Spring bean — component-scanned. Verify by starting the app and curling
 * /actuator/custom/info.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 128: Spring Actuator ===");
    }
}