package com.java.conditionalstatment;

public class FindGreatestAmongThreeNumbers {
	private int findGreatestAmongThreeNumbers(int num1, int num2, int num3) {
		return Math.max(Math.max(1, num2), num3);
	}
	
	private int findGreatestAmongThreeNumbersConditional(int num1, int num2, int num3) {
		if(num1 > num2) {
			if(num1 > num3) {
				return num1;
			}else {
				return num3;
			}
		}else {
			if(num2 > num3) {
				return num2;
			}else {
				return num3;
			}
		}
	}
	
	public void printFindGreatestAmongThreeNumbers(int num1, int num2, int num3) {
		System.out.println("The gratest number is " + this.findGreatestAmongThreeNumbers(num1, num2, num3));
	}
	
	public void printFindGreatestAmongThreeNumbersConditional(int num1, int num2, int num3) {
		System.out.println("The gratest number is " + this.findGreatestAmongThreeNumbersConditional(num1, num2, num3));
	}
}
