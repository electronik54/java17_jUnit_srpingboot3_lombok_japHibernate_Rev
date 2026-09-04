package com.electronik54.revision_3.corejava.ch38_map_operations.solution;

import java.util.*;

/**
 * Solution for Challenge 38: Map Operations
 *
 * Demonstrates: word frequency with merge, Map ordering behaviors,
 * getOrDefault, and null-key rules.
 */
public class Solution {

    public static void main(String[] args) {
        String sentence = "java is fun java";

        Map<String, Integer> freq = new HashMap<>();
        for (String w : sentence.split(" ")) {
            freq.merge(w, 1, Integer::sum);      // idiomatic counting
        }
        System.out.println("Frequencies: " + freq);

        Map<String, Integer> linked = new LinkedHashMap<>(freq);
        Map<String, Integer> tree = new TreeMap<>(freq);
        System.out.println("LinkedHashMap insertion order: " + linked);
        System.out.println("TreeMap sorted by key:        " + tree);

        System.out.println("getOrDefault(missing) = " + freq.getOrDefault("missing", 0));

        // Null keys
        Map<String, Integer> nullable = new HashMap<>();
        nullable.put(null, 0);                   // OK: one null key allowed
        System.out.println("HashMap null key value: " + nullable.get(null));
        try {
            new TreeMap<String, Integer>().put(null, 0);
        } catch (NullPointerException e) {
            System.out.println("TreeMap rejects null keys: NullPointerException");
        }
    }
}