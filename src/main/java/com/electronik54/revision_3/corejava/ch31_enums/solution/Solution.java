package com.electronik54.revision_3.corejava.ch31_enums.solution;

/**
 * Solution for Challenge 31: Enums
 *
 * Demonstrates: enum with fields/constructor, switch over enum,
 * values(), valueOf(), ordinal(), name().
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(OrderStatus.NEW);
        System.out.println(OrderStatus.SHIPPED);

        System.out.println("Can transition from NEW to SHIPPED: "
                + OrderStatus.NEW.canTransitionTo(OrderStatus.SHIPPED));

        // switch expression over enum (exhaustive - no default needed)
        OrderStatus status = OrderStatus.SHIPPED;
        String message = switch (status) {
            case NEW -> "Waiting for payment";
            case PAID -> "Preparing shipment";
            case SHIPPED -> "Track your package";
            case DELIVERED -> "Enjoy your purchase";
        };
        System.out.println("Message: " + message);

        // Introspection
        OrderStatus[] all = OrderStatus.values();
        System.out.println(status.name() + " is ordinal " + status.ordinal()
                + " of " + all.length + " constants");
        System.out.println("valueOf(\"PAID\") = " + OrderStatus.valueOf("PAID"));
    }
}