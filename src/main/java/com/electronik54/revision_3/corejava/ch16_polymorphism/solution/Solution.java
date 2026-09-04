package com.electronik54.revision_3.corejava.ch16_polymorphism.solution;

/**
 * Solution for Challenge 16: Polymorphism
 * 
 * This solution demonstrates:
 * - Compile-time polymorphism (method overloading)
 * - Runtime polymorphism (method overriding)
 * - Abstract classes and methods
 * - Dynamic method dispatch
 */
public class Solution {

    public static void main(String[] args) {
        // Method Overloading (Compile-time Polymorphism)
        System.out.println("=== Method Overloading ===");
        Calculator calc = new Calculator();
        System.out.println("add(5, 3) = " + calc.add(5, 3));
        System.out.println("add(5.5, 3.3) = " + calc.add(5.5, 3.3));
        System.out.println("add(5, 3, 2) = " + calc.add(5, 3, 2));
        
        System.out.println();
        
        // Method Overriding (Runtime Polymorphism)
        System.out.println("=== Method Overriding ===");
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        
        // Parent reference, child objects
        Shape[] shapes = {circle, rectangle, triangle};
        for (Shape shape : shapes) {
            shape.draw();  // Dynamic method dispatch
        }
    }
}