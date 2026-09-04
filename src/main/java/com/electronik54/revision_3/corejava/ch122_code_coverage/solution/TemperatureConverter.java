package com.electronik54.revision_3.corejava.ch122_code_coverage.solution;

/** Class under test for the coverage challenge. */
public class TemperatureConverter {

    public double celsiusToFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }

    public String classify(double celsius) {
        if (celsius < 0) {
            return "freezing";
        } else if (celsius < 20) {
            return "cold";
        } else if (celsius < 30) {
            return "warm";
        } else {
            return "hot";
        }
    }
}