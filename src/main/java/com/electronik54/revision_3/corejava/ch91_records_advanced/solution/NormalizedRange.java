package com.electronik54.revision_3.corejava.ch91_records_advanced.solution;

/**
 * Record with a NORMALIZING compact constructor - silently fixes swapped bounds.
 */
public record NormalizedRange(int min, int max) {

    public NormalizedRange {
        if (min > max) {
            int temp = min;      // reassigning the (non-final-yet) components is allowed here
            min = max;
            max = temp;
        }
    }

    @Override
    public String toString() {
        return "Range[min=" + min + ", max=" + max + "]";
    }
}