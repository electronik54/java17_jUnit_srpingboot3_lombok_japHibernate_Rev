package com.electronik54.revision_3.corejava.ch13_classes_objects.solution;

/**
 * Solution for Challenge 13: Classes and Objects
 * 
 * This solution demonstrates:
 * - Class declaration with fields, methods, constructors
 * - Private fields with public getters/setters
 * - Static members (class-level)
 * - Object creation using constructors
 * - Method invocation
 */
public class Solution {

    /**
     * Independent entry point - run this class directly to see the
     * expected end result of Challenge 13.
     */
    public static void main(String[] args) {
        // Create Student objects
        Student student1 = new Student("Alice", 20, "A");
        Student student2 = new Student("Bob", 22, "B");
        
        // Display student info
        System.out.println("=== Student Info ===");
        System.out.println(student1.getInfo());
        System.out.println("School: " + Student.getSchoolName());
        student1.study("Java");
        
        System.out.println("\n=== Another Student ===");
        System.out.println(student2.getInfo());
        System.out.println("School: " + Student.getSchoolName());
    }
}