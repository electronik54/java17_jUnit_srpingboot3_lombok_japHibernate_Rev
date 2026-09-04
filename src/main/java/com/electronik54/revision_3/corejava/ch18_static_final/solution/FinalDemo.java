package com.electronik54.revision_3.corejava.ch18_static_final.solution;

/**
 * FinalDemo class.
 * Demonstrates final variables and final methods.
 */
public class FinalDemo {
    // Final instance variable
    private final int value;
    
    // Constructor initializes final variable
    public FinalDemo(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
    
    // Final method - cannot be overridden
    public final void display() {
        System.out.println("Final method: value = " + value);
    }
}