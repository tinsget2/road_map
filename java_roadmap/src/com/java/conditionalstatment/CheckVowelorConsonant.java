package com.java.conditionalstatment;

public class CheckVowelorConsonant {
	private String checkVowelorConsonant(String letter) {
		int length = letter.length();
		if(length > 1) {
			return "Error: Need only one letter";
		}else {
			if(letter.equals("a") || letter.equals("A") || letter.equals("e") || letter.equals("E")
					|| letter.equals("i") || letter.equals("I") || letter.equals("o") || letter.equals("O")
					|| letter.equals("u") || letter.equals("U")) {
				return letter + " is Vowel";
			}else {
				return letter + " is Consonant";
			}
		}
	}
	
	public void printCheckVowelorConsonant(String letter) {
		System.out.println(this.checkVowelorConsonant(letter));
	}
}
