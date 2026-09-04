package com.electronik54.revision_3.corejava.ch58_stream_terminal.solution;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Solution for Challenge 58: Terminal Operations
 *
 * Demonstrates: forEach, collect to list/set, toArray, count,
 * and forEachOrdered on parallel streams.
 */
public class Solution {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3);

        // 1. forEach
        System.out.print("forEach: ");
        numbers.stream().forEach(n -> System.out.print(n + " "));
        System.out.println();

        // 2. collect to List and Set
        List<Integer> list = numbers.stream().collect(Collectors.toList());
        Set<Integer> sortedSet = numbers.stream().collect(Collectors.toCollection(TreeSet::new));
        System.out.println("Collected list: " + list + "  Set: " + sortedSet);

        // 3. toArray
        String[] strings = Stream.of("a", "b", "c").toArray(String[]::new);
        Object[] objects = Stream.of("a", "b", "c").toArray();
        System.out.println("Array: " + strings.length + " strings, " + objects.length + " objects");

        // 4. count
        System.out.println("Count: " + numbers.stream().count());

        // Parallel: forEach order not guaranteed, forEachOrdered is
        System.out.print("forEachOrdered parallel: ");
        numbers.parallelStream().forEachOrdered(n -> System.out.print(n + " "));
        System.out.println();
    }
}