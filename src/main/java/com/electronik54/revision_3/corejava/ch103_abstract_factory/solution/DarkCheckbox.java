package com.electronik54.revision_3.corejava.ch103_abstract_factory.solution;

/** Concrete product B (dark). */
public class DarkCheckbox implements Checkbox {
    @Override
    public void toggle() {
        System.out.println("Dark UI Checkbox toggled: (checked: DarkCheckbox)");
    }
}