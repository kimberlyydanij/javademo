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

public class Java143_Scanner1 {

	public static void main(String[] args) {
		
		kuku();
	
	} // end main
	
	public static void kuku( ) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" 단 입력 : ");
		int a = sc.nextInt();

		for(int i =0;i<=9;i++)
			System.out.printf("%2d X %2d = %3d\n",a,i,a*i);
	
		System.out.print("계속 하시겠습니까? (종료 : n / 계속 : 아무키)");
		String b = sc.next();

		if((!b.equals("n"))) {
			kuku();
		 }
			else  { 
				System.out.println("프로그램 종료");
				System.exit(0);
				}
	} // end kuku;
		
	} // end class
