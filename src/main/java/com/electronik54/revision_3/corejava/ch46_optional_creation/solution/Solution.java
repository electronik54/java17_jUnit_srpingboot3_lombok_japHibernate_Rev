package com.electronik54.revision_3.corejava.ch46_optional_creation.solution;

import java.util.Optional;

/**
 * Solution for Challenge 46: Optional Creation
 *
 * Demonstrates: of() vs ofNullable() vs empty(), and the fail-fast NPE
 * of Optional.of(null).
 */
public class Solution {

    public static void main(String[] args) {
        // 1. of() - value MUST be non-null
        Optional<String> of = Optional.of("Hello");
        System.out.println("of: present -> " + of.get());

        // 2. ofNullable - tolerates null
        Optional<String> ofNullableValue = Optional.ofNullable("Hello");
        Optional<String> ofNullableNull = Optional.ofNullable(null);
        System.out.println("ofNullable(value): " + (ofNullableValue.isPresent() ? "present -> " + ofNullableValue.get() : "empty"));
        System.out.println("ofNullable(null): empty=" + ofNullableNull.isEmpty());

        // 3. empty()
        Optional<String> none = Optional.empty();
        System.out.println("empty(): empty=" + none.isEmpty());

        // 4. of(null) fails fast
        try {
            Optional.of(null);
        } catch (NullPointerException e) {
            System.out.println("of(null) threw: NullPointerException");
        }
    }
}