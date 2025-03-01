package com.java.datatypes;

public class ConvertMinutesToYearsAndDays {
	private int minutes = 0;
	private double year, day;
	public ConvertMinutesToYearsAndDays(int minutes) {
		this.minutes = minutes;
	}
	
	private double[] convertMinutesToYearsAndDays() {
		this.year = this.minutes / (60 * 24 * 365);
		this.day = (this.minutes / 60 / 24) % 365;
		
		return new double[]{this.day, this.year};
	}
	
	public void printConvertMinutesToYearsAndDays() {
		System.out.println(this.minutes + " is equal to " + this.convertMinutesToYearsAndDays()[1] + " Years and "+  this.convertMinutesToYearsAndDays()[0] + " days");
	}
}
