package com.electronik54.revision_3.corejava.ch122_code_coverage;

/**
 * Challenge 122: Code Coverage (JaCoCo)
 *
 * Problem:
 * Measure line/branch coverage of your tests using JaCoCo. Write thorough
 * tests for a TemperatureConverter (celsiusToFahrenheit, fahrenheitToCelsius)
 * covering both the happy path AND edge cases (zero, negative, boundaries),
 * then run the JaCoCo report and observe high coverage.
 *
 * Hint:
 * - JaCoCo generates target/site/jacoco/index.html
 * - Line coverage: % of executable lines executed by tests
 * - Branch coverage: % of if/else branches tested
 * - Add the jacoco-maven-plugin to pom.xml to produce the report
 *
 * Expected Output:
 * mvn test -> then open target/site/jacoco/index.html
 * TemperatureConverter: near 100% line coverage
 *
 * TODO:
 * 1. Create TemperatureConverter in solution package
 * 2. Write TemperatureConverterTest covering happy + edge cases
 * 3. Add jacoco plugin to pom.xml and run mvn jacoco:report
 * 4. Inspect the HTML coverage report
 *
 * The solution package holds TemperatureConverter. The TEST lives under
 * src/test/java. A jacoco plugin entry is included in pom.xml.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 122: Code Coverage (JaCoCo) ===");
    }
}