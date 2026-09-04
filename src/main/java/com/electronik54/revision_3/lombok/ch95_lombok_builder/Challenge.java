package com.electronik54.revision_3.lombok.ch95_lombok_builder;

/**
 * Challenge 95: Lombok Builder
 *
 * Problem:
 * Create an 'Order' class with fields (id, customerName, List<String> items).
 * Use @Builder and @Singular so you can build with a fluent API:
 * Order.builder().id(1).customerName("Bob").item("Apple").item("Banana").build()
 *
 * Hint:
 * - @Builder generates a static builder() method and a nested Builder class
 * - @Singular generates singular addItem() and plural items() methods for collections
 * - The builder helps avoid telescoping constructors
 *
 * Expected Output:
 * Order(id=1, customerName=Bob, items=[Apple, Banana])
 *
 * TODO:
 * 1. Create Order with @Builder, @ToString, @Getter
 * 2. Use @Singular on List<String> items
 * 3. Build an order using the fluent builder and print it
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 95: Lombok Builder ===");
    }
}