package java013_api;

import java.util.Scanner;

/*
 * 단입력 : 5
 * 5 X 1 = 5
 * 5 X 2 = 10
 * ...
 * 5 X 9 = 45
 * 
 * 계속 하시겠습니까? (종료 : n, 계속 : 아무키)
 * 프로그램종료
 */

public class Java143_Scanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		while(true) {
		System.out.print(" 단 입력 : ");
		int dan = sc.nextInt();

		for(int i =0;i<=9;i++)
			System.out.printf("%2d X %2d = %3d\n",dan,i,dan*i);
		
		System.out.print("계속 하시겠습니까? (종료 : n / 계속 : 아무키)");
		String chk = sc.next();

		if(chk.equals("n")) {
			
			break;
		 } }
		System.out.println("프로그램 종료");

	} // end main;
		
	} // end class
