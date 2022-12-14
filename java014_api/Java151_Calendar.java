package java014_api;

import java.util.Calendar;

/* 
 * 수능일 : 2022-11-18
 * 오늘 : 2022-10-20
 * 남은일 : 15
 */
public class Java151_Calendar {

	public static void main(String[] args) {
		Calendar examDay = Calendar.getInstance();
		int examDay_year = 2022;
		int examDay_month = 11;
		int examDay_date = 17;
		
		examDay.set(examDay_year, examDay_month, examDay_date);
		System.out.println(examDay.toString());
		
		Calendar toDay = Calendar.getInstance();
		System.out.println(toDay);
		
		long eventDay = examDay.getTimeInMillis();
		long nowDay = toDay.getTimeInMillis();
		System.out.println("eventDay: "+ eventDay);
		System.out.println("nowDay: " + nowDay);

		//하루계산
		System.out.println(60*60*24*1000);
		
		long endDay = (eventDay-nowDay) / (60*60*24*1000);
		System.out.println("남은 일:" +endDay);
		
	} // end main()

} // end class
