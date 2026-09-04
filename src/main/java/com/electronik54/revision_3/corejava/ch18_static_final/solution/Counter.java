package com.electronik54.revision_3.corejava.ch18_static_final.solution;

/**
 * Counter class.
 * Demonstrates static variable shared across all instances.
 */
public class Counter {
    private static int count = 0;
    
    public void increment() {
        count++;
        System.out.println("Counter count: " + count);
    }
}