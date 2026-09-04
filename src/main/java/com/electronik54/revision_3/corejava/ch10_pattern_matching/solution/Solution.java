package com.electronik54.revision_3.corejava.ch10_pattern_matching.solution;

import java.util.Arrays;
import java.util.List;

/**
 * Solution for Challenge 10: Pattern Matching for instanceof
 * 
 * This solution demonstrates:
 * - Pattern matching for instanceof (Java 16+)
 * - Eliminating explicit casting
 * - Cleaner type checking and casting
 */
public class Solution {

    public static void main(String[] args) {
        // Test with different types
        processObject("Hello");
        processObject(42);
        processObject(Arrays.asList("Java", "Python"));
        processObject(3.14);
    }
    
    private static void processObject(Object obj) {
        // Pattern matching for instanceof
        if (obj instanceof String s) {
            // s is automatically cast to String
            System.out.println("String: " + s + " (length: " + s.length() + ")");
        } else if (obj instanceof Integer i) {
            // i is automatically cast to Integer
            System.out.println("Integer: " + i);
        } else if (obj instanceof List<?> list) {
            // list is automatically cast to List
            System.out.println("List: " + list);
        } else {
            System.out.println("Unknown type");
        }
    }

}