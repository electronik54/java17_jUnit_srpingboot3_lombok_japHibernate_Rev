package com.electronik54.revision_3.corejava.ch31_enums.solution;

/**
 * Enum with fields, constructor and behavior.
 * Constants are the ONLY instances - the constructor is implicitly private.
 */
public enum OrderStatus {
    NEW(100, "Order received"),
    PAID(200, "Payment confirmed"),
    SHIPPED(300, "Order on the way"),
    DELIVERED(400, "Order delivered");

    private final int code;
    private final String description;

    OrderStatus(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    /** Only forward transitions allowed. */
    public boolean canTransitionTo(OrderStatus next) {
        return next.code > this.code;
    }

    @Override
    public String toString() {
        return name() + "(" + code + "): " + description;
    }
}