package com.electronik54.revision_3.corejava.ch75_immutable_programming.solution;

/**
 * Immutable value class: final class, final fields, no setters,
 * operations return NEW instances.
 */
public final class Money {

    private final int cents;

    public Money(int cents) {
        this.cents = cents;
    }

    // Returns a NEW Money - never mutates this
    public Money plus(Money other) {
        return new Money(this.cents + other.cents);
    }

    public int getCents() {
        return cents;
    }

    @Override
    public String toString() {
        return "Money{" + cents + "c}";
    }
}