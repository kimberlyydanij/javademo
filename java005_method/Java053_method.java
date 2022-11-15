package java005_method;

/*
 * [출력결과]
 * 홍길동님은 회원입니다.
 * 3000 포인트가 적립되었습니다.
 */

public class Java053_method {

	public static void main(String[] args) {
		member("홍길동",true);
		plus(3000);

	} // end main

	//회원여부
	public static void member(String name, boolean chk) {
		if(chk) {
			System.out.printf("%s님은 회원입니다. \n",name);
		} else {
			System.out.printf("%s님은 비회원입니다. \n",name);
		} // end if
	} // end member
	
	public static void plus (int point) {
		System.out.printf("%d 포인트가 적립되었습니다. \n", point);
	} // end plus
} // end class
