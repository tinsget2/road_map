package com.java.datatypes;

public class CheckFiniteFloatingPointValue {
	private boolean checkFiniteFloatingPointValue(double num) {
		try {
			return Double.isFinite(num);
		}catch(ArithmeticException e){
			return false;
		}
	}
	
	public void printCheckFiniteFloatingPointValue(double num) {
		System.out.println(num + " is a finite?  " + this.checkFiniteFloatingPointValue(num));
	}
}
