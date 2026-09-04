package com.electronik54.revision_3.corejava.ch112_open_closed.solution;

import java.util.List;

/**
 * Closed for modification: no if/else chain. Adding a shape never edits this.
 */
public class AreaCalculator {

    public static double sum(List<Shape> shapes) {
        double total = 0.0;
        for (Shape s : shapes) {
            total += s.area();
        }
        return total;
    }
}