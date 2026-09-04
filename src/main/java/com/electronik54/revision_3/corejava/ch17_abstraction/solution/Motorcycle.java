package com.electronik54.revision_3.corejava.ch17_abstraction.solution;

/**
 * Motorcycle class extending Vehicle.
 */
public class Motorcycle extends Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle engine starting...");
    }
    
    @Override
    public void stop() {
        System.out.println("Motorcycle engine stopping...");
    }
}