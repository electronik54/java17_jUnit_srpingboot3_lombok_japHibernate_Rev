package com.electronik54.revision_3.corejava.ch15_inheritance.solution;

/**
 * Solution for Challenge 15: Inheritance
 * 
 * This solution demonstrates:
 * - Parent class (Animal) with common fields and methods
 * - Child classes (Dog, Cat) extending parent
 * - Method overriding with @Override annotation
 * - super keyword usage
 */
public class Solution {

    /**
     * Independent entry point - run this class directly to see the
     * expected end result of Challenge 15.
     */
    public static void main(String[] args) {
        // Create Dog instance
        Dog dog = new Dog("Buddy", 3);
        System.out.println("=== Dog Info ===");
        System.out.println("Name: " + dog.getName() + ", Age: " + dog.getAge());
        dog.eat();
        dog.sleep();
        dog.bark();
        
        System.out.println();
        
        // Create Cat instance
        Cat cat = new Cat("Whiskers", 2);
        System.out.println("=== Cat Info ===");
        System.out.println("Name: " + cat.getName() + ", Age: " + cat.getAge());
        cat.eat();
        cat.sleep();
        cat.meow();
    }
}