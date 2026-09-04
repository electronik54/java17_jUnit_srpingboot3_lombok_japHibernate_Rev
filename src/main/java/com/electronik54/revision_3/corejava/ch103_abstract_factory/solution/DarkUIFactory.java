package com.electronik54.revision_3.corejava.ch103_abstract_factory.solution;

/** Concrete factory: Dark theme. */
public class DarkUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
}