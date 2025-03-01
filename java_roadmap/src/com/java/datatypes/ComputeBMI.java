package com.java.datatypes;

public class ComputeBMI {
	private int h, w;
	double bmi;
	public ComputeBMI(int h, int w) {
		this.h = h;
		this.w = w;
	}
	
	private double computeBMI() {
		this.bmi = (this.w*703)/Math.pow(this.h, 2);
		return this.bmi;
	}
	
	public void printComputeBMI() {
		System.out.println("Your BMI is: " + String.format("%.2f", this.computeBMI()));
	}
}
