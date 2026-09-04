package com.electronik54.revision_3.corejava.ch113_liskov_substitution.solution;

/** Square is NOT a Rectangle subclass here - avoids the classic LSP trap. */
public class Square implements Shape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}