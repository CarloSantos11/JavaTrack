package com.devnom.basics;

public class M_TemperatureSystem {
    public static void main(String[] args) {
        String temp, weatherWarning;
        temp = "High";

        switch (temp) {
            case "High":
                weatherWarning = "Use sunblock. Its hot!";
                break;
            case "Low":
                weatherWarning = "Wear a coat";
                break;
            case "Humid":
                weatherWarning = "Open the window!";
                break;
            default:
                weatherWarning = "The weather looks good";
        }
        System.out.println(weatherWarning);
    }
}
