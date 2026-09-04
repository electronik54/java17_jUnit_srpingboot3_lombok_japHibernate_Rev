package com.electronik54.revision_3.corejava.ch121_integration_testing;

/**
 * Challenge 121: Integration Testing (@SpringBootTest)
 *
 * Problem:
 * Write a Spring Boot integration test using @SpringBootTest that loads the
 * full application context and verifies a @RestController responds correctly
 * through MockMvc. This differs from a unit test because it wires the real
 * context (H2/embedded) end-to-end.
 *
 * Hint:
 * - @SpringBootTest boots the whole context
 * - @AutoConfigureMockMvc + MockMvc lets you issue HTTP-like requests
 * - @Transactional keeps test DB state rolled back between tests
 * - Define a simple GreetingRestController in src/main
 *
 * Expected Output (test run):
 * GET /api/greet -> 200 {"message":"Hello, World!"}
 *
 * TODO:
 * 1. Create GreetingRestController (src/main/springboot area or corejava)
 * 2. Create GreetingIntegrationTest under src/test/java
 * 3. Boot with @SpringBootTest and test the endpoint via MockMvc
 * 4. Run mvn test
 *
 * The solution package holds the controller. The TEST lives under src/test/java.
 * Because it loads Spring context, ensure src/main/resources/application.yaml is valid.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 121: Integration Testing ===");
    }
}