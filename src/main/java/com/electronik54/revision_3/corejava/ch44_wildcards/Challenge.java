package com.electronik54.revision_3.corejava.ch44_wildcards;

import java.util.List;

/**
 * Challenge 44: Wildcards (?, extends, super)
 *
 * Problem:
 * Implement the classic Producer Extends / Consumer Super (PECS) methods:
 * sumAll(List<? extends Number>) to READ, and fillWithDefaults
 * (List<? super Integer>) to WRITE. Also show why List<String> is not a
 * List<Object>.
 *
 * Hint:
 * - ? extends Number = some unknown subtype of Number: safe to READ as Number
 * - ? super Integer = some unknown supertype: safe to WRITE Integers
 * - List<String> is NOT a List<Object> - generics are invariant!
 *
 * Expected Output:
 * sum of [1, 2.5] = 3.5
 * Filled: [0, 0, 0]
 * List<String> is not a List<Object> (invariance) - compile error if attempted
 *
 * TODO:
 * 1. double sumAll(List<? extends Number> items)
 * 2. void fillWithDefaults(List<? super Integer> list, int count)
 * 3. Demonstrate both; explain invariance in comments
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 44: Wildcards ===");
    }
}