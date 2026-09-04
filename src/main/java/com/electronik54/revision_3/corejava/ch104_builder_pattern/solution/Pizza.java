package com.electronik54.revision_3.corejava.ch104_builder_pattern.solution;

/**
 * Immutable product built by PizzaBuilder. No public constructor so the only
 * way to create one is via the builder.
 */
public class Pizza {
    private final String size;
    private final boolean cheese;
    private final boolean pepperoni;
    private final boolean mushrooms;

    Pizza(String size, boolean cheese, boolean pepperoni, boolean mushrooms) {
        this.size = size;
        this.cheese = cheese;
        this.pepperoni = pepperoni;
        this.mushrooms = mushrooms;
    }

    @Override
    public String toString() {
        return "Pizza[size=" + size + ", cheese=" + cheese
                + ", pepperoni=" + pepperoni + ", mushrooms=" + mushrooms + "]";
    }
}