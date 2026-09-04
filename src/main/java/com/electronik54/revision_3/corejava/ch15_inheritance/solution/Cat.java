package com.electronik54.revision_3.corejava.ch15_inheritance.solution;

/**
 * Cat class extending Animal.
 * Demonstrates inheritance and method overriding.
 */
public class Cat extends Animal {
    
    public Cat(String name, int age) {
        super(name, age);  // Call parent constructor
    }
    
    public void meow() {
        System.out.println(getName() + " says: Meow!");
    }
}