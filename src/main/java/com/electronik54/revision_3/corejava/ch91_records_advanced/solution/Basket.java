package com.electronik54.revision_3.corejava.ch91_records_advanced.solution;

import java.util.List;

/**
 * Record holding a MUTABLE component - defensive copies keep it effectively immutable.
 */
public record Basket(List<String> items) {

    public Basket {
        items = List.copyOf(items);   // immutable copy: external mutation cannot reach us
    }
}