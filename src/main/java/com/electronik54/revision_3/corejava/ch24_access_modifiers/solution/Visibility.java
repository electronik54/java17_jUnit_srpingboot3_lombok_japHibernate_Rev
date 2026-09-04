package com.electronik54.revision_3.corejava.ch24_access_modifiers.solution;

/**
 * One class, one field per access level.
 */
public class Visibility {

    private int privateField = 1;       // same class only
    int defaultField = 2;               // same package (no modifier)
    protected int protectedField = 3;   // same package + subclasses
    public int publicField = 4;         // everywhere

    public int getPrivateField() {
        return privateField;            // private is visible INSIDE this class
    }
}