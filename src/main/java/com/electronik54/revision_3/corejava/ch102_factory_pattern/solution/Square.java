package com.electronik54.revision_3.corejava.ch102_factory_pattern.solution;

/** Concrete product: a Square. */
public class Square implements Shape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Square with side " + side);
    }
}