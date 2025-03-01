package com.java.datatypes;

public class ArithmeticOperationsOnTwoIntegers {
	private float[] arithmeticOperationsOnTwoIntegers(int num1, int num2) {
		int sum = num1 + num2;
		int diff = num1 - num2;
		int mul = num1 * num2;
		float quo = (float)num1 / num2;
		int max = Math.max(num1, num2);
		int min = Math.min(num1, num2);
		float avg = (float)(num1+num2)/2;
		
		return new float[] {sum, diff, mul, quo, max, min, avg};
	}
	
	public void printarithmeticOperationsOnTwoIntegers(int num1, int num2) {
		System.out.println("Addition of " + num1 + " and " + num2 + " is " + this.arithmeticOperationsOnTwoIntegers(num1, num2)[0]);
		System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + this.arithmeticOperationsOnTwoIntegers(num1, num2)[1]);
		System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + this.arithmeticOperationsOnTwoIntegers(num1, num2)[2]);
		System.out.println("Division of " + num1 + " and " + num2 + " is " + this.arithmeticOperationsOnTwoIntegers(num1, num2)[3]);
		System.out.println("Maximum of " + num1 + " and " + num2 + " is " + this.arithmeticOperationsOnTwoIntegers(num1, num2)[4]);
		System.out.println("Minimum of " + num1 + " and " + num2 + " is " + this.arithmeticOperationsOnTwoIntegers(num1, num2)[5]);
		System.out.println("Average of " + num1 + " and " + num2 + " is " + this.arithmeticOperationsOnTwoIntegers(num1, num2)[6]);
	}
}
