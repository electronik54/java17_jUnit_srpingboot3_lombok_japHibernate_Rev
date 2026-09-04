package com.electronik54.revision_3.corejava.ch07_var_inference;

import com.electronik54.revision_3.corejava.ch07_var_inference.solution.Solution;

/**
 * Challenge 7: Var Inference (Java 10+)
 * 
 * Problem:
 * Use var (local variable type inference) to declare variables in different scenarios: 
 * with primitives, objects, collections, and streams. Show when var can and cannot be used.
 * 
 * Hint:
 * - var can only be used for local variables with initializer
 * - Cannot be used for fields, method parameters, or return types
 * - Compiler infers type from initializer
 * 
 * Expected Output:
 * === Var with Primitives ===
 * int: 42
 * double: 3.14
 * boolean: true
 * char: A
 * 
 * === Var with Objects ===
 * String: Hello
 * List: [Java, Python, C++]
 * 
 * === Var Cannot Be Used For ===
 * Fields, method parameters, return types
 * 
 * TODO:
 * 1. Declare variables using var for all primitive types
 * 2. Declare String and List using var
 * 3. Show that var cannot be used for fields (commented example)
 * 4. Show that var cannot be used without initializer
 * 
 * Refer to Solution.java if you need help with the implementation
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 7: Var Inference ===");
        
    }
}