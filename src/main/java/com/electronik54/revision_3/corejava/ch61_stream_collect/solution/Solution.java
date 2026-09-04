package com.electronik54.revision_3.corejava.ch61_stream_collect.solution;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Solution for Challenge 61: Collectors
 *
 * Demonstrates: toList, toSet, toCollection, toUnmodifiableList,
 * and toMap with merge functions.
 */
public class Solution {

    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana");

        // 1. List and Set
        List<String> list = fruits.stream().collect(Collectors.toList());
        Set<String> set = fruits.stream().collect(Collectors.toSet());
        System.out.println("List: " + list + "  Set: " + set);

        // TreeSet via toCollection
        TreeSet<String> sorted = fruits.stream()
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("Sorted set: " + sorted);

        // Unmodifiable
        List<String> unmod = fruits.stream().collect(Collectors.toUnmodifiableList());
        System.out.println("Unmodifiable list: " + unmod);

        // 2. toMap: word -> length
        Map<String, Integer> byLength = fruits.stream()
                .collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println("Map by length: " + byLength);

        // 3. toMap with duplicate keys requires a merge function
        Map<Character, Integer> charCount = List.of("A", "A").stream()
                .collect(Collectors.toMap(
                        s -> s.charAt(0),      // key
                        s -> 1,                // value
                        Integer::sum));        // merge duplicates
        System.out.println("Merge on duplicate: " + charCount);
    }
}