package com.electronik54.revision_3.corejava.ch10_pattern_matching;

import com.electronik54.revision_3.corejava.ch10_pattern_matching.solution.Solution;

/**
 * Challenge 10: Pattern Matching for instanceof (Java 16+)
 * 
 * Problem:
 * Use pattern matching for instanceof to eliminate explicit casting. 
 * Check if object is String, Integer, or List and process accordingly.
 * 
 * Hint:
 * - Pattern matching combines instanceof check and cast
 * - Variable is in scope after check
 * - Eliminates explicit casting
 * 
 * Expected Output:
 * === Pattern Matching ===
 * String: Hello (length: 5)
 * Integer: 42
 * List: [Java, Python]
 * Unknown type
 * 
 * TODO:
 * 1. Create a method that takes Object parameter
 * 2. Use pattern matching to check if object is String
 * 3. Use pattern matching to check if object is Integer
 * 4. Use pattern matching to check if object is List
 * 5. Process each type without explicit casting
 * 
 * Refer to Solution.java if you need help with the implementation
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 10: Pattern Matching ===");
        
    }
}