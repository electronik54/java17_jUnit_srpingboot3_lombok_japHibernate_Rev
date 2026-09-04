package com.electronik54.revision_3.corejava.ch33_reflection.solution;

/** Target class for reflection exercises. */
public class Secret {

    @SuppressWarnings("unused")
    private String name;

    @SuppressWarnings("unused")
    private String greet() {
        return "Hello from private method, " + name;
    }
}