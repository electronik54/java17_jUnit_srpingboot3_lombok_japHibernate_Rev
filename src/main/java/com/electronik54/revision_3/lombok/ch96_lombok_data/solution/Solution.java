package com.electronik54.revision_3.lombok.ch96_lombok_data.solution;

/**
 * Solution for Challenge 96: Lombok @Value, @EqualsAndHashCode, @NonNull
 */
public class Solution {

    public static void main(String[] args) {
        ImmutableConfig cfg = new ImmutableConfig("jdbc:h2:mem", 10);
        System.out.println(cfg);

        // @NonNull -> NPE
        try {
            new OrderLine(null, 2, 200.0);
            System.out.println("No exception?!");
        } catch (NullPointerException e) {
            System.out.println("Cannot create OrderLine with null product -> NullPointerException");
        }

        OrderLine a = new OrderLine("Laptop", 2, 200.0);
        OrderLine b = new OrderLine("Laptop", 2, 999.0); // diff lineTotal
        System.out.println("lineA.equals(lineB) ignoring lineTotal: " + a.equals(b));
        System.out.println("lineA.toString(): " + a);
    }
}