package com.electronik54.revision_3.corejava.ch70_predicate.solution;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Solution for Challenge 70: Predicate
 *
 * Demonstrates: test, combiners (and/or/negate), isEqual, BiPredicate.
 */
public class Solution {

    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isPositive = n -> n > 0;
        Predicate<Integer> isSmall = n -> n < 0;

        // 1. test()
        System.out.println("isEven.test(4) = " + isEven.test(4));

        // 2. Combiners
        System.out.println("isEven and isPositive (4) = " + isEven.and(isPositive).test(4)
                + " / (-2) = " + isEven.and(isPositive).test(-2));
        System.out.println("isEven or isSmall (-3) = " + isEven.or(isSmall).test(-3));
        System.out.println("negated (4) = " + isEven.negate().test(4));

        // 3. Filtering with a composed predicate
        List<Person> people = List.of(new Person("Alice", 17), new Person("Bob", 25));
        Predicate<Person> isAdult = p -> p.age() >= 18;
        Predicate<Person> isNamedBob = p -> p.name().equals("Bob");
        List<Person> adults = people.stream()
                .filter(isAdult.and(isNamedBob))
                .collect(Collectors.toList());
        System.out.println("Filtered adults named Bob: " + adults.stream()
                .map(p -> p.name() + "(" + p.age() + ")").collect(Collectors.toList()));

        // 4. Predicate.isEqual
        Predicate<String> isYes = Predicate.isEqual("yes");
        System.out.println("isEqual(\"yes\") (\"yes\") = " + isYes.test("yes"));

        // 5. BiPredicate: two arguments
        java.util.function.BiPredicate<String, Integer> longEnough =
                (s, min) -> s.length() >= min;
        System.out.println("BiPredicate \"hello\" >= 5: " + longEnough.test("hello", 5));
    }
}