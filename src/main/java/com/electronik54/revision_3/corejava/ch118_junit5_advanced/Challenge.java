package com.electronik54.revision_3.corejava.ch118_junit5_advanced;

/**
 * Challenge 118: JUnit 5 Advanced
 *
 * Problem:
 * Write advanced JUnit 5 tests for a StringUtils class (isPalindrome,
 * reverse). Use @ParameterizedTest with @ValueSource/@CsvSource,
 * @RepeatedTest, and @Assumptions.
 *
 * Hint:
 * - @ParameterizedTest + @CsvSource runs the same test with many inputs
 * - @RepeatedTest(3) runs the test N times
 * - assumeTrue() skips a test silently if the condition is false
 *
 * Expected Output (test run):
 * Parameterized isPalindrome: 3 examples pass
 * RepeatedTest reverse: runs 3 times
 * Assumption skips when input is null
 *
 * TODO:
 * 1. Create StringUtils (isPalindrome, reverse) in solution package
 * 2. Create StringUtilsTest under src/test/java
 * 3. Use @ParameterizedTest, @CsvSource, @RepeatedTest, assumeTrue
 * 4. Run mvn -Dtest=StringUtilsTest test
 *
 * The solution package holds StringUtils. The TEST lives under src/test/java.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 118: JUnit 5 Advanced ===");
    }
}