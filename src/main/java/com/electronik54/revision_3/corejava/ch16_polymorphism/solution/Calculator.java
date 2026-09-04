package com.electronik54.revision_3.corejava.ch16_polymorphism.solution;

/**
 * Calculator class demonstrating method overloading (compile-time polymorphism).
 * Same method name with different parameters.
 */
public class Calculator {
    // Overloaded add methods
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}