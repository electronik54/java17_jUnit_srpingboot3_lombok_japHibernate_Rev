package com.electronik54.revision_3.corejava.ch72_function_bifunction.solution;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * Solution for Challenge 72: Function, BiFunction, Unary/BinaryOperator
 *
 * Demonstrates: transformation, composition order, two-input functions,
 * and the same-type specializations.
 */
public class Solution {

    public static void main(String[] args) {
        // 1. Function + composition
        Function<String, String> trim = String::trim;
        Function<String, String> upper = String::toUpperCase;
        Function<String, Integer> length = String::length;

        String hi = trim.andThen(upper).apply("  hi  ");
        System.out.println("trim->upper: \"" + hi + "\"");

        // andThen vs compose: order of execution
        Function<String, Integer> upperThenLength = upper.andThen(length);
        Function<String, Integer> lengthOfUpper = length.compose(upper);
        System.out.println("andThen \"hello\": " + upperThenLength.apply("hello")
                + "  compose \"hello\": " + lengthOfUpper.apply("hello"));

        // 2. BiFunction: two inputs -> one output
        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
        System.out.println("BiFunction sum: " + sum.apply(3, 5));

        // 3. UnaryOperator: same type in/out
        UnaryOperator<Integer> increment = n -> n + 1;
        System.out.println("UnaryOperator increment(3): " + increment.apply(3));

        // BinaryOperator: max of two strings by natural order
        BinaryOperator<String> maxStr = BinaryOperator.maxBy(String::compareTo);
        System.out.println("BinaryOperator max of (apple, banana): " + maxStr.apply("apple", "banana"));

        // identity
        Function<String, String> id = Function.identity();
        System.out.println("Function.identity(): " + id.apply("unchanged"));
    }
}