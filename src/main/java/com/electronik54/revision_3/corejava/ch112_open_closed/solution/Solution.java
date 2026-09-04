package com.electronik54.revision_3.corejava.ch112_open_closed.solution;

import java.util.List;

/**
 * Solution for Challenge 112: Open/Closed Principle
 */
public class Solution {

    public static void main(String[] args) {
        List<Shape> shapes = List.of(
                new Circle(2.0),
                new Rectangle(4.0, 6.0),
                new Triangle(10.0, 5.0));

        double total = AreaCalculator.sum(shapes);
        System.out.printf("Total area: %.1f%n", total);
    }
}