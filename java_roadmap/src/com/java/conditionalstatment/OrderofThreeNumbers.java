package com.java.conditionalstatment;

public class OrderofThreeNumbers {
	private String orderofThreeNumbers(int num1, int num2, int num3) {
		if(num1 > num2 && num2 > num3) {
			return "decreasing";
		}else if(num1 < num2 && num2 < num3){
			return "increasing";
		}else {
			return "Neither";
		}
	}
	
	public void printOrderofThreeNumbers(int num1, int num2, int num3) {
		System.out.println("It is " + this.orderofThreeNumbers(num1, num2, num3)+" order");
	}
}
