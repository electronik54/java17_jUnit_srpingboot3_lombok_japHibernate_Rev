package com.electronik54.revision_3.corejava.ch104_builder_pattern.solution;

/**
 * Solution for Challenge 104: Builder Pattern
 */
public class Solution {

    public static void main(String[] args) {
        Pizza pizza = new PizzaBuilder()
                .setSize("Large")
                .addCheese(true)
                .addPepperoni(true)
                .build();
        System.out.println(pizza);
    }
}