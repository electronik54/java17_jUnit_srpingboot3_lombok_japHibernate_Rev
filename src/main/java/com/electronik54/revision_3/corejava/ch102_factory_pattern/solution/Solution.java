package com.electronik54.revision_3.corejava.ch102_factory_pattern.solution;

/**
 * Solution for Challenge 102: Factory Method Pattern
 */
public class Solution {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.createShape("circle", 5.0);
        circle.draw();

        Shape square = factory.createShape("square", 4.0);
        square.draw();
    }
}