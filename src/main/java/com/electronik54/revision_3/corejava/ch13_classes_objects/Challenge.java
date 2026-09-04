package com.electronik54.revision_3.corejava.ch13_classes_objects;

/**
 * Challenge 13: Classes and Objects
 * 
 * Problem:
 * Create a class 'Student' with fields (name, age, grade), methods (study, getInfo), 
 * constructors (default and parameterized), and static members (schoolName, getSchoolName).
 * Demonstrate object creation and method invocation.
 * 
 * Hint:
 * - Use private fields with public getters/setters
 * - Static members belong to class, not instances
 * - Use 'this' keyword to refer to current object
 * 
 * Expected Output:
 * === Student Info ===
 * Name: Alice, Age: 20, Grade: A
 * School: Java High School
 * Alice is studying Java!
 * 
 * === Another Student ===
 * Name: Bob, Age: 22, Grade: B
 * School: Java High School
 * 
 * TODO:
 * 1. Create Student class with private fields: name, age, grade
 * 2. Add static field schoolName = "Java High School"
 * 3. Create default and parameterized constructors
 * 4. Add getters and setters for all fields
 * 5. Add method study(String subject) that prints "[name] is studying [subject]!"
 * 6. Add method getInfo() that returns student details
 * 7. Add static method getSchoolName() to return school name
 * 8. Create two Student objects and demonstrate all methods
 * 
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 13: Classes and Objects ===");
        
    }
}