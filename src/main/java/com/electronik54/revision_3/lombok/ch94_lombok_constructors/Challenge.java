package com.electronik54.revision_3.lombok.ch94_lombok_constructors;

/**
 * Challenge 94: Lombok Constructors
 *
 * Problem:
 * Create a 'Product' class with fields (id, name, price, category).
 * Demonstrate @AllArgsConstructor, @RequiredArgsConstructor and
 * @NoArgsConstructor. Show how @NonNull on a field makes it "required".
 *
 * Hint:
 * - @NoArgsConstructor -> no-arg constructor
 * - @AllArgsConstructor -> constructor with every field
 * - @RequiredArgsConstructor -> constructor with only final / @NonNull fields
 *
 * Expected Output:
 * No-args -> Product(id=null, name=null, price=0.0, category=null)
 * Required(constructor with id only) -> Product(id=1, name=null, price=0.0, category=null)
 * All-args -> Product(id=2, name=Laptop, price=999.99, category=Electronics)
 *
 * TODO:
 * 1. Create Product with @AllArgsConstructor, @RequiredArgsConstructor, @NoArgsConstructor
 * 2. Mark 'id' as final or @NonNull so it is required
 * 3. Build instances with each constructor and print
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 94: Lombok Constructors ===");
    }
}