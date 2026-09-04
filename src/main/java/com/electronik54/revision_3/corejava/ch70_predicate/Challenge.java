package com.electronik54.revision_3.corejava.ch70_predicate;

import java.util.List;

/**
 * Challenge 70: Predicate<T>
 *
 * Problem:
 * Master the Predicate functional interface: test(), combining with
 * and()/or()/negate(), using Predicate.isEqual, and filtering a list
 * with a composed predicate.
 *
 * Hint:
 * - Predicate<T> = T -> boolean (the "if" of functional programming)
 * - Combiners build complex conditions from simple reusable pieces
 * - Predicate.isEqual(value) == x -> x.equals(value)
 * - BiPredicate<T,U> takes two arguments
 *
 * Expected Output:
 * isEven.test(4) = true
 * isEven and isPositive (4) = true / (-2) = false
 * isEven or isSmall (-3) = true
 * negated (4) = false
 * Filtered adults: [Bob(25)]
 * isEqual("yes") ("yes") = true
 *
 * TODO:
 * 1. isEven and isPositive predicates; test each
 * 2. Combine with and(), or(), negate()
 * 3. Filter Person list for adults (age >= 18) with a composed predicate
 * 4. Use Predicate.isEqual
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 70: Predicate ===");
        System.out.println("People: Alice(17), Bob(25)");
    }
}