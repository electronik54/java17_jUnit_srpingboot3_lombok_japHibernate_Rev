package com.electronik54.revision_3.corejava.ch75_immutable_programming.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Solution for Challenge 75: Immutable Programming
 *
 * Demonstrates: unmodifiable views vs true immutability, defensive
 * design with immutable value classes, and non-mutating transformations.
 */
public class Solution {

    public static void main(String[] args) {
        // 1. Unmodifiable VIEW is not immutable - backing list leaks
        List<String> backing = new ArrayList<>(List.of("a", "b"));
        List<String> view = Collections.unmodifiableList(backing);
        backing.add("c");
        System.out.println("Unmodifiable view reflects backing list change: " + view + "  <- leak!");

        // 2. List.of is truly immutable
        try {
            List.of("a", "b").add("c");
        } catch (UnsupportedOperationException e) {
            System.out.println("List.of rejects add: UnsupportedOperationException");
        }

        // 3. Immutable value class
        Money one = new Money(100);
        Money two = new Money(50);
        Money total = one.plus(two);          // returns NEW instance
        System.out.println("Immutable ops: " + one + " + " + two + " = " + total
                + " (originals unchanged)");

        // 4. Transformation returns a NEW list
        List<String> original = List.of("a", "b");
        List<String> transformed = original.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Transformation returns NEW list: " + transformed
                + " (original untouched: " + original + ")");
    }
}