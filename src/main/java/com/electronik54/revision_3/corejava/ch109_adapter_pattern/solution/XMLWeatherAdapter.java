package com.electronik54.revision_3.corejava.ch109_adapter_pattern.solution;

/**
 * Adapter: translates the legacy XML-based API into the new interface.
 */
public class XMLWeatherAdapter implements WeatherService {
    private final LegacyXMLWeatherService legacy;

    public XMLWeatherAdapter(LegacyXMLWeatherService legacy) {
        this.legacy = legacy;
    }

    @Override
    public int getTemperatureCelsius() {
        String xml = legacy.getTemperatureXML();
        return (int) Double.parseDouble(xml);
    }
}