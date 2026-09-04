package com.electronik54.revision_3.corejava.ch48_optional_map_flatmap;

/**
 * Challenge 48: Optional map() and flatMap()
 *
 * Problem:
 * Transform nested Optionals - User has an Optional<Address>, Address has
 * an Optional<String> city. Extract the city with map vs flatMap and see
 * why map would produce Optional<Optional<String>>.
 *
 * Hint:
 * - map applies a function and WRAPS the result in an Optional
 * - flatMap applies a function that ALREADY returns an Optional - no double wrapping
 * - map(null-safe transformation) + flatMap(Optional-returning transformation)
 *
 * Expected Output:
 * map on address: Optional[Optional[New York]]   <- double wrapped!
 * flatMap on address: Optional[New York]
 * map on city string: Optional[NEW YORK]
 * Missing city: Optional.empty
 *
 * TODO:
 * 1. Address record with Optional<String> city
 * 2. User record with Optional<Address> address
 * 3. user.map(User::address) - observe double wrapping
 * 4. user.flatMap(User::address).flatMap(Address::city) - clean chain
 * 5. .map(String::toUpperCase) after the city lookup
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 48: Optional map/flatMap ===");
    }
}