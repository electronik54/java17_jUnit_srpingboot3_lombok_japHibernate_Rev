package com.electronik54.revision_3.springboot.ch136_spring_boot_testing.solution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

/**
 * Solution 136: Spring Boot Testing
 *
 * Demonstrates:
 * - Service layer code ready for @SpringBootTest
 * - Simple CalculatorService with add, subtract operations
 *
 * Run the test class (Solution136Test) to see results.
 * Tests are in src/test/java.
 */
@SpringBootApplication
public class Solution {

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Solution.class, args);
        CalculatorService service = ctx.getBean(CalculatorService.class);
        System.out.println("=== Solution 136: Spring Boot Testing ===");
        System.out.println("Service demo: 2 + 3 = " + service.add(2, 3));
        System.out.println("Service demo: 10 - 4 = " + service.subtract(10, 4));
        ctx.close();
    }
}

@Service
class CalculatorService {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
    public double divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Cannot divide by zero");
        return (double) a / b;
    }
}