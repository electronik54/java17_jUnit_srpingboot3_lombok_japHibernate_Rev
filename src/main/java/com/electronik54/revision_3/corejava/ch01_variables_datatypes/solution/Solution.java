package com.electronik54.revision_3.corejava.ch01_variables_datatypes.solution;

/**
 * Solution for Challenge 1: Variables and Data Types
 * 
 * This solution demonstrates:
 * - All 8 primitive data types in Java
 * - Reference types (String and arrays)
 * - Type casting (widening and narrowing)
 * - Formatted output using printf()
 */
public class Solution {

    public static void main(String[] args) {
        // Primitive types
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;
        float f = 3.14159f;
        double d = 3.141592653589793;
        char c = 'A';
        boolean bool = true;
        
        // Reference types
        String str = "Hello, Java!";
        int[] arr = {1, 2, 3, 4, 5};
        
        // Print primitive types
        System.out.println("=== Primitive Types ===");
        System.out.printf("byte (8-bit): %d%n", b);
        System.out.printf("short (16-bit): %d%n", s);
        System.out.printf("int (32-bit): %d%n", i);
        System.out.printf("long (64-bit): %d%n", l);
        System.out.printf("float (32-bit): %.5f%n", f);
        System.out.printf("double (64-bit): %.15f%n", d);
        System.out.printf("char (16-bit): %c%n", c);
        System.out.println("boolean: " + bool);
        
        // Print reference types
        System.out.println("\n=== Reference Types ===");
        System.out.println("String: " + str);
        System.out.println("Array: " + java.util.Arrays.toString(arr));
        
        // Type casting
        System.out.println("\n=== Type Casting ===");
        int narrowed = (int) 9.76;  // Narrowing (double to int)
        double widened = 42;        // Widening (int to double)
        System.out.println("Narrowing (double->int): " + narrowed);
        System.out.println("Widening (int->double): " + widened);
    }

}