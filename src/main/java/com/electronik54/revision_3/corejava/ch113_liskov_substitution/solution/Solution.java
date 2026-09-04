package com.electronik54.revision_3.corejava.ch113_liskov_substitution.solution;

import java.util.List;

/**
 * Solution for Challenge 113: Liskov Substitution Principle
 */
public class Solution {

    public static void main(String[] args) {
        // Both are substitutable as Shape - LSP satisfied
        List<Shape> shapes = List.of(
                new Rectangle(4.0, 6.0),
                new Square(5.0));

        for (Shape s : shapes) {
            System.out.println(s.getClass().getSimpleName() + " area: " + s.area());
        }
    }
}