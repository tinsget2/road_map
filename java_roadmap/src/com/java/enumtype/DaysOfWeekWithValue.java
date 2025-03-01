package com.java.enumtype;

public enum DaysOfWeekWithValue {
	SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);
	
	private final int dayOfWeek;
    
    DaysOfWeekWithValue(int dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
    
    public int getDayOfWeek() {
    	return this.dayOfWeek;
    }
}
