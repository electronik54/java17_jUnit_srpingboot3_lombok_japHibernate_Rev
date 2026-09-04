package com.electronik54.revision_3.corejava.ch19_constructors;

/**
 * Challenge 19: Constructors
 *
 * Problem:
 * Create a class 'Book' with fields (title, author, price). Demonstrate:
 * default constructor, parameterized constructor, copy constructor, and
 * constructor chaining using this(...).
 *
 * Hint:
 * - this(...) calls another constructor in the same class (must be first statement)
 * - A copy constructor takes an object of the same class and copies its fields
 * - If no constructor is written, Java provides a default no-arg constructor
 *
 * Expected Output:
 * Book{title='Unknown', author='Unknown', price=0.0}
 * Book{title='Clean Code', author='Robert Martin', price=450.0}
 * Copy -> Book{title='Clean Code', author='Robert Martin', price=450.0}
 *
 * TODO:
 * 1. Create Book class with private fields: title, author, price
 * 2. Add a default constructor that chains to the parameterized one with this("Unknown", "Unknown", 0.0)
 * 3. Add a parameterized constructor (title, author, price)
 * 4. Add a copy constructor Book(Book other)
 * 5. Override toString() to return Book{title='..', author='..', price=..}
 * 6. In main, create books using all three constructors and print them
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 19: Constructors ===");
    }
}