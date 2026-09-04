package com.electronik54.revision_3.corejava.ch48_optional_map_flatmap.solution;

import java.util.Optional;

/**
 * Solution for Challenge 48: Optional map/flatMap
 *
 * Demonstrates: map double-wrapping Optional-returning functions,
 * and flatMap for clean Optional chains.
 */
public class Solution {

    public static void main(String[] args) {
        Optional<User> user = Optional.of(new User(Optional.of(new Address(Optional.of("New York")))));
        Optional<User> noCity = Optional.of(new User(Optional.of(new Address(Optional.empty()))));
        Optional<User> noAddress = Optional.empty();

        // map: function returns Optional<Address> -> gets wrapped again
        Optional<Optional<Address>> doubleWrapped = user.map(User::address);
        System.out.println("map on address: " + doubleWrapped + "   <- double wrapped!");

        // flatMap: no extra wrapping
        Optional<Address> address = user.flatMap(User::address);
        System.out.println("flatMap on address: " + address);

        // Full chain to the city name
        Optional<String> cityUpper = user.flatMap(User::address)
                .flatMap(Address::city)
                .map(String::toUpperCase);
        System.out.println("map on city string: " + cityUpper);

        // Empty propagation - no NPE, no if checks
        System.out.println("Missing city: " + noCity.flatMap(User::address).flatMap(Address::city));

        // Fully missing address
        System.out.println("No address: " + noAddress.flatMap(User::address));
    }
}