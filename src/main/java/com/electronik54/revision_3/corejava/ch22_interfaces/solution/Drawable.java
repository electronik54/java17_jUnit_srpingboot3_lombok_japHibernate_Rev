package com.electronik54.revision_3.corejava.ch22_interfaces.solution;

public interface Drawable {

    // Abstract by default - implementers MUST provide a body
    void draw();

    // Default method - shared behavior, implementers may override
    default void info() {
        System.out.println("I am a drawable shape (" + getClass().getSimpleName() + ")");
    }

    // Static method - belongs to the interface itself
    static String category() {
        return "2D Shapes";
    }
}