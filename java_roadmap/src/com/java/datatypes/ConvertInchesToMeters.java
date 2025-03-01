package com.java.datatypes;

public class ConvertInchesToMeters {
	private double meter, inch;
	public ConvertInchesToMeters(float inch) {
		this.inch = inch;
	}
	
	private double inchesToMeters() {
		this.meter = this.inch * 0.0254;
		return this.meter;
	}
	
	public void printInchesToMeters() {
		System.out.println(this.inch + " inch is " + String.format("%.2f", this.inchesToMeters()) + " meters" );
	}
}
