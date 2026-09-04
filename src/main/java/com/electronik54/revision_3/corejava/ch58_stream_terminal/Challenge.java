package com.electronik54.revision_3.corejava.ch58_stream_terminal;

import java.util.List;

/**
 * Challenge 58: Terminal Operations (forEach, toArray, collect, count)
 *
 * Problem:
 * Apply the main "draining" terminal operations: forEach and
 * forEachOrdered, collect to a list/set, toArray, and count. Understand
 * that nothing happens without one of these.
 *
 * Hint:
 * - forEach on a parallel stream has NO guaranteed order; forEachOrdered does
 * - collect(Collector) is the general-purpose reduction to a container
 * - count() returns long, not int
 *
 * Expected Output:
 * forEach: 1 2 3
 * Collected list: [1, 2, 3]  Set: [1, 2, 3]
 * Array: [1, 2, 3]
 * Count: 3
 *
 * TODO:
 * 1. Print elements with forEach
 * 2. Collect a stream to a List and to a TreeSet
 * 3. Convert a stream to an array (String[] and Object[])
 * 4. Count elements
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 58: Terminal Operations ===");
        System.out.println("Source: " + List.of(1, 2, 3));
    }
}