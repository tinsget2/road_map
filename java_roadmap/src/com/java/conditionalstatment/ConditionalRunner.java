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
	}

}
