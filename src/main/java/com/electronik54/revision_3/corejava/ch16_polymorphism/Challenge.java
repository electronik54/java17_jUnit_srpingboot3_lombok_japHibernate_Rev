package com.electronik54.revision_3.corejava.ch16_polymorphism;

import com.electronik54.revision_3.corejava.ch16_polymorphism.solution.Solution;

/**
 * Challenge 16: Polymorphism
 * 
 * Problem:
 * Demonstrate compile-time polymorphism (method overloading) and runtime polymorphism 
 * (method overriding). Create a Calculator class with overloaded add methods and 
 * a Shape hierarchy with overridden draw methods.
 * 
 * Hint:
 * - Overloading: same method name, different parameters
 * - Overriding: same method signature in subclass
 * - Use @Override annotation for overriding
 * - Parent reference can hold child objects
 * 
 * Expected Output:
 * === Method Overloading ===
 * add(5, 3) = 8
 * add(5.5, 3.3) = 8.8
 * add(5, 3, 2) = 10
 * 
 * === Method Overriding ===
 * Drawing Circle
 * Drawing Rectangle
 * Drawing Triangle
 * 
 * TODO:
 * 1. Create Calculator class with overloaded add methods:
 *    - add(int a, int b)
 *    - add(double a, double b)
 *    - add(int a, int b, int c)
 * 2. Create abstract Shape class with abstract draw() method
 * 3. Create Circle, Rectangle, Triangle classes extending Shape
 * 4. Override draw() method in each subclass
 * 5. Create array of Shape references and call draw() on each
 * 
 * Refer to Solution.java if you need help with the implementation
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 16: Polymorphism ===");
        
    }
}