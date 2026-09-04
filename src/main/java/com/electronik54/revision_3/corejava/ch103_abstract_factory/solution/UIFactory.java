package com.electronik54.revision_3.corejava.ch103_abstract_factory.solution;

/** Abstract Factory: creates a coherent family of UI widgets. */
public interface UIFactory {
    Button createButton();
    Checkbox createCheckbox();
}