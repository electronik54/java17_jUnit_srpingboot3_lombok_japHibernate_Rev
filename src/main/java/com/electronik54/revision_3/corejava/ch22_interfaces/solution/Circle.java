package com.electronik54.revision_3.corejava.ch22_interfaces.solution;

public class Circle implements Drawable {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle with radius " + radius);
    }
}