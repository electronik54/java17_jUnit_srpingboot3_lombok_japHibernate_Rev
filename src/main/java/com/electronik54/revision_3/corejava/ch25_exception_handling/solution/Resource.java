package com.electronik54.revision_3.corejava.ch25_exception_handling.solution;

/** Simple AutoCloseable resource to demonstrate try-with-resources. */
public class Resource implements AutoCloseable {

    private final String name;

    public Resource(String name) {
        this.name = name;
        System.out.println(name + " opened");
    }

    public void use() {
        System.out.println(name + " used");
    }

    @Override
    public void close() {
        System.out.println(name + " closed");
    }
}