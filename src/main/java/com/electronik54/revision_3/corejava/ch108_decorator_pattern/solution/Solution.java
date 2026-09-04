package com.electronik54.revision_3.corejava.ch108_decorator_pattern.solution;

/**
 * Solution for Challenge 108: Decorator Pattern
 */
public class Solution {

    public static void main(String[] args) {
        Coffee coffee = new MilkDecorator(new SugarDecorator(new BaseCoffee()));
        System.out.println(coffee.getDescription() + " : " + coffee.cost());
    }
}