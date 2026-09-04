package com.electronik54.revision_3.corejava.ch121_integration_testing.solution;

/**
 * Solution 121: Integration Testing
 *
 * Test file: src/test/java/.../ch121_integration_testing/solution/ProductRepositoryTest.java
 *
 * Spring Boot testing annotations:
 *   @SpringBootTest       - Loads full application context
 *   @WebMvcTest           - Only web layer (controllers)
 *   @DataJpaTest          - Only JPA layer (repositories)
 *   @MockBean             - Replace bean with mock in context
 *   @TestConfiguration    - Test-specific bean definitions
 *   @TestPropertySource   - Override properties for tests
 *
 * Test slices:
 *   @JsonTest             - JSON serialization/deserialization
 *   @RestClientTest       - REST client mocking
 *
 * Key practices:
 *   - Use H2 for in-memory DB testing
 *   - @Transactional on tests for automatic rollback
 *   - Testcontainers for real database testing
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 121: Integration Testing ===\n");
        System.out.println("@SpringBootTest, @WebMvcTest, @DataJpaTest");
        System.out.println("@MockBean, @TestConfiguration, @TestPropertySource");
        System.out.println("Testcontainers for real DB integration");
        System.out.println("\nSee src/test/java/.../ch121_integration_testing/solution/");
    }
}