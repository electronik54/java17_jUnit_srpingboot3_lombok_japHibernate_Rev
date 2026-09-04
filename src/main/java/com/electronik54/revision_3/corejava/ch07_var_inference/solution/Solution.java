package com.electronik54.revision_3.corejava.ch07_var_inference.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution for Challenge 7: Var Inference
 * 
 * This solution demonstrates:
 * - Local variable type inference (Java 10+)
 * - Using var with primitives, objects, collections
 * - Limitations of var
 */
public class Solution {

    public static void main(String[] args) {
        // Var with primitives
        System.out.println("=== Var with Primitives ===");
        var intVar = 42;           // Inferred as int
        var doubleVar = 3.14;      // Inferred as double
        var boolVar = true;        // Inferred as boolean
        var charVar = 'A';         // Inferred as char
        
        System.out.println("int: " + intVar);
        System.out.println("double: " + doubleVar);
        System.out.println("boolean: " + boolVar);
        System.out.println("char: " + charVar);
        
        // Var with objects
        System.out.println("\n=== Var with Objects ===");
        var str = "Hello";         // Inferred as String
        var list = new ArrayList<String>();  // Inferred as ArrayList<String>
        list.add("Java");
        list.add("Python");
        list.add("C++");
        
        System.out.println("String: " + str);
        System.out.println("List: " + list);
        
        // Var limitations
        System.out.println("\n=== Var Cannot Be Used For ===");
        System.out.println("Fields, method parameters, return types");
        
        // Uncomment to see compilation errors:
        // var x;              // Error: cannot infer type without initializer
        // var nullVar = null; // Error: cannot infer type from null
        // var arr = {1,2,3};  // Error: array initializer needs explicit type
    }

}