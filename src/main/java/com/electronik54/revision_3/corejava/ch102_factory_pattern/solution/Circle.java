package com.electronik54.revision_3.corejava.ch102_factory_pattern.solution;

/** Concrete product: a Circle. */
public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius " + radius);
    }
}