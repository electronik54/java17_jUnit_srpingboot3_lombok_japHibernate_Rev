package com.electronik54.revision_3.corejava.ch108_decorator_pattern.solution;

/** Concrete component. */
public class BaseCoffee implements Coffee {
    @Override
    public double cost() {
        return 2.6;
    }

    @Override
    public String getDescription() {
        return "Base coffee";
    }
}