package com.electronik54.revision_3.corejava.ch17_abstraction.solution;

/**
 * Car class extending Vehicle.
 */
public class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car engine starting...");
    }
    
    @Override
    public void stop() {
        System.out.println("Car engine stopping...");
    }
}