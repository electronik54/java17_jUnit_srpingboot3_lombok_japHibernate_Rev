package com.electronik54.revision_3.corejava.ch20_nested_classes.solution;

/**
 * Solution for Challenge 20: Nested Classes
 *
 * Demonstrates: static nested, inner, local, and anonymous classes.
 */
public class Solution {

    public static void main(String[] args) {
        // 1. Static nested - created WITHOUT an Outer instance
        Outer.StaticNested staticNested = new Outer.StaticNested();
        System.out.println("Static nested: " + staticNested.getStaticValue());

        // 2. Inner class - requires an Outer instance (outerInstance.new Inner())
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        System.out.println("Inner: " + inner.getInstanceValue());

        // 3. Local class - declared inside a method body
        class Local {
            int getValue() {
                return 30;
            }
        }
        System.out.println("Local class: " + new Local().getValue());

        // 4. Anonymous class - implements Runnable on the fly
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous: Running anonymous task!");
            }
        };
        task.run();
    }
}