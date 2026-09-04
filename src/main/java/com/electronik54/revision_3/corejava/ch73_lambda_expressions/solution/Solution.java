package com.electronik54.revision_3.corejava.ch73_lambda_expressions.solution;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Solution for Challenge 73: Lambda Expressions
 *
 * Demonstrates: syntax variants, block bodies, closures over
 * effectively-final variables, anonymous class replacement.
 */
public class Solution {

    public static void main(String[] args) {
        // 1. Syntax variants
        Supplier<Integer> zeroArg = () -> 42;
        Function<String, String> oneArg = s -> s.toUpperCase();     // no parens needed
        BiFunction<Integer, Integer, Integer> twoArg = (a, b) -> a + b;
        System.out.println("Zero-arg: " + zeroArg.get()
                + " / One-arg: " + oneArg.apply("hello")
                + " / Two-arg: " + twoArg.apply(3, 5));

        // 2. Block body with explicit return
        Function<Integer, String> classify = n -> {
            if (n > 10) return "big";
            if (n > 5) return "medium";
            return "small";
        };
        System.out.println("Block: classify(5) = " + classify.apply(5));

        // 3. Effectively-final capture (closure)
        int factor = 3;
        Function<Integer, Integer> multiply = n -> n * factor;   // captures factor
        System.out.println("Captured factor=3, product=" + multiply.apply(4));
        // factor = 4;   // COMPILE ERROR: variable must be effectively final

        // 4. Anonymous class -> lambda
        Runnable anonymous = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous class style");
            }
        };
        Runnable lambda = () -> System.out.println("Lambda style");
        anonymous.run();
        lambda.run();
    }
}