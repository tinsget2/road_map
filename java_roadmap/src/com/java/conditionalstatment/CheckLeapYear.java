package com.java.conditionalstatment;

public class CheckLeapYear {
	private String checkLeapYear(int year) {
		if(year % 4 == 0 && (year % 100 != 0 || (year % 400 == 0 && year % 100 == 0))) {
			return "Leap Year";
		}else {
			return "Not a leap year";
		}
	}
	
	public void printCheckLeapYear(int year) {
		System.out.println(year + " is " + this.checkLeapYear(year));
	}
}
