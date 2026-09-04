package com.electronik54.revision_3.corejava.ch117_junit5_basics.solution;

/**
 * Solution 117: JUnit 5 Basics
 *
 * Test file: src/test/java/com/electronik54/revision_3/corejava/ch117_junit5_basics/solution/CalculatorTest.java
 *
 * Key JUnit 5 annotations:
 *   @Test          - Marks a test method
 *   @BeforeEach    - Runs before each test
 *   @AfterEach     - Runs after each test
 *   @BeforeAll     - Runs once before all tests (static)
 *   @AfterAll      - Runs once after all tests (static)
 *   @DisplayName   - Custom test name
 *   @Disabled      - Skip a test
 *
 * Assertions:
 *   assertEquals(expected, actual)
 *   assertTrue(condition)
 *   assertThrows(ExpectedException.class, () -> code)
 *   assertAll("heading", () -> assertion1, () -> assertion2)
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 117: JUnit 5 Basics ===\n");
        System.out.println("Key annotations: @Test, @BeforeEach, @AfterEach");
        System.out.println("Key assertions: assertEquals, assertTrue, assertThrows");
        System.out.println("Run tests via: mvn test");
        System.out.println("\nSee the test class at:");
        System.out.println("  src/test/java/.../ch117_junit5_basics/solution/CalculatorTest.java");
    }
}