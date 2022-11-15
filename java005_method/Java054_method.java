package java005_method;

public class Java054_method {
	public static void main(String[] args) {
		int year = 2013;
		boolean result = isLeapYear(year);
	
		if(result) {
			System.out.printf("%d년도는 윤년입니다. \n",year);
		} else {
			System.out.printf("%d년도는 평년입니다. \n",year);
		} // end if
			
	} // end main
	
	public static boolean isLeapYear(int year) {
		// 입력 년도가 윤년이면 true, 평년이면 false를 리턴하는 프로그램 구현
		boolean chk;
		if((year%4==0 && year%100!=0) || year%4==0 ) {
			chk = true;
		} else {
			chk = false;
		} // end if
				
		return chk;
		
	/*
	 * 	public static boolean isLeapYear(int year) {
		// 입력 년도가 윤년이면 true, 평년이면 false를 리턴하는 프로그램 구현
		if((year%4==0 && year%100!=0) || year%4==0 ) {
			return true;
		} else {
			retun false;
		} // end if
		메소드별로 리턴은 1번만 있어야 한다.
	 */
		
	} // end isLeapYear
} // end class
