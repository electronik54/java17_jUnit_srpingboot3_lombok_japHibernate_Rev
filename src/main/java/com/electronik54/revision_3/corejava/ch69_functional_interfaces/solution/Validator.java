package com.electronik54.revision_3.corejava.ch69_functional_interfaces.solution;

@FunctionalInterface
public interface Validator {
    boolean test(String s);
}