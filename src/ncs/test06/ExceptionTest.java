package ncs.test06;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		
		int data = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("2~5 사이의 정수 값을 입력하세요.");
		try {
		data = sc.nextInt();
		} catch(ArrayStoreException) {
			ex.printStackTrace(); 
		}
		
	

	} // end main

} // end class
