package java012_api;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
/* 
 * 정상적으로 주민번호가 입력이 되었으면 true를 반환하고 아니면
 * false를 반환하는 프로그램을 구현하시오.
 * 
 * [출력결과]
 * 851306-2689540 승인이 되었습니다.
 * 750625-16843 다시 입력하세요.
 */


public class Java127_RegEx {

	public static void main(String[] args) {
		System.out.println("851306-2689540");
		display(process("851306-2689540"));
		
		System.out.println("750625-16843");
		display(process("750625-16843"));
		
	}  //end main
	
	/*
	public static void display(String num) {
		System.out.printf(" %s\n",num,process(num));
	} // end display
	
	public static String process(String data) {
		
		 if(data.matches("[\\d]{6}-[\\d]{7}")) {
		 data = "승인이 되었습니다.";  }
		 else { data = "다시 입력하세요.";}
		 return data;
	} */  // 내가 작성한거
	
	public static boolean process(String sn) {
		return sn.matches("\\d{6}-\\d{7}");
	} // end process;;
	
	public static void display(boolean res) {
		if(res) {
			System.out.println("승인이 완료 되었습니다.");
		} else {
			System.out.println("다시 입력하세요"); }
			
		} // end display()
} // end class
