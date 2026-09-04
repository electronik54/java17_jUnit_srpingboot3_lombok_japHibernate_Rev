package com.electronik54.revision_3.corejava.ch54_stream_creation.solution;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Solution for Challenge 54: Stream Creation
 *
 * Demonstrates: all common stream sources.
 */
public class Solution {

    public static void main(String[] args) {
        // From collection
        List<String> fromList = List.of("a", "b", "c").stream().collect(Collectors.toList());
        System.out.println("From list: " + fromList);

        // From array
        int[] nums = {10, 20, 30};
        System.out.println("From array sum: " + Arrays.stream(nums).sum());

        // Stream.of (fixed values)
        System.out.println("Stream.of: " + Stream.of("x", "y").toList());

        // Stream.iterate - bounded infinite stream
        List<Integer> powers = Stream.iterate(1, n -> n * 2)
                .limit(4)
                .collect(Collectors.toList());
        System.out.println("Iterate powers of 2: " + powers);

        // Stream.generate - bounded infinite stream
        List<String> generated = Stream.generate(() -> "x").limit(3).collect(Collectors.toList());
        System.out.println("Generate: " + generated);

        // From String chars
        List<Character> chars = "java".chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());
        System.out.println("From string chars: " + chars);

        // Empty stream
        System.out.println("Empty stream count: " + Stream.empty().count());

        // Concat
        List<String> concat = Stream.concat(Stream.of("a"), Stream.of("b")).toList();
        System.out.println("Concat: " + concat);
    }
}