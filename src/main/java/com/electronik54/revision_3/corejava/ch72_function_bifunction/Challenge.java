package com.electronik54.revision_3.corejava.ch72_function_bifunction;

/**
 * Challenge 72: Function<T,R>, BiFunction, UnaryOperator, BinaryOperator
 *
 * Problem:
 * Transform values with Function (T -> R), compose functions with
 * andThen()/compose() and observe the order difference, use BiFunction
 * (T,U -> R) for two-input logic, and the specialized UnaryOperator /
 * BinaryOperator when input and output types match.
 *
 * Hint:
 * - Function<String,Integer>: one input type, one output type
 * - f.andThen(g): g(f(x)) - f first; f.compose(g): f(g(x)) - g first
 * - UnaryOperator<T> = Function<T,T>; BinaryOperator<T> = BiFunction<T,T,T>
 * - Function.identity() returns its input unchanged
 *
 * Expected Output:
 * trim->upper: "HI"
 * upper->length via andThen: 5 / via compose order differs
 * BiFunction sum: 8
 * BinaryOperator max of (3, 7): 7
 *
 * TODO:
 * 1. trim then uppercase with andThen; compare with compose
 * 2. BiFunction (a,b) -> a+b on Integers
 * 3. UnaryOperator for ++; BinaryOperator.maxBy for the max of two strings
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 72: Function/BiFunction ===");
    }
}