package com.electronik54.revision_3.corejava.ch18_static_final.solution;

/**
 * Solution for Challenge 18: Static and Final
 * 
 * This solution demonstrates:
 * - Static variables (class-level)
 * - Static methods
 * - Static initialization blocks
 * - Final variables (constants)
 * - Final methods (cannot override)
 * - Final classes (cannot extend)
 */
public class Solution {

    public static void main(String[] args) {
        // Static Demo
        System.out.println("=== Static Demo ===");
        System.out.println("MathConstants.PI = " + MathConstants.PI);
        
        Counter c1 = new Counter();
        c1.increment();
        Counter c2 = new Counter();
        c2.increment();
        Counter c3 = new Counter();
        c3.increment();
        
        System.out.println();
        
        // Static Block Demo
        System.out.println("=== Static Block Demo ===");
        Database db = new Database();
        
        System.out.println();
        
        // Final Demo
        System.out.println("=== Final Demo ===");
        FinalDemo demo = new FinalDemo(100);
        System.out.println("Final variable: " + demo.getValue());
        demo.display();
        
        // Uncomment to see compilation errors:
        // demo.value = 200;  // Error: cannot assign final variable
    }
}