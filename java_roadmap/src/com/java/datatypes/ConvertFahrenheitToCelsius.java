package com.java.datatypes;

public class ConvertFahrenheitToCelsius {
	private double multiplier = 5.0/9.0;
	private double celsiusValue, fahrenheitValue;
	
	public ConvertFahrenheitToCelsius(double fahrenheitValue){
		this.fahrenheitValue = fahrenheitValue;
	}
	
	private double fahrenheitToCelsius() {
		this.celsiusValue = this.fahrenheitValue - 32;
		return this.celsiusValue*this.multiplier;
	}
	
	public void printFahrenheitToCelsius() {
		System.out.println(this.fahrenheitValue + " degree Fahrenheit is equal to " + String.format("%.2f", this.fahrenheitToCelsius()) + " in Celsius");
	}
}
