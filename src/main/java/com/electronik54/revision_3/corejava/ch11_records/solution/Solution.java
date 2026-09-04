package com.electronik54.revision_3.corejava.ch11_records.solution;

/**
 * Solution for Challenge 11: Records
 * 
 * This solution demonstrates:
 * - Record classes (Java 14+)
 * - Auto-generated constructor, getters, equals, hashCode, toString
 * - Immutable data carriers
 * - Compact constructors for validation
 */
public class Solution {

    public static void main(String[] args) {
        // Person record
        System.out.println("=== Person Record ===");
        var person1 = new Person("Alice", 30);
        var person2 = new Person("Alice", 30);
        
        System.out.println(person1);  // Auto-generated toString
        System.out.println("Name: " + person1.name());  // Auto-generated getter
        System.out.println("Age: " + person1.age());
        
        // Point record
        System.out.println("\n=== Point Record ===");
        var point1 = new Point(10, 20);
        var point2 = new Point(10, 20);
        
        System.out.println(point1);
        System.out.println("X: " + point1.x() + ", Y: " + point1.y());
        
        // Rectangle record
        System.out.println("\n=== Rectangle Record ===");
        var rect = new Rectangle(5, 10);
        System.out.println(rect);
        System.out.println("Area: " + rect.area());
        System.out.println("Perimeter: " + rect.perimeter());
        
        // Equality check
        System.out.println("\n=== Equality Check ===");
        System.out.println("person1.equals(person2): " + person1.equals(person2));
        System.out.println("point1.equals(point2): " + point1.equals(point2));
        
        // Hash codes
        System.out.println("person1.hashCode() == person2.hashCode(): " + 
            (person1.hashCode() == person2.hashCode()));
    }

}