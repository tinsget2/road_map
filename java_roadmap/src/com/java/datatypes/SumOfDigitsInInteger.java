package com.java.datatypes;

public class SumOfDigitsInInteger {
	private int intValue, sum=0;
	public SumOfDigitsInInteger(int intValue) {
		this.intValue = intValue;
	}
	
	private int sumOfDigitsInInteger() {
		boolean iterate = true;
		int intValue = this.intValue;
		while(iterate) {
			if(intValue <= 0) {
				iterate = false;
			}
			
			this.sum = this.sum + intValue%10;
			intValue = intValue/10;
			
		}
		
		return this.sum;
	}
	
	public void printSumOfDigitsInInteger() {
		System.out.println("Integer sum of "+ this.intValue + " is " + this.sumOfDigitsInInteger());
	}
}
