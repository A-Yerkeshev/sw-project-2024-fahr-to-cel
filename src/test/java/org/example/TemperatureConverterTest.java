package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class TemperatureConverterTest {

    @Test
    public void testFahrenheitToCelsius() {
        Assertions.assertEquals(0, TemperatureConverter.fahrenheitToCelsius(32), 0.01);
        Assertions.assertEquals(100, TemperatureConverter.fahrenheitToCelsius(212), 0.01);
    }

    @Test
    void testCelsiusToFahrenheit() {
        Assertions.assertEquals(32, TemperatureConverter.celsiusToFahrenheit(0), 0.01);
        Assertions.assertEquals(212, TemperatureConverter.celsiusToFahrenheit(100), 0.01);
    }

    @Test
    void testKelvinToCel() {
        Assertions.assertEquals(0, TemperatureConverter.kelvintoCel(273.15f), 0.01);
        Assertions.assertEquals(100, TemperatureConverter.kelvintoCel(373.15f), 0.01);
    }

    @Test
    void testKelvinToFahrenheit() {
        Assertions.assertEquals(59.0, TemperatureConverter.kelvinToFahrenheit(300.1f), 0.1);
    }
}
