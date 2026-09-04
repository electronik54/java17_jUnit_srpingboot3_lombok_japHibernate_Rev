package com.electronik54.revision_3.corejava.ch109_adapter_pattern.solution;

/**
 * Solution for Challenge 109: Adapter Pattern
 */
public class Solution {

    public static void main(String[] args) {
        WeatherService service = new XMLWeatherAdapter(new LegacyXMLWeatherService());
        System.out.println("Adapter reports temperature: " + service.getTemperatureCelsius() + " C");
    }
}