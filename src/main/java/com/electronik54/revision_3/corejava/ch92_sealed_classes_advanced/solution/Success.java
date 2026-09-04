package com.electronik54.revision_3.corejava.ch92_sealed_classes_advanced.solution;

/** Leaf node: a successful computation carrying its value. */
public record Success<T>(T value) implements Result<T> {
}