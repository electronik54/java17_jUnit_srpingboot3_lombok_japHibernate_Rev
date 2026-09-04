package com.electronik54.revision_3.corejava.ch69_functional_interfaces.solution;

@FunctionalInterface
public interface Calculator {
    int calc(int a, int b);

    // default methods are allowed - interface stays functional
    default String describe() {
        return "a two-int calculator";
    }
}