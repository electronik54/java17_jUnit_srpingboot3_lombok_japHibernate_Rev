package com.electronik54.revision_3.corejava.ch102_factory_pattern.solution;

/**
 * Factory Method: centralizes creation. The caller depends only on Shape.
 */
public class ShapeFactory {

    public Shape createShape(String type, double param) {
        switch (type.toLowerCase()) {
            case "circle":
                return new Circle(param);
            case "square":
                return new Square(param);
            default:
                throw new IllegalArgumentException("Unknown shape type: " + type);
        }
    }
}