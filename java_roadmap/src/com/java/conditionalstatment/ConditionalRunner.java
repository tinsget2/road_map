package com.java.conditionalstatment;

public class ConditionalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckPositiveorNegativeNumber pon = new CheckPositiveorNegativeNumber();
		pon.printCheckPositiveorNegativeNumber(0);
		pon.printCheckPositiveorNegativeNumber(-1);
		pon.printCheckPositiveorNegativeNumber(2);
		
		SolveQuadraticEquation sqe = new SolveQuadraticEquation();
		sqe.printSolveQuadraticEquation(1, 5, 1);
		sqe.printSolveQuadraticEquation(1, -4, 4);
		
		FindGreatestAmongThreeNumbers fg = new FindGreatestAmongThreeNumbers();
		fg.printFindGreatestAmongThreeNumbers(23, 78, 87);
		fg.printFindGreatestAmongThreeNumbersConditional(23, 78, 87);
		
		WeekdayNamefromNumber wdn = new WeekdayNamefromNumber();
		wdn.printWeekdayNamefromNumber(5);
		
		CompareFloateUptoThreeDecimals cfp = new CompareFloateUptoThreeDecimals();
		cfp.printCompareFloateUptoThreeDecimals((float)25.586, (float)25.589);
		
		DaysinaMonth diam = new DaysinaMonth();
		diam.printDaysinaMonth(2, 2016);
		diam.printDaysinaMonth(2, 2017);
		
		CheckVowelorConsonant cvc = new CheckVowelorConsonant();
		cvc.printCheckVowelorConsonant("P");
		cvc.printCheckVowelorConsonant("A");
		
		CheckLeapYear cly = new CheckLeapYear();
		cly.printCheckLeapYear(2016);
		cly.printCheckLeapYear(2025);
		
		OrderofThreeNumbers otn = new OrderofThreeNumbers();
		otn.printOrderofThreeNumbers(3, 2, 1);
	}

}
