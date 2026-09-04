package com.electronik54.revision_3.corejava.ch103_abstract_factory.solution;

/** Concrete product A (dark). */
public class DarkButton implements Button {
    @Override
    public void press() {
        System.out.println("Dark UI Button pressed: [DarkButton]");
    }
}