package com.electronik54.revision_3.corejava.ch19_constructors.solution;

/**
 * Solution for Challenge 19: Constructors
 *
 * Demonstrates: default constructor with this(...) chaining,
 * parameterized constructor, and copy constructor.
 */
public class Solution {

    public static void main(String[] args) {
        // Default constructor (chains via this(...))
        Book defaultBook = new Book();
        System.out.println(defaultBook);

        // Parameterized constructor
        Book cleanCode = new Book("Clean Code", "Robert Martin", 450.0);
        System.out.println(cleanCode);

        // Copy constructor
        Book copy = new Book(cleanCode);
        System.out.println("Copy -> " + copy);
    }
}