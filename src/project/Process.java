package project;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Process extends Sales {

	public Process() {
	
	}

	public Process(int mSum, char mGrade, int mPoint) {
		super(mSum, mGrade, mPoint);
		// TODO Auto-generated constructor stub
	}

	//public Process(int mNumber, String mName, char mGender, String mPhone, String mAddress, int mPoint) {
	//	super(mNumber, mName, mGender, mPhone, mAddress, mPoint);
	//}
	
	public static void memberAdd() {
		Scanner sc = new Scanner(System.in);
		int chk = 0;
		try {
		ArrayList<Member> member = new ArrayList<Member>();
		Member m = new Member();
		System.out.println("  ========================================");
		System.out.println("                신규 회원 정보 입력           ");
		System.out.print("   회원번호 : ");
		int num = sc.nextInt();
		m.setmNumber(num);
		System.out.print("   이름 : ");
		String name = sc.next();
		m.setmName(name);
		System.out.print("   성별(M/F) : ");
		char gender = (sc.next().charAt(0));
		if(!(gender=='F'|| gender=='f'||gender=='M' || gender=='m')) {
			Process.errorMessage();
			memberAdd();
		} // end if
		System.out.print("   전화번호 : ");
		String phone = sc.next();
		m.setmPhone(phone);
		System.out.print("   주소 : ");
		sc.nextLine();
		String address = sc.nextLine();
		m.setmAddress(address);
		member.add(m);
	
		//System.out.println(member.toString());
		//System.out.println(member.size());
		
		
		System.out.println("  ========================================");
		System.out.println("     1.계속입력 2.메인메뉴 3.프로그램 종료");
		chk = sc.nextInt();
		if (!(chk>=1 && chk<=3)) 
			errorMessage();
		switch(chk) {
		case 1 : Process.memberAdd();
		case 2 : Management.mainMenu();
		case 3 : end();
		} // end switch
		} catch(InputMismatchException e) {
			Process.errorMessage();
			Management.main(null);
		} // end try-catch
	} // end memberAdd()

	public static void memberDelete() {
		int chk = 0;
		char checker;
		Scanner sc = new Scanner(System.in);
		System.out.println("  ========================================");
		System.out.print("   삭제할 회원의 회원번호를 입력하세요 ");
		try {
		chk = sc.nextInt();
		System.out.printf("   삭제할 회원번호가 %d가 맞습니까? (Y/N) ",chk);
		checker = sc.next().charAt(0);
		if(checker=='Y' || checker=='y'  ) {
			System.out.printf("   %d 번 회원 정보를 삭제 합니다.\n",chk);
			System.out.println("  ========================================");
			System.out.println("  1.계속삭제       2.메인메뉴      3.프로그램 종료");
			chk = 0;
			chk = sc.nextInt();
			switch(chk) {
			case 1 : Process.memberDelete();
			case 2 : Management.mainMenu();
			case 3 : end();
			} // end switch
		} else if (checker=='N' || checker=='n') {
			System.out.println("   다시 입력해주세요.");
			memberDelete();
			
		} else errorMessage();{
			memberDelete();
		}
				
		}  catch(InputMismatchException e) {
			Process.errorMessage();
			memberDelete();
		} // end try-catch
		
	} // end memberDelete();
	
	public static void memberSearch() {
		int chk = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("  ========================================");
		System.out.print("   조회하실 회원번호를 입력하세요 ");
		chk = sc.nextInt();
		while(!(member.isEmpty())
			
		//}
	}
	
	public static void sales() {
		
	}

	public static void errorMessage() {
		System.out.println("  ========================================");
		System.out.println("   잘못 입력하셨습니다. 다시 입력하세요.");
		System.out.println();
	} // end errorMessage()
	
	public static void end() {
		System.out.println("  ========================================");
		System.out.println("   프로그램을 종료합니다.");
		System.exit(0);
	} // end end

	
}
