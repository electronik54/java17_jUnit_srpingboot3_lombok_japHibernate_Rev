package com.electronik54.revision_3.lombok.ch95_lombok_builder.solution;

/**
 * Solution for Challenge 95: Lombok Builder
 */
public class Solution {

    public static void main(String[] args) {
        Order order = Order.builder()
                .id(1L)
                .customerName("Bob")
                .item("Apple")
                .item("Banana")
                .build();
        System.out.println(order);
    }
}