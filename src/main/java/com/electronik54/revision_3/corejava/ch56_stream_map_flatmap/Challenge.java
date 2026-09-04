package com.electronik54.revision_3.corejava.ch56_stream_map_flatmap;

import java.util.List;

/**
 * Challenge 56: Stream map() and flatMap()
 *
 * Problem:
 * Transform streams: square numbers with map, convert to different types,
 * and flatten a list of lists with flatMap (the classic nested-structure
 * problem).
 *
 * Hint:
 * - map: 1 element -> 1 element (transform)
 * - flatMap: 1 element -> MANY elements (flattens the stream of streams)
 * - mapToInt gives access to sum()/average() on primitives
 *
 * Expected Output:
 * Squares: [1, 4, 9]
 * Lengths: [3, 3, 5]
 * Flattened: [1, 2, 3, 4, 5, 6]
 * Unique flattened letters: [a, b, c, d]
 *
 * TODO:
 * 1. Square 1..3 with map
 * 2. Map strings to their lengths
 * 3. Flatten List<List<Integer>> with flatMap
 * 4. Flatten List<String> words into unique characters, sorted
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 56: Stream map/flatMap ===");
        List<List<Integer>> nested = List.of(List.of(1, 2), List.of(3, 4), List.of(5, 6));
        System.out.println("Nested source: " + nested);
    }
}