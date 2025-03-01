package com.java.enumtype;

public class RunEnum {
	public enum Shape {
		SQUARE,
	    CIRCLE,
	    RECTANGLE,
	    TRIANGLE,
	    HEXAGON
	}
	 public enum Direction {
		 NORTH,
		 SOUTH,
		 EAST,
		 WEST
	 }
	 public enum Months {
	     JANUARY,
	     FEBRUARY,
	     MARCH,
	     APRIL,
	     MAY,
	     JUNE,
	     JULY,
	     AUGUST,
	     SEPTEMBER,
	     OCTOBER,
	     NOVEMBER,
	     DECEMBER
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaysOfWeek[] dow = DaysOfWeek.values();
		
		for(DaysOfWeek d: dow) {
			System.out.println(d);
		}
		
		Weekend day1 = Weekend.SATURDAY;
		Weekend day2 = Weekend.SUNDAY;
		
		System.out.println("First day of the weekend: " + day1);
		System.out.println("Second day of the weekend: " + day2);
		
		Shape s1 = Shape.SQUARE;
		Shape s2 = Shape.CIRCLE;
		
		System.out.println("First shape: " + s1);
		System.out.printf("Second shape: %s", s2);
		
		Direction[] dir = Direction.values();
		for(Direction d1: dir) {
			System.out.printf("Direction is: %s, ", d1);
		}
		
		Months[] mon = Months.values();
		
		for(Months m: mon) {
			if(m == Months.APRIL) {
				System.out.printf("\n%s is my birth month", m);
			}
		}
		
		DaysOfWeekWithValue[] dw = DaysOfWeekWithValue.values();
		for(DaysOfWeekWithValue d : dw) {
			System.out.println("Today is " + d + " and it is the " + d.getDayOfWeek() + " day of the week ");
		}
	}

}
