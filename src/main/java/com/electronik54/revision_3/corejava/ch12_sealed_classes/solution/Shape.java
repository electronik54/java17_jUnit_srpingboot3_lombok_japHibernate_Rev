package com.electronik54.revision_3.corejava.ch12_sealed_classes.solution;

/**
 * Sealed class - only the classes listed in 'permits' can extend this class.
 * Introduced as a standard feature in Java 17 (JEP 409).
 */
public sealed class Shape permits Circle, Rectangle, Triangle {

    private final String name;

    protected Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double area() {
        return 0.0;
    }
}
