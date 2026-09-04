package com.electronik54.revision_3.corejava.ch56_stream_map_flatmap.solution;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Solution for Challenge 56: Stream map/flatMap
 *
 * Demonstrates: transformations with map, type changes, and
 * flattening nested structures with flatMap.
 */
public class Solution {

    public static void main(String[] args) {
        // 1. map: square each
        List<Integer> squares = List.of(1, 2, 3).stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Squares: " + squares);

        // 2. map: change type (String -> Integer)
        List<Integer> lengths = List.of("cat", "dog", "horse").stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println("Lengths: " + lengths);

        // 3. flatMap: flatten nested lists
        List<List<Integer>> nested = List.of(List.of(1, 2), List.of(3, 4), List.of(5, 6));
        List<Integer> flat = nested.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println("Flattened: " + flat);

        // 4. flatMap: split words into unique sorted letters
        List<Character> letters = List.of("cab", "bad").stream()
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Unique flattened letters: " + letters);
    }
}