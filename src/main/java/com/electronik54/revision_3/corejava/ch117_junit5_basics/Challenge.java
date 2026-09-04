package com.electronik54.revision_3.corejava.ch117_junit5_basics;

/**
 * Challenge 117: JUnit 5 Basics
 *
 * Problem:
 * Write unit tests for a Calculator class (add, subtract, multiply, divide).
 * Use JUnit 5 annotations: @Test, @BeforeEach/@AfterEach, @DisplayName,
 * and assertions like assertEquals, assertTrue, assertThrows.
 *
 * Hint:
 * - @Test marks a test method
 * - @BeforeEach runs before every test; @AfterEach after every test
 * - assertThrows(ArithmeticException.class, ...) verifies an exception
 * - Tests live in src/test/java, classes you test live in src/main/java
 *
 * Expected Output (test run):
 * JUnit 5 passes: 4 tests, 0 failures
 *
 * TODO:
 * 1. Create Calculator in solution package (add, subtract, multiply, divide)
 * 2. Create CalculatorTest in src/test/java (same package path)
 * 3. Add @Test methods using assertions
 * 4. Run mvn test and observe all green
 *
 * The solution package holds Calculator. The TEST lives under src/test/java.
 * Run: mvn -Dtest=CalculatorTest test
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 117: JUnit 5 Basics ===");
    }
}