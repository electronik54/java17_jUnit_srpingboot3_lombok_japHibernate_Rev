package com.electronik54.revision_3.corejava.ch13_classes_objects.solution;

/**
 * Student class demonstrating OOP concepts:
 * - Private fields with public getters/setters
 * - Static members (class-level)
 * - Multiple constructors
 * - Instance methods
 */
public class Student {
    // Instance fields (private)
    private String name;
    private int age;
    private String grade;
    
    // Static field (class-level)
    private static String schoolName = "Java High School";
    
    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.grade = "N/A";
    }
    
    // Parameterized constructor
    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    
    // Getters and Setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getGrade() {
        return grade;
    }
    
    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    // Instance method
    public void study(String subject) {
        System.out.println(name + " is studying " + subject + "!");
    }
    
    public String getInfo() {
        return "Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }
    
    // Static method
    public static String getSchoolName() {
        return schoolName;
    }
}