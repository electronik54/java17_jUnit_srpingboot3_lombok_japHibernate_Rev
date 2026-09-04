package com.electronik54.revision_3.corejava.ch22_interfaces.solution;

public class Square implements Drawable {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square with side " + side);
    }
}