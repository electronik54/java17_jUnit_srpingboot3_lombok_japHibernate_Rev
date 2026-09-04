package com.electronik54.revision_3.corejava.ch103_abstract_factory.solution;

/**
 * Solution for Challenge 103: Abstract Factory Pattern
 */
public class Solution {

    public static void main(String[] args) {
        UIFactory light = new LightUIFactory();
        render(light);

        UIFactory dark = new DarkUIFactory();
        render(dark);
    }

    private static void render(UIFactory factory) {
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();
        button.press();
        checkbox.toggle();
    }
}