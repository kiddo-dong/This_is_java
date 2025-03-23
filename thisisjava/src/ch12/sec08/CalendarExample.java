package ch12.sec08;

import java.util.*;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int y = now.get(Calendar.YEAR);
		int m = now.get(Calendar.MONTH);
		int d = now.get(Calendar.DAY_OF_MONTH);
		int w = now.get(Calendar.DAY_OF_WEEK);
		
		String sw = null;
		
		switch(w){
			case Calendar.MONDAY : sw = "월"; break;
			case Calendar.TUESDAY : sw = "화"; break;
			case Calendar.WEDNESDAY :sw = "수"; break;
			case Calendar.THURSDAY : sw = "목"; break;
			case Calendar.FRIDAY : sw = "금" ; break;
			case Calendar.SATURDAY : sw = "토"; break;
			default : sw = "일" ; break;
		}
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		int hour = now.get(Calendar.HOUR);	
	}
}