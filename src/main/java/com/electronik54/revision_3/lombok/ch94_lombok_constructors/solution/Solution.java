package com.electronik54.revision_3.lombok.ch94_lombok_constructors.solution;

/**
 * Solution for Challenge 94: Lombok Constructors
 */
public class Solution {

    public static void main(String[] args) {
        // @NoArgsConstructor
        Product empty = new Product();
        System.out.println("No-args -> " + empty);

        // @RequiredArgsConstructor (only the @NonNull field 'id')
        Product required = new Product(1L);
        System.out.println("Required(id) -> " + required);

        // @AllArgsConstructor
        Product laptop = new Product(2L, "Laptop", 999.99, "Electronics");
        System.out.println("All-args -> " + laptop);
    }
}