package com.electronik54.revision_3.corejava.ch108_decorator_pattern.solution;

/** Adds Sugar. */
public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee decorated) {
        super(decorated);
    }

    @Override
    public double cost() {
        return super.cost() + 0.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }
}