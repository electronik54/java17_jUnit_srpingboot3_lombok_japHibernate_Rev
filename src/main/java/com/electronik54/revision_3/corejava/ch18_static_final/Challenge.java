package com.electronik54.revision_3.corejava.ch18_static_final;

import com.electronik54.revision_3.corejava.ch18_static_final.solution.Solution;

/**
 * Challenge 18: Static and Final
 * 
 * Problem:
 * Demonstrate static variables, methods, blocks, and final variables, methods, classes.
 * Create a MathConstants class with static final PI, a Counter class with static count,
 * and a FinalDemo class with final variables and methods.
 * 
 * Hint:
 * - Static: belongs to class, not instances
 * - Final: cannot be changed (variables), overridden (methods), extended (classes)
 * - Static block runs once at class loading
 * - Final variables must be initialized
 * 
 * Expected Output:
 * === Static Demo ===
 * MathConstants.PI = 3.14159
 * Counter count: 1
 * Counter count: 2
 * Counter count: 3
 * 
 * === Static Block Demo ===
 * Static block executed
 * Database initialized
 * 
 * === Final Demo ===
 * Final variable: 100
 * Cannot modify final variable
 * Final method cannot be overridden
 * 
 * TODO:
 * 1. Create MathConstants class with static final PI = 3.14159
 * 2. Create Counter class with static int count and instance method increment()
 * 3. Create Database class with static block that prints initialization message
 * 4. Create FinalDemo class with:
 *    - Final instance variable initialized in constructor
 *    - Final method that cannot be overridden
 *    - Final local variable
 * 5. Create FinalChild class extending FinalDemo (demonstrate final method)
 * 6. Demonstrate all static and final features
 * 
 * Refer to Solution.java if you need help with the implementation
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 18: Static and Final ===");
        
    }
}