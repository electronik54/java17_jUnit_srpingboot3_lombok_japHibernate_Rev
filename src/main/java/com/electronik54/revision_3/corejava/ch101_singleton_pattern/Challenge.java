package com.electronik54.revision_3.corejava.ch101_singleton_pattern;

/**
 * Challenge 101: Singleton Pattern
 *
 * Problem:
 * Implement a thread-safe Singleton for a 'DatabaseConnection' class so only
 * ONE instance can ever be created. Demonstrate that two getInstance() calls
 * return the same object reference.
 *
 * Hint:
 * - Private constructor prevents external instantiation
 * - A static getInstance() returns the single instance
 * - Double-checked locking (synchronized + volatile) is a classic thread-safe approach
 * - Enum is the simplest bullet-proof singleton in modern Java
 *
 * Expected Output:
 * The classic enum approach: Eh, usually a DB connection:
 * db1 == db2 ? true
 * Only one instance exists -> true
 *
 * TODO:
 * 1. Make DatabaseConnection constructor private
 * 2. Add private static volatile DatabaseConnection instance
 * 3. Implement getInstance() with double-checked locking (or use an enum)
 * 4. Test that db1 == db2
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 101: Singleton Pattern ===");
    }
}