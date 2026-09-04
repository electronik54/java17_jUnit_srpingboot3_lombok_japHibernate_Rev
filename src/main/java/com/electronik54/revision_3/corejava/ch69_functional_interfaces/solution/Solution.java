package com.electronik54.revision_3.corejava.ch69_functional_interfaces.solution;

import java.util.function.Function;

/**
 * Solution for Challenge 69: Functional Interfaces
 *
 * Demonstrates: custom functional interfaces, lambda instantiation,
 * and lambdas as method parameters.
 */
public class Solution {

    // Higher-order method: behavior passed as a lambda
    static String process(String input, Function<String, String> transformer) {
        return transformer.apply(input);
    }

    public static void main(String[] args) {
        // 1-2. Lambdas for the Calculator SAM
        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;
        System.out.println("Custom calculator: 5 + 3 = " + add.calc(5, 3)
                + ", 5 * 3 = " + multiply.calc(5, 3));
        System.out.println("describe(): " + add.describe());

        // 3. Validator lambda
        Validator notEmpty = s -> s != null && !s.isEmpty();
        System.out.println("Validator: \"hello\" valid=" + notEmpty.test("hello")
                + ", \"\" valid=" + notEmpty.test(""));

        // 4. Behavior as a parameter
        String result = process("hello", s -> s.toUpperCase());
        System.out.println("Chained: processed(" + result + ")");

        // Composition: pass one lambda's output into another
        String chained = process("hello", s -> s.toUpperCase());
        System.out.println("As single-arg transformer: " + chained);
    }
}