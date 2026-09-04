package com.electronik54.revision_3.corejava.ch91_records_advanced;

/**
 * Challenge 91: Records Advanced
 *
 * Problem:
 * Go beyond basic records: compact constructors for validation and
 * normalization, custom methods, static factories, records implementing
 * interfaces, and nested/record patterns with derived fields.
 *
 * Hint:
 * - Compact constructor: Range { if (min>max) throw ...; } - assigns happen AFTER the block
 * - Records are shallowly immutable: a List component can still be mutated - copy defensively!
 * - Records can implement interfaces and have static members
 * - Accessors are name() not getName()
 *
 * Expected Output:
 * Valid range: Range[min=1, max=10]
 * Invalid range threw: IllegalArgumentException: min > max
 * Normalized: Range[min=10, max=20]
 * Copy-on-write components stay safe: [c] (original unchanged)
 *
 * TODO:
 * 1. Range record with compact constructor validation (min <= max)
 * 2. Normalizing compact constructor (swap if reversed)
 * 3. Basket record holding a List<String> - defensively copy in the compact constructor
 * 4. Static factory + custom method (width())
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 91: Records Advanced ===");
    }
}