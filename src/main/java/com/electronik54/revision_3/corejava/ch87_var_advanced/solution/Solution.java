package com.electronik54.revision_3.corejava.ch87_var_advanced.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Solution for Challenge 87: var Advanced
 *
 * Demonstrates: good vs bad var usage and inference rules.
 */
public class Solution {

    // Illegal (compile errors if uncommented):
    // private var field = "x";           // var NOT allowed for fields
    // var method(var param) { }          // NOT allowed for params/returns

    public static void main(String[] args) {
        // 1. GOOD: removes generic duplication
        var list = new ArrayList<String>();   // inferred: ArrayList<String>
        list.add("a");
        System.out.println("Inferred: " + list.getClass().getSimpleName());

        var map = new HashMap<String, List<Integer>>();  // long type, no duplication
        map.put("k", List.of(1));
        System.out.println("Map: " + map.getClass().getSimpleName());

        // 2. var in for-each over entrySet
        for (var entry : map.entrySet()) {    // inferred: Map.Entry<String, List<Integer>>
            System.out.println("var in for-each: key=" + entry.getKey());
        }

        // 3. Numeric literal decides the inferred type!
        var small = 5;                 // int
        var big = 5_000_000_000L;      // long (because of L suffix)
        var decimal = 5.0;             // double
        System.out.println("var 5 -> int: " + ((Object) small).getClass().getSimpleName());
        System.out.println("var 5_000_000_000L -> long: " + ((Object) big).getClass().getSimpleName());
        System.out.println("var 5.0 -> double: " + ((Object) decimal).getClass().getSimpleName());

        // 4. Illegal positions (comments):
        // var x;                       // no initializer - illegal
        // var y = null;                // cannot infer from null - illegal
        // var must be initialized in the same statement

        // interface types: var infers the CONCRETE type, not the interface
        var copy = List.of("a");       // inferred: ImmutableCollections.ListN, NOT List
        System.out.println("Interface pitfall: inferred " + copy.getClass().getSimpleName());
    }
}