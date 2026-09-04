package com.electronik54.revision_3.corejava.ch12_sealed_classes.solution;

/**
 * A sealed permitted subclass - restricts its own hierarchy further.
 * Only RightTriangle is allowed to extend Triangle.
 */
public sealed class Triangle extends Shape permits RightTriangle {

    private final double base;
    private final double height;

    protected Triangle(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
    }

    public Triangle(double base, double height) {
        this("Triangle", base, height);
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}
