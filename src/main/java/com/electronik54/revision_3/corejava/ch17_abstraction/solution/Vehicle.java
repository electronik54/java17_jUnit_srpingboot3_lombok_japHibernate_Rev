package com.electronik54.revision_3.corejava.ch17_abstraction.solution;

/**
 * Abstract Vehicle class.
 * Demonstrates partial abstraction - can have both abstract and concrete methods.
 */
public abstract class Vehicle {
    // Abstract methods (no body)
    public abstract void start();
    public abstract void stop();
    
    // Concrete method
    public void honk() {
        System.out.println("Honk honk!");
    }
}