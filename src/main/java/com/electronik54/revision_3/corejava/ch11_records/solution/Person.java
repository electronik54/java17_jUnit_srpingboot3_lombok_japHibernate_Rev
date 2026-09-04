package com.electronik54.revision_3.corejava.ch11_records.solution;

/**
 * Person record - immutable data carrier.
 * Auto-generates: constructor, getters, equals, hashCode, toString
 */
public record Person(String name, int age) {
    // Compact constructor for validation
    public Person {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
}