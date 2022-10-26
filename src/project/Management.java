package project;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Management {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int chk=0;
	
	
		//aList.add(10); // auto boxing -> up-casting
		//aList.add(new String("Java")); 
	
		
	System.out.println("  ========================================");
	System.out.println("       회원관리 프로그램에 오신것을 환영합니다     ");
	System.out.println("  ========================================");
	mainMenu();
	} // end main()

public static void mainMenu() {
	int chk = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("  1.회원추가 2.회원삭제 3.회원조회 4.매출입력 5.종료");
	System.out.println("  ========================================");
	System.out.print("   원하시는 업무를 입력하세요 : ");
	try {
	chk = sc.nextInt();
	if (!(chk>=1 && chk<=5)) {
		Process.errorMessage();
		mainMenu();
		chk=0;
	    }
    	
	} catch(InputMismatchException e) {
		Process.errorMessage();
		main(null);
		System.out.println("test");
	} // end try-catch
	switch(chk) {
	case 1 : Process.memberAdd();
	case 2 : Process.memberDelete();
	case 3 : Process.memberSearch();
	case 4 : Process.sales();
	case 5 : Process.end();
	}

	} // end mainMenu

} // end class
