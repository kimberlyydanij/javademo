package ncs.test03;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/*
 * GregorianCalendar 클래스를 사용하여, 현재 년도와 비교한 나이를 계산하고 
 * 생일의 요일을 출력한다. 출력시 SimpleDateFormat 을 사용하여 출력한다.
 * 사용데이터 1987,5,27
 * 
 * 실행결과
 * 생일 : 1987년 5월 27일 수요일
 * 현재 : 2016년 4월 18일
 * 나이 : 29 세
 */
public class DateTest {

	public static void main(String[] args) {
		
		
		int year = 1987;
		int month = 5;
		int date = 27;
		LocalDate bdate = LocalDate.of(1987, 5, 25);
		DayOfWeek dayOfWeek = bdate.getDayOfWeek();
		dayOfWeek.getDisplayName(TextStyle.FULL, Locale.KOREAN);

		SimpleDateFormat fm1 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일",Locale.KOREAN);
		//System.out.println("생일 : "+fm1.format(bdate));
		System.out.printf("생일 : %4d년 %2d월 %2d일 ",year,month,date);
		System.out.println(dayOfWeek.getDisplayName(TextStyle.FULL, Locale.KOREAN));
	
	    	
		 Calendar cal = new GregorianCalendar();
		 int nYear = cal.get(Calendar.YEAR);
	     int nMonth = cal.get(Calendar.MONTH)+1;
	     int nDay = cal.get(Calendar.DAY_OF_MONTH); 
	     
	     SimpleDateFormat fm2 = new SimpleDateFormat("yyyy년 MM월 dd일");
	     String ndate = fm2.format(new Date());
	
	     System.out.println("현재 : "+ndate);
	
	     System.out.printf("나이 : %d세",(nYear-year));

	} // end main

} // end class
