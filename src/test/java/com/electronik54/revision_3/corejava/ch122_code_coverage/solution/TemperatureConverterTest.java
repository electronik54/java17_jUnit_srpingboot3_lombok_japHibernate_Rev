package com.electronik54.revision_3.corejava.ch122_code_coverage.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Coverage-focused tests: happy path + edges (0, negatives, boundaries).
 */
class TemperatureConverterTest {

    private final TemperatureConverter converter = new TemperatureConverter();

    @Test
    void celsiusToFahrenheit() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0), 0.001);
        assertEquals(212.0, converter.celsiusToFahrenheit(100), 0.001);
        assertEquals(-40.0, converter.celsiusToFahrenheit(-40), 0.001);
    }

    @Test
    void fahrenheitToCelsius() {
        assertEquals(0.0, converter.fahrenheitToCelsius(32), 0.001);
        assertEquals(100.0, converter.fahrenheitToCelsius(212), 0.001);
    }

    @Test
    void classifyCoversAllBranches() {
        assertEquals("freezing", converter.classify(-5));
        assertEquals("cold", converter.classify(10));
        assertEquals("warm", converter.classify(25));
        assertEquals("hot", converter.classify(35));
    }
}