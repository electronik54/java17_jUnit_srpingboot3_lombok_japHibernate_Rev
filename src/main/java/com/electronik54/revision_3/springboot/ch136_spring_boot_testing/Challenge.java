package com.electronik54.revision_3.springboot.ch136_spring_boot_testing;

/**
 * Challenge 136: Spring Boot Testing
 * 
 * Challenge Statement:
 * Write Spring Boot integration tests for a simple CalculatorService
 * using @SpringBootTest, @MockBean, and @WebMvcTest. Test:
 * - Service layer with @SpringBootTest
 * - Controller layer with @WebMvcTest (mock MVC)
 * - Repository layer with @DataJpaTest and embedded H2
 * Also demonstrate @TestConfiguration for test-specific beans.
 * 
 * Hint:
 * - @SpringBootTest loads full context for integration testing
 * - @WebMvcTest(CalculatorController.class) loads only web layer
 * - @DataJpaTest loads only JPA repositories
 * - @MockBean replaces a real bean with a mock
 * - @TestConfiguration provides test-specific beans
 * 
 * Expected Output (Solution):
 * All tests should PASS:
 * - CalculatorService.add(2,3) should return 5
 * - GET /api/calc/add?a=2&b=3 should return 5
 * - Repository should save and find entities
 */
public class Challenge {

}