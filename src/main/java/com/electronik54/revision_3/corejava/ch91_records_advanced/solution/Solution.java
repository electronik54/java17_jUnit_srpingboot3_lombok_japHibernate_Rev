package com.electronik54.revision_3.corejava.ch91_records_advanced.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution for Challenge 91: Records Advanced
 *
 * Demonstrates: validating/normalizing compact constructors, defensive
 * copies, static factories, and derived methods.
 */
public class Solution {

    public static void main(String[] args) {
        // 1. Validating compact constructor
        Range range = new Range(1, 10);
        System.out.println("Valid range: " + range + ", width=" + range.width());
        try {
            new Range(10, 1);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid range threw: IllegalArgumentException: " + e.getMessage());
        }

        // 2. Normalizing compact constructor
        System.out.println("Normalized: " + new NormalizedRange(20, 10));

        // 3. Defensive copy of a mutable component
        List<String> mutable = new ArrayList<>(List.of("a", "b"));
        Basket basket = new Basket(mutable);
        mutable.add("INJECTED");
        System.out.println("Copy-on-write components stay safe: " + basket.items());

        // 4. Static factory
        Range sized = Range.ofSize(5, 3);
        System.out.println("Static factory: " + sized + ", width=" + sized.width());
    }
}