package com.electronik54.revision_3.corejava.ch17_abstraction.solution;

/**
 * Solution for Challenge 17: Abstraction
 * 
 * This solution demonstrates:
 * - Abstract classes with abstract and concrete methods
 * - Interfaces with abstract methods
 * - Concrete classes implementing abstract methods
 * - Difference between abstract class and interface
 */
public class Solution {

    public static void main(String[] args) {
        // Create Car instance
        System.out.println("=== Car ===");
        Vehicle car = new Car();
        car.start();
        car.honk();
        car.stop();
        
        System.out.println();
        
        // Create Motorcycle instance
        System.out.println("=== Motorcycle ===");
        Vehicle motorcycle = new Motorcycle();
        motorcycle.start();
        motorcycle.honk();
        motorcycle.stop();
        
        System.out.println();
        
        // Create ElectricCar instance
        System.out.println("=== Electric Car ===");
        ElectricCar electricCar = new ElectricCar();
        electricCar.start();
        electricCar.honk();
        electricCar.stop();
        electricCar.charge();
    }
}