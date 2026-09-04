package com.electronik54.revision_3.lombok.ch94_lombok_constructors.solution;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * Demonstrates the three Lombok constructor generators.
 * 'id' is @NonNull -> included in @RequiredArgsConstructor AND allowed
 * to be null by @NoArgsConstructor (non-final, so it can be left unset).
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Product {
    @NonNull
    private Long id;
    private String name;
    private double price;
    private String category;
}