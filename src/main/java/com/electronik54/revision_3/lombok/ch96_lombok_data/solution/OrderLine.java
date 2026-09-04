package com.electronik54.revision_3.lombok.ch96_lombok_data.solution;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

/**
 * Demonstrates @NonNull, @EqualsAndHashCode(exclude), and @ToString.
 */
@Getter
@AllArgsConstructor
@EqualsAndHashCode(exclude = "lineTotal")
@ToString
public class OrderLine {
    @NonNull
    private String product;
    private int qty;
    private double lineTotal;
}