package java014_api;

import java.util.Calendar;

import java009_inheritance.part05.Second;

public class Java149_Calendar {

	public static void main(String[] args) {
		//Test tt = new TestExam();
		//tt.prn();
		//Test ts = Test.getInstance();
		//ts.prn();
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.toString());
		
		int year = cal.get(Calendar.YEAR);
		
		//Month는 1월일때 0 으로 리턴한다.
		int month = cal.get(Calendar.MONTH)+1;
		
		int date = cal.get(Calendar.DATE);
		
		//int hour = cal.get(Calendar.HOUR_OF_DAY); // 24시간
		int hour = cal.get(Calendar.HOUR); //12시간
		
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.printf("%d-%d-%d %d:%d:%d\n",
				year,month,date,hour,minute,second);
		
		// 이번달의 마지막일 리턴
		System.out.println(cal.getActualMaximum(Calendar.DATE));
		
		// 오늘의 요일 리턴 (일요일 -> 1 ... 토요일 -> 7)
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		// 오늘을 기준으로 5일전의 날짜로 설정
		cal.add(Calendar.DATE, -5);   // add > 계산
		System.out.println(cal.toString());
		
		cal.set(Calendar.YEAR, 2020); // set > 원하는 값 지정
		System.out.println(cal.toString());
		
		cal.set(2017, 2, 1); // 2017-3-1
		System.out.println(cal.toString());
		
		System.out.println();
		
		
		
	} // end main

} // end class

abstract class Test{
	private static TestExam te = new TestExam();
	abstract public void prn();
	


public static Test getInstance() {
	return te;
}}

class TestExam extends Test {
	@Override
	public void prn() {
		System.out.println("prn");
	}
}