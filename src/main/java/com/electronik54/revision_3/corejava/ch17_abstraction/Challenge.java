package com.electronik54.revision_3.corejava.ch17_abstraction;

import com.electronik54.revision_3.corejava.ch17_abstraction.solution.Solution;

/**
 * Challenge 17: Abstraction
 * 
 * Problem:
 * Create an abstract class 'Vehicle' with abstract methods (start, stop) and 
 * concrete methods (honk). Create concrete classes 'Car' and 'Motorcycle' that 
 * extend Vehicle. Also create an interface 'Electric' with method charge().
 * Demonstrate abstraction with both abstract class and interface.
 * 
 * Hint:
 * - Abstract class: partial abstraction (can have concrete methods)
 * - Interface: full abstraction (before Java 8)
 * - Use 'abstract' keyword for abstract methods
 * - Use 'implements' keyword for interfaces
 * 
 * Expected Output:
 * === Car ===
 * Car engine starting...
 * Honk honk!
 * Car engine stopping...
 * 
 * === Motorcycle ===
 * Motorcycle engine starting...

 * Honk honk!
 * Motorcycle engine stopping...
 * 
 * === Electric Car ===
 * Electric car starting...
 * Honk honk!
 * Charging battery...
 * 
 * TODO:
 * 1. Create abstract class Vehicle with:
 *    - Abstract methods: start(), stop()
 *    - Concrete method: honk()
 * 2. Create Car class extending Vehicle
 * 3. Create Motorcycle class extending Vehicle
 * 4. Create interface Electric with method charge()
 * 5. Create ElectricCar class implementing Electric interface
 * 6. Demonstrate all classes
 * 
 * Refer to Solution.java if you need help with the implementation
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 17: Abstraction ===");
        
    }
}