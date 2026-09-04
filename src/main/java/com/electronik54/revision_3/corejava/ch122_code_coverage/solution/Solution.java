package com.electronik54.revision_3.corejava.ch122_code_coverage.solution;

/**
 * Solution 122: Code Coverage
 *
 * Test file: src/test/java/.../ch122_code_coverage/solution/CalculatorCoverageTest.java
 *
 * JaCoCo (Java Code Coverage):
 *   Plugin: jacoco-maven-plugin
 *   Goal: jacoco:report generates coverage reports
 *   Report location: target/site/jacoco/index.html
 *
 * Coverage metrics:
 *   - Line coverage: % of executable lines executed
 *   - Branch coverage: % of branches (if/else) taken
 *   - Method coverage: % of methods called
 *   - Class coverage: % of classes touched
 *
 * Coverage targets (industry standard):
 *   - Line: >= 80%
 *   - Branch: >= 70%
 *   - Method: >= 90%
 *
 * Generate report: mvn verify (or mvn jacoco:report)
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 122: Code Coverage ===\n");
        System.out.println("JaCoCo measures: Line, Branch, Method, Class coverage");
        System.out.println("Targets: Line >= 80%, Branch >= 70%");
        System.out.println("Generate: mvn verify -> target/site/jacoco/index.html");
        System.out.println("\nSee src/test/java/.../ch122_code_coverage/solution/CalculatorCoverageTest.java");
    }
}