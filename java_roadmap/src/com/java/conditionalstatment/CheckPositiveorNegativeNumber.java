package com.java.conditionalstatment;

public class CheckPositiveorNegativeNumber {
	private String checkPositiveorNegativeNumber(int num) {
		if(num > 0) {
			return "Positive";
		}
		else if(num < 0) {
			return "Negative";
		}
		else {
			return "Zero";
		}
	}
	
	public void printCheckPositiveorNegativeNumber(int num) {
		System.out.println(num + " is " + this.checkPositiveorNegativeNumber(num));
	}
}
