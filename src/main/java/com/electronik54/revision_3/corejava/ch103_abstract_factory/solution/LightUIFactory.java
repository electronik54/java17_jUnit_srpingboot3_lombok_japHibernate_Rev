package com.electronik54.revision_3.corejava.ch103_abstract_factory.solution;

/** Concrete factory: Light theme. */
public class LightUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }
}