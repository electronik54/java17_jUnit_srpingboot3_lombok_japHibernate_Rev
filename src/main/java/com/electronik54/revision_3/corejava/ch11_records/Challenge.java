package com.electronik54.revision_3.corejava.ch11_records;

import com.electronik54.revision_3.corejava.ch11_records.solution.Solution;

/**
 * Challenge 11: Records (Java 14+)
 * 
 * Problem:
 * Create Record classes for Person, Point, and Rectangle. 
 * Demonstrate automatic constructor, getters, equals, hashCode, and toString generation.
 * 
 * Hint:
 * - Records are immutable data carriers
 * - Cannot extend other classes but can implement interfaces
 * - All fields are final
 * - Compiler generates: constructor, getters, equals, hashCode, toString
 * 
 * Expected Output:
 * === Person Record ===
 * Person[name=Alice, age=30]
 * Name: Alice, Age: 30
 * 
 * === Point Record ===
 * Point[x=10, y=20]
 * 
 * === Equality Check ===
 * person1.equals(person2): true
 * point1.equals(point2): true
 * 
 * TODO:
 * 1. Create Person record with name and age
 * 2. Create Point record with x and y
 * 3. Create Rectangle record with width and height
 * 4. Create instances using record constructor
 * 5. Access fields using auto-generated getters
 * 6. Demonstrate equals() and hashCode()
 * 7. Demonstrate toString()
 * 
 * Refer to Solution.java if you need help with the implementation
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 11: Records ===");
        
    }
}