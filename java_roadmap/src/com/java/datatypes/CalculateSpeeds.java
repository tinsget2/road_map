package com.java.datatypes;

public class CalculateSpeeds {
	private int m, s, h, d;
	private double mps, kmph, mph;
	
	private double[] calculateSpeeds(int h, int m, int s, int d) {
		this.h = h;
		this.m = m;
		this.s = s;
		this.d = d;
		
		double totalsec = (this.h*3600) + (this.m*60) + this.s;
		double totalhour = this.h + (this.m/60) + (this.s/3600);
		double km = this.d/1000;
		double mile = this.d * 0.000621371;
		
		mps = this.d/totalsec;
		kmph = km/totalhour;
		mph = mile/totalhour;
		
		return new double[] {mps, kmph, mph};		
	}
	
	public void printCalculateSpeeds(int h, int m, int s, int d) {
		System.out.println("speed is = " + this.calculateSpeeds(h, m, s, d)[0] +"m/s, "+ this.calculateSpeeds(h, m, s, d)[1] + " km/h" + this.calculateSpeeds(h, m, s, d)[2] + " m/h");
	}
	
}
