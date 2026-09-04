package com.electronik54.revision_3.corejava.ch103_abstract_factory.solution;

/** Concrete product B (light). */
public class LightCheckbox implements Checkbox {
    @Override
    public void toggle() {
        System.out.println("Light UI Checkbox toggled: (checked: LightCheckbox)");
    }
}