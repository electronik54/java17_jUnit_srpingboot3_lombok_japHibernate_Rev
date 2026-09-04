package com.electronik54.revision_3.lombok.ch95_lombok_builder.solution;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import lombok.ToString;

import java.util.List;

/**
 * Fluent builder demo. @Singular generates item(...) and items(...).
 */
@Builder
@Getter
@ToString
public class Order {
    private Long id;
    private String customerName;
    @Singular
    private List<String> items;
}