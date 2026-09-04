package com.electronik54.revision_3.corejava.ch12_sealed_classes.solution;

/**
 * A final permitted subclass of Shape - cannot be extended further.
 */
public final class Rectangle extends Shape {

    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double area() {
        return length * width;
    }
}
