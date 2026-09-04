package com.electronik54.revision_3.corejava.ch108_decorator_pattern.solution;

/** Adds Milk. */
public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee decorated) {
        super(decorated);
    }

    @Override
    public double cost() {
        return super.cost() + 0.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }
}