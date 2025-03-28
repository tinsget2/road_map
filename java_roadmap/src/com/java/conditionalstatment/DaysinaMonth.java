package com.java.conditionalstatment;

public class DaysinaMonth {
	private String daysinaMonth(int monthNum, int year) {
		switch(monthNum) {
			case 1:
				return "January " + year + " has " + 31 + " days";
			case 2:
				if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
					return "January " + year + " has " + 29 + " days";
				}else {
					return "January " + year + " has " + 28 + " days";
				}
				
			case 3:
				return "March " + year + " has " + 31 + " days";
			case 4:
				return "April " + year + " has " + 30 + " days";
			case 5:
				return "May " + year + " has " + 31 + " days";
			case 6:
				return "June " + year + " has " + 30 + " days";
			case 7:
				return "July " + year + " has " + 31 + " days";
			case 8:
				return "Augest " + year + " has " + 31 + " days";
			case 9:
				return "September " + year + " has " + 30 + " days";
			case 10:
				return "October " + year + " has " + 31 + " days";
			case 11:
				return "November " + year + " has " + 30 + " days";
			case 12:
				return "December " + year + " has " + 31 + " days";
			default:
				return "Error";
		}
	}
	
	public void printDaysinaMonth(int monthNum, int year) {
		System.out.println(this.daysinaMonth(monthNum, year));
	}
}
