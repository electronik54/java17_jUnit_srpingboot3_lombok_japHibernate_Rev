package com.electronik54.revision_3.corejava.ch12_sealed_classes.solution;

/**
 * One of the permitted subclasses of Shape.
 * A permitted subclass MUST be either final, sealed, or non-sealed.
 */
public final class Circle extends Shape {

    private final double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
