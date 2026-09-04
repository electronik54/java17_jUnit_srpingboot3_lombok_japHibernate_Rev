package com.electronik54.revision_3.corejava.ch37_set_operations.solution;

import java.util.*;

/**
 * Solution for Challenge 37: Set Operations
 *
 * Demonstrates: the three main Set implementations and set algebra.
 */
public class Solution {

    public static void main(String[] args) {
        String[] input = {"c", "a", "b", "a", "c"};

        Set<String> hashSet = new HashSet<>(List.of(input));
        Set<String> linkedSet = new LinkedHashSet<>(List.of(input));
        Set<String> treeSet = new TreeSet<>(List.of(input));

        System.out.println("HashSet:       " + hashSet + "        (unordered)");
        System.out.println("LinkedHashSet: " + linkedSet + "        (insertion order)");
        System.out.println("TreeSet:       " + treeSet + "        (sorted)");

        System.out.println("Duplicate add returned " + linkedSet.add("a"));

        Set<String> a = new HashSet<>(List.of("a", "b", "c"));
        Set<String> b = new HashSet<>(List.of("b", "c", "d"));

        Set<String> union = new HashSet<>(a);
        union.addAll(b);
        Set<String> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        Set<String> difference = new HashSet<>(a);
        difference.removeAll(b);

        System.out.println("Union: " + new TreeSet<>(union)
                + "  Intersection: " + new TreeSet<>(intersection)
                + "  Difference: " + new TreeSet<>(difference));
    }
}