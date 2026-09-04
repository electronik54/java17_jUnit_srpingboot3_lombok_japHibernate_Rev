package com.electronik54.revision_3.corejava.ch92_sealed_classes_advanced.solution;

/** Leaf node: an expected failure carrying a code and message. */
public record Error(int code, String message) implements Result<Integer> {
}