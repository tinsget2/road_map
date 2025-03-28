package com.java.conditionalstatment;

public class CompareFloateUptoThreeDecimals {
	private String compareFloateUptoThreeDecimals(float num1, float num2) {
		float newNum1 = num1 * 1000;
		float newNum2 = num2 * 1000;
		
		if(newNum1 < newNum2) {
			return num1 + " is lessthan " + num2;
		}else if(newNum1 > newNum2) {
			return num1 + " is graterthan " + num2;
		}else {
			return "They are equal";
		}
	}
	
	private String compareFloate(float num1, float num2) {
		float newNum1 = Float.parseFloat(String.format("%.3f", num1));	
		float newNum2 = Float.parseFloat(String.format("%.3f", num2));	
		
		if(newNum1 == newNum2) {
			return newNum1 + " and " + newNum2 + " are the same";
		}else {
			return newNum1 + " and " + newNum2 + "  are different";
		}
	}
	
	public void printCompareFloateUptoThreeDecimals(float num1, float num2) {
		System.out.println(this.compareFloateUptoThreeDecimals(num1, num2));
		System.out.println(this.compareFloate(num1, num2));
	}
}
