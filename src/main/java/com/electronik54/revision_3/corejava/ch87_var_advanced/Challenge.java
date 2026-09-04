package com.electronik54.revision_3.corejava.ch87_var_advanced;

import java.util.List;
import java.util.Map;

/**
 * Challenge 87: var - Advanced Use Cases and When NOT to Use It
 *
 * Problem:
 * Use var where it helps (long generic types, chained calls) and learn
 * where it's ILLEGAL (fields, method params, no initializer) or harmful
 * (primitive numerics changing type silently, unclear builder chains).
 *
 * Hint:
 * - var is compile-time inference ONLY - Java is still statically typed
 * - Illegal: fields, method parameters/returns, var x; without initializer, var with null
 * - var i = 5; is int BUT var l = 5_000_000_000; is long - watch numeric literals!
 * - Good use: var map = new HashMap<String, List<Integer>>(); (removes duplication)
 *
 * Expected Output:
 * Inferred: ArrayList<String> / entry type Map.Entry<String, List<Integer>>
 * var of 5 is int; var of 5000000000 is long - literal decides!
 * Illegal uses documented in comments
 *
 * TODO:
 * 1. var for a duplicated generic type; print the inferred class name
 * 2. var in enhanced-for over a Map.entrySet()
 * 3. Show numeric literal inference differences (5 vs 5L vs 5.0)
 * 4. Comment all illegal var positions
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 87: var Advanced ===");
        System.out.println("Source: " + List.of("a"));
    }
}