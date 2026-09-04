package com.electronik54.revision_3.corejava.ch91_records_advanced.solution;

/**
 * Record with a VALIDATING compact constructor.
 * Assignments to the components happen automatically AFTER this block.
 */
public record Range(int min, int max) {

    public Range {
        if (min > max) {
            throw new IllegalArgumentException("min > max");
        }
    }

    // Static factory
    public static Range ofSize(int start, int size) {
        return new Range(start, start + size);
    }

    // Custom method - derived value
    public int width() {
        return max - min;
    }

    @Override
    public String toString() {
        return "Range[min=" + min + ", max=" + max + "]";
    }
}