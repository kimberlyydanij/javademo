package java014_api;

import java.util.Calendar;


/* 2016년 2월 마지막 일과 요일을 구하는 프로그램을 구현하세요
 * [출력결과]
 * 2016-2-29 월요일
 */
public class Java150_Calendar {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		int year = 2016;
		int month = 2;
				
		String days="";
		cal.set(Calendar.YEAR, year );
		cal.set(Calendar.MONTH, month-1);
		
		//2월의 마지막일
		int date = cal.getActualMaximum(Calendar.DATE);
		cal.set(Calendar.DATE, date);
		System.out.println(cal.toString());
		
		//요일
		int day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
				
		switch(day) {
		case 1:
			days = "일요일";
		case 2:
			days = "월요일";
		case 3:
			days = "화요일";
		case 4:
			days = "수요일";
		case 5:
			days = "목요일";
		case 6:
			days = "금요일";
		case 7:
			days = "토요일"; }
		 // end switch
		
		System.out.printf("%d-%d-%d %s",year,month,date,days);
			
	} //end main

} // end class
