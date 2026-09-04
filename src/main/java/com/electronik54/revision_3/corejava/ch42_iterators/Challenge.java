package com.electronik54.revision_3.corejava.ch42_iterators;

import java.util.ArrayList;
import java.util.List;

/**
 * Challenge 42: Iterators (Iterator, ListIterator, fail-fast)
 *
 * Problem:
 * Remove even numbers from a list three ways: with an Iterator (correct),
 * with a for-each (ConcurrentModificationException!), and with
 * removeIf (idiomatic). Then use ListIterator for bidirectional traversal.
 *
 * Hint:
 * - NEVER modify a collection while in a for-each loop - fail-fast iterator
 * - iterator.remove() is the safe removal during traversal
 * - list.removeIf(n -> condition) uses Java 8 and is the cleanest option
 * - ListIterator adds previous(), hasPrevious(), add(), set()
 *
 * Expected Output:
 * Iterator removal: [1, 3, 5]
 * removeIf: [1, 3, 5]
 * Forward: 1 3 5 / Backward: 5 3 1
 * For-each + remove threw ConcurrentModificationException
 *
 * TODO:
 * 1. Remove evens via Iterator.remove()
 * 2. Attempt removal in for-each and catch ConcurrentModificationException
 * 3. Remove evens via removeIf
 * 4. Traverse forward then backward with ListIterator
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 42: Iterators ===");
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        System.out.println("Starting list: " + numbers);
    }
}