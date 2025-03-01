package com.java.datatypes;

import java.util.ArrayList;

public class BreakIntegerintoDigits {
	private ArrayList<Integer> breakIntegerintoDigits(int num1) {
		boolean chk = true;
		ArrayList<Integer> digit = new ArrayList<Integer>();
		while(chk) {
			if(num1 <= 1) {
				chk = false;
			}
			digit.add(num1%10);
			num1 = num1/10;
		}
		return digit;
	}
	
	public void printBreakIntegerintoDigits(int num1) {
		System.out.println(this.breakIntegerintoDigits(num1));
	}
}
