package com.electronik54.revision_3.lombok.ch96_lombok_data;

/**
 * Challenge 96: Lombok @Value, @EqualsAndHashCode, @ToString, @NonNull
 *
 * Problem:
 * Create an 'ImmutableConfig' class using @Value (immutable), and an
 * 'OrderLine' class with @EqualsAndHashCode(exclude="lineTotal"),
 * @ToString, and @NonNull on the product name.
 *
 * Hint:
 * - @Value makes all fields private final: all-args ctor, getters, no setters
 * - @NonNull triggers a NullPointerException when null is passed to the constructor
 * - @EqualsAndHashCode(exclude=...) ignores fields in equals/hashCode
 *
 * Expected Output:
 * ImmutableConfig(dbUrl=jdbc:h2:mem, maxThreads=10)
 * Cannot create OrderLine with null product -> NullPointerException
 * lineA.equals(lineB) ignoring lineTotal: true
 * lineA.toString(): OrderLine(product=Laptop, qty=2, lineTotal=200.0)
 *
 * TODO:
 * 1. Create ImmutableConfig with @Value (dbUrl, maxThreads)
 * 2. Create OrderLine with @Getter, @AllArgsConstructor, @NonNull product, qty
 *    and a @ToString.Include label for lineTotal
 * 3. Demonstrate that @Value objects have no setters (immutable)
 * 4. Trigger @NonNull by passing null, then show equals ignoring transient-like field
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 96: Lombok @Value / @NonNull / equals ===");
    }
}