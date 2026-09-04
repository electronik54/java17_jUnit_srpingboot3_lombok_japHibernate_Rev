package com.electronik54.revision_3.corejava.ch15_inheritance.solution;

/**
 * Dog class extending Animal.
 * Demonstrates inheritance and method overriding.
 */
public class Dog extends Animal {
    
    public Dog(String name, int age) {
        super(name, age);  // Call parent constructor
    }
    
    public void bark() {
        System.out.println(getName() + " says: Woof!");
    }
}