package com.electronik54.revision_3.corejava.ch118_junit5_advanced.solution;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Advanced JUnit 5 features: parameterized, repeated, assumptions.
 */
class StringUtilsTest {

    private final StringUtils utils = new StringUtils();

    @ParameterizedTest
    @CsvSource({
            "racecar, true",
            "hello, false",
            "'A man a plan a canal Panama', true"
    })
    void isPalindromeTests(String input, boolean expected) {
        assertEquals(expected, utils.isPalindrome(input));
    }

    @RepeatedTest(3)
    void reverseRunsThreeTimes() {
        assertEquals("cba", utils.reverse("abc"));
    }

    @Test
    void reverseThrowsOnNull() {
        assertThrows(IllegalArgumentException.class, () -> utils.reverse(null));
    }

    @Test
    void skipWhenInputIsBlank() {
        String input = "   ";
        // Assumption: if the input is blank, the test is silently skipped
        Assumptions.assumeFalse(input.isBlank());
        fail("Should not execute for blank input");
    }
}