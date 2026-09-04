package com.electronik54.revision_3.corejava.ch109_adapter_pattern.solution;

/**
 * Adaptee: legacy API with an incompatible interface.
 */
public class LegacyXMLWeatherService {
    public String getTemperatureXML() {
        return "25.0";
    }
}