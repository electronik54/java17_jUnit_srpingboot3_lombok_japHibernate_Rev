package com.electronik54.revision_3.corejava.ch06_string_basics.solution;

/**
 * Solution for Challenge 6: String Basics
 * 
 * This solution demonstrates:
 * - String creation (literal vs new)
 * - Common String methods
 * - String immutability
 * - String Pool behavior
 */
public class Solution {

    public static void main(String[] args) {
        // String creation
        System.out.println("=== String Creation ===");
        String literal = "Hello";
        String newString = new String("Hello");
        System.out.println("Literal: " + literal);
        System.out.println("New: " + newString);
        System.out.println("== comparison: " + (literal == newString));  // false (different objects)
        System.out.println("equals comparison: " + literal.equals(newString));  // true (same content)
        
        // String methods
        System.out.println("\n=== String Methods ===");
        String str = "Hello";
        System.out.println("Length: " + str.length());
        System.out.println("Char at 0: " + str.charAt(0));
        System.out.println("Substring(0,3): " + str.substring(0, 3));
        System.out.println("Index of 'l': " + str.indexOf('l'));
        System.out.println("Concat: " + str.concat(" World"));
        System.out.println("Replace: " + str.replace("ll", "__"));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Trimmed: \"" + "  Hello  ".trim() + "\"");
        
        // Immutability
        System.out.println("\n=== Immutability ===");
        String original = "Hello";
        System.out.println("Original: " + original);
        original.concat(" World");  // Returns new String, original unchanged
        System.out.println("After concat: " + original);
    }

}