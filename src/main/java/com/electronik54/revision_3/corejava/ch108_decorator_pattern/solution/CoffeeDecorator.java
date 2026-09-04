package com.electronik54.revision_3.corejava.ch108_decorator_pattern.solution;

/** Base decorator: wraps a Coffee and forwards calls. */
public abstract class CoffeeDecorator implements Coffee {
    protected final Coffee decorated;

    public CoffeeDecorator(Coffee decorated) {
        this.decorated = decorated;
    }

    @Override
    public double cost() {
        return decorated.cost();
    }

    @Override
    public String getDescription() {
        return decorated.getDescription();
    }
}