package com.electronik54.revision_3.corejava.ch109_adapter_pattern;

/**
 * Challenge 109: Adapter Pattern
 *
 * Problem:
 * You have a legacy XMLWeatherService exposing getTemperatureXML() returning
 * a raw String with leading "XML:". Your client expects a new interface
 * WeatherService with int getTemperatureCelsius(). Build an adapter that
 * converts the legacy API to the new one.
 *
 * Hint:
 * - Target interface: WeatherService.getTemperatureCelsius()
 * - Adaptee: LegacyXMLWeatherService.getTemperatureXML() returns "25.0"
 * - Adapter implements WeatherService, wraps the legacy service, parses
 *   the string into an int
 *
 * Expected Output:
 * Adapter reports temperature: 25 C
 *
 * TODO:
 * 1. Create WeatherService interface and LegacyXMLWeatherService (return "25.0")
 * 2. Create XMLWeatherAdapter implementing WeatherService
 * 3. Parse the XML string to a number and return it
 * 4. Use the adapter through the new interface
 *
 * Refer to the solution package (solution/Solution.java) if you need help.
 * The solution has its own main() - run it directly to see the expected output.
 */
public class Challenge {
    public static void main(String[] args) {
        System.out.println("=== Challenge 109: Adapter Pattern ===");
    }
}