package org.example;

public class TemperatureConverter {
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static float kelvintoCel(float kel){
        return (float) (kel-273.15);
    }

    public static float kelvinToFahrenheit(float kel){
        return (float) ((kel-273.15)*(9/5)+32);
    }
}
