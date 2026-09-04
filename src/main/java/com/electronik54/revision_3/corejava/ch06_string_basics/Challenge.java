package com.electronik54.revision_3.corejava.ch06_string_basics;

import com.electronik54.revision_3.corejava.ch06_string_basics.solution.Solution;

/**
 * Challenge 6: String Basics
 * 
 * Problem:
 * Demonstrate String creation (literal vs new), common methods 
 * (length, charAt, substring, indexOf, concat, replace, split, 
 * toUpperCase, toLowerCase, trim), and String immutability.
 * 
 * Hint:
 * - String literals are stored in String Pool
 * - new String() creates heap object
 * - Strings are immutable - every modification creates new String
 * 
 * Expected Output:
 * === String Creation ===
 * Literal: Hello
 * New: Hello
 * == comparison: false
 * equals comparison: true
 * 
 * === String Methods ===
 * Length: 5
 * Char at 0: H
 * Substring(0,3): Hel
 * Index of 'l': 2
 * Concat: Hello World
 * Replace: He__o
 * Uppercase: HELLO
 * Trimmed: "Hello"
 * 
 * === Immutability ===
 * Original: Hello
 * After concat: Hello
 * 
 * TODO:
 * 1. Create String using literal and new keyword
 * 2. Compare using == and .equals()
 * 3. Demonstrate: length(), charAt(), substring(), indexOf()
 * 4. Demonstrate: concat(), replace(), toUpperCase(), toLowerCase(), trim()
 * 5. Demonstrate String immutability
 * 
 * Refer to Solution.java if you need help with the implementation
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 6: String Basics ===");
        
    }
}