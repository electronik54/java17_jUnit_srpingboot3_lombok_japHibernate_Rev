package com.electronik54.revision_3.corejava.ch104_builder_pattern.solution;

/**
 * Fluent builder. Each step returns 'this' so calls can be chained.
 */
public class PizzaBuilder {
    private String size = "Medium";
    private boolean cheese = false;
    private boolean pepperoni = false;
    private boolean mushrooms = false;

    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder addCheese(boolean cheese) {
        this.cheese = cheese;
        return this;
    }

    public PizzaBuilder addPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
        return this;
    }

    public PizzaBuilder addMushrooms(boolean mushrooms) {
        this.mushrooms = mushrooms;
        return this;
    }

    public Pizza build() {
        if (size == null || size.isBlank()) {
            throw new IllegalArgumentException("Size is required");
        }
        return new Pizza(size, cheese, pepperoni, mushrooms);
    }
}