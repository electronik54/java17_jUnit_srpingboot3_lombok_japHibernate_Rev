package com.electronik54.revision_3.corejava.ch45_type_erasure;

import java.util.ArrayList;
import java.util.List;

/**
 * Challenge 45: Type Erasure
 *
 * Problem:
 * Prove that generic type information is erased at runtime: two lists with
 * different type arguments share ONE runtime class, new T[] is impossible,
 * and instanceof List<String> cannot be written. Show where generics DO
 * survive: field and method signatures via reflection.
 *
 * Hint:
 * - Generics are a COMPILE-TIME check; after compilation T becomes Object (or the bound)
 * - At runtime List<String> and List<Integer> are both just ArrayList
 * - Cannot: new T(), new T[], instanceof List<String>, catch MyException<T>
 *
 * Expected Output:
 * Same runtime class: true
 * Runtime type parameter: erased (raw List)
 * Generic field type survives: java.util.List<java.lang.String>
 *
 * TODO:
 * 1. Compare List<String>.class-type at runtime with List<Integer> list's getClass()
 * 2. Attempt an invalid instanceof in a comment; show the raw class name
 * 3. Use reflection (getGenericType) to show declared generic types survive in metadata
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {

    @SuppressWarnings("unused")
    private List<String> genericField;   // its generic signature survives in bytecode

    public static void main(String[] args) {
        System.out.println("=== Challenge 45: Type Erasure ===");
        List<String> strings = new ArrayList<>();
        List<Integer> ints = new ArrayList<>();
        System.out.println("Same runtime class: " + (strings.getClass() == ints.getClass()));
    }
}