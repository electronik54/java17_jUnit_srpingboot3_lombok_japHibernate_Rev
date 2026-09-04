package com.electronik54.revision_3.corejava.ch17_abstraction.solution;

/**
 * ElectricCar class extending Vehicle and implementing Electric.
 * Demonstrates both inheritance and interface implementation.
 */
public class ElectricCar extends Vehicle implements Electric {
    @Override
    public void start() {
        System.out.println("Electric car starting silently...");
    }
    
    @Override
    public void stop() {
        System.out.println("Electric car stopping...");
    }
    
    @Override
    public void charge() {
        System.out.println("Charging battery...");
    }
}