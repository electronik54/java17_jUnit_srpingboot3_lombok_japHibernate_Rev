package com.electronik54.revision_3.corejava.ch43_generics.solution;

/** Generic container. */
public class Box<T> {

    private T value;

    public void put(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public boolean isEmpty() {
        return value == null;
    }
}