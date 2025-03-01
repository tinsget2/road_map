package com.java.conditionalstatment;

public class WeekdayNamefromNumber {
	private enum WeekDays{
		SUNDAY,
	    MONDAY,
	    TUESDAY,
	    WEDNESDAY,
	    THURSDAY,
	    FRIDAY,
	    SATURDAY,
		ERROR,
	}
	
	private WeekDays weekdayNamefromNumber(int num) {
		switch(num) {
			case 1:
				return WeekDays.MONDAY;
			case 2:
				return WeekDays.TUESDAY;
			case 3:
				return WeekDays.WEDNESDAY;
			case 4:
				return WeekDays.THURSDAY;
			case 5:
				return WeekDays.FRIDAY;
			case 6:
				return WeekDays.SATURDAY;
			case 7:
				return WeekDays.SUNDAY;
			default:
				return WeekDays.ERROR;
		}
	}
	
	public void printWeekdayNamefromNumber(int num) {
		System.out.println("The day is "+ this.weekdayNamefromNumber(num));
	}
}
