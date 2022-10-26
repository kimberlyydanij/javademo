package project;

import java.util.ArrayList;
import java.util.Scanner;

public class Management {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int chk=0;
	
	
		//aList.add(10); // auto boxing -> up-casting
		//aList.add(new String("Java")); 
	
		
	System.out.println("  ========================================");
	System.out.println("       회원관리 프로그램에 오신것을 환영합니다     ");
	System.out.println("  ========================================");
	chk = mainMenu();
	
	switch(chk) {
	case 1 : Process.memberAdd();
	case 2 : Process.memberDelete();
	case 3 : Process.memberSearch();
	case 4 : Process.sales();
	}
	System.out.println(chk);

	} // end main()

public static int mainMenu() {
	int i=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("   1.회원추가  2.회원삭제  3.회원조회  4.매출입력");
	System.out.println("  ========================================");
	System.out.print("   원하시는 업무를 입력하세요 : ");
	i = sc.nextInt();
	if (!(i>=1 && i<=4)) {
		System.out.println("  ========================================");
		System.out.println("   잘못 입력하셨습니다. ");
		System.out.println();
	mainMenu();
	}
    return i;
	} // end mainMenu

} // end class
