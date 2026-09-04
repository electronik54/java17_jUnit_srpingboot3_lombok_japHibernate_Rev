package com.electronik54.revision_3.corejava.ch120_test_driven_development.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Written FIRST (RED) using TDD - before FizzBuzz was implemented.
 */
class FizzBuzzTest {

    @Test
    void returnsNumberWhenNotDivisible() {
        assertEquals("1", FizzBuzz.generate(1));
        assertEquals("7", FizzBuzz.generate(7));
    }

    @Test
    void returnsFizzForMultipleOfThree() {
        assertEquals("Fizz", FizzBuzz.generate(3));
    }

    @Test
    void returnsBuzzForMultipleOfFive() {
        assertEquals("Buzz", FizzBuzz.generate(5));
    }

    @Test
    void returnsFizzBuzzForMultipleOfBoth() {
        assertEquals("FizzBuzz", FizzBuzz.generate(15));
    }
}