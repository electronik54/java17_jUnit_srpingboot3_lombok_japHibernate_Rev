package com.electronik54.revision_3.corejava.ch12_sealed_classes.solution;

/**
 * Only RightTriangle is allowed to extend Triangle, because Triangle is sealed
 * and permits exactly this subclass.
 */
public final class RightTriangle extends Triangle {

    public RightTriangle(double base, double height) {
        super("RightTriangle", base, height);
    }

    public double hypotenuse() {
        return Math.sqrt(getBase() * getBase() + getHeight() * getHeight());
    }
}
