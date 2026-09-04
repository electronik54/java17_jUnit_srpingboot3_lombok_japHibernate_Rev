package com.electronik54.revision_3.corejava.ch169_interview_prep.solution;

/**
 * Solution 169: Debugging Techniques
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 169: Debugging Techniques ===\n");
        System.out.println("Debugger Features (IntelliJ IDEA):");
        System.out.println("  Breakpoints: Line, Method, Exception, Field watch");
        System.out.println("  Conditional breakpoints: 'value == 42 && index > 5'");
        System.out.println("  Step Over (F8): Execute current line, go to next");
        System.out.println("  Step Into (F7): Enter method call");
        System.out.println("  Step Out (Shift+F8): Return to caller");
        System.out.println("  Evaluate Expression (Alt+F8): Run code in context");
        System.out.println("  Watches: Track variable values");
        System.out.println("\nCommon bugs to debug:");
        System.out.println("  - Infinite loops: check loop conditions");
        System.out.println("  - NPE: check object initialization");
        System.out.println("  - Race conditions: check thread synchronization");
        System.out.println("  - Off-by-one: check array bounds");
        System.out.println("  - Integer overflow: use long or >>> for mid");
    }
}