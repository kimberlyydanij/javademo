package java012_api;

/*
 * 아이디를 입력할 때 영문자, 숫자 조합으로 합니다. 최소 5자 이상 10자이하 까지만
 * 가능합니다. (반드시 영문자로 시작한다.)
 * [출력결과]
 * 로그인 되었습니다.
 * 회원이 아닙니다.
 */

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Java128_RegEx {

	public static void main(String[] args) {
		System.out.print("ymy232");
		display(process("y23m1"));
		
		System.out.print("korea");
		display(process("korea"));

	} // end main

	public static Boolean process(String sn) {
		// 여기를 구현하세요
	
		/* 내꺼
		if(sn.matches("[a-zA-z][a-zA-z][0-9]{4,9}")) 
			return true; 
		 else return false;  */
		
		return sn.matches("[a-zA-Z][a-zA-Z0-9]{4,9}") &&
			   Pattern.compile("\\d").matcher(sn).find();
		} //end process;
	
	public static void display(boolean res) {
		if(res) {
			System.out.println(" 로그인 되었습니다.");
		} else {
			System.out.println(" 회원이 아닙니다.");
		}
	} // end display
} // end class
