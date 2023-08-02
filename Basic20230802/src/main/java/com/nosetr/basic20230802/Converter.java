package com.nosetr.basic20230802;

/**
 *
 * @author nosetr
 */
public class Converter {
    
    private double celsius;

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
    
    /**
     * Celsius to Kelvin
     * @param baseValue
     * @return 
     */
    public double runKelvinConverter(){
        double baseValue = this.getCelsius();
        return baseValue + 273.15;
    }
    
    /**
     * Celsius to Fahrenheit
     * @param baseValue
     * @return 
     */
    public double runFahrenheitConverter(){
        double baseValue = this.getCelsius();
        return baseValue * 1.8 + 32;
    }
}
