package com.electronik54.revision_3.corejava.ch20_nested_classes.solution;

/**
 * Outer class hosting a static nested class and an inner class.
 */
public class Outer {

    private static int staticValue = 10;
    private int instanceValue = 20;

    // Static nested class - no reference to outer instance
    public static class StaticNested {
        public int getStaticValue() {
            return staticValue;
        }
    }

    // Inner class - implicitly holds a reference to the outer instance
    public class Inner {
        public int getInstanceValue() {
            return instanceValue;
        }
    }
}