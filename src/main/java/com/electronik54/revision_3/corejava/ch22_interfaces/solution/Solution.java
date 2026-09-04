package com.electronik54.revision_3.corejava.ch22_interfaces.solution;

/**
 * Solution for Challenge 22: Interfaces
 *
 * Demonstrates: abstract, default and static interface methods,
 * plus polymorphism through an interface reference.
 */
public class Solution {

    public static void main(String[] args) {
        Drawable[] drawables = { new Circle(3.0), new Square(4.0) };

        for (Drawable d : drawables) {
            d.draw();          // polymorphic call
        }

        drawables[0].info();   // default method
        System.out.println("Category: " + Drawable.category());  // static on the interface
    }
}