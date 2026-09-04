package com.electronik54.revision_3.corejava.ch74_method_references.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * Solution for Challenge 74: Method References
 *
 * Demonstrates: static, bound, unbound, and constructor references
 * vs their lambda equivalents.
 */
public class Solution {

    public static void main(String[] args) {
        // 1. Static reference
        List<Integer> absolutes = List.of(-1, 2).stream()
                .map(Math::abs)                      // n -> Math.abs(n)
                .collect(Collectors.toList());
        System.out.println("Static: " + absolutes);

        // 2. Bound reference (receiver fixed)
        String greeting = "hello";
        Supplier<Integer> len = greeting::length;    // () -> greeting.length()
        System.out.println("Bound: " + len.get());

        // 3. Unbound reference (receiver = first argument)
        List<String> uppers = List.of("hello", "world").stream()
                .map(String::toUpperCase)            // s -> s.toUpperCase()
                .collect(Collectors.toList());
        System.out.println("Unbound: " + uppers);

        // 4. Constructor reference
        Supplier<ArrayList<String>> listFactory = ArrayList::new;
        List<String> collected = List.of("a").stream()
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Constructor: empty list " + listFactory.get()
                + " / collected " + collected);

        // Equivalence checks
        Function<String, Integer> lambdaForm = s -> s.length();
        Function<String, Integer> referenceForm = String::length;
        System.out.println("Lambda vs reference equivalents: "
                + (lambdaForm.apply("abc").equals(referenceForm.apply("abc"))));
    }
}