package com.electronik54.revision_3.corejava.ch103_abstract_factory.solution;

/** Concrete product A (light). */
public class LightButton implements Button {
    @Override
    public void press() {
        System.out.println("Light UI Button pressed: [LightButton]");
    }
}