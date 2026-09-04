package com.electronik54.revision_3.corejava.ch15_inheritance.solution;

/**
 * Parent class for demonstrating inheritance.
 * Contains common fields and methods for all animals.
 */
public class Animal {
    private String name;
    private int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void eat() {
        System.out.println(name + " is eating...");
    }
    
    public void sleep() {
        System.out.println(name + " is sleeping...");
    }
}