package project;

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
		Member member = new Member();
		System.out.println(member.toString());
		System.out.println("  ========================================");
		System.out.println("                신규 회원 정보 입력           ");
		System.out.print("   회원번호 : ");
		member.setmNumber(sc.nextInt());
		System.out.print("   이름 : ");
		member.setmName(sc.next());
		System.out.print("   성별(M/F) : ");
		member.setmGender(sc.next().charAt(0));
		System.out.print("   전화번호 : ");
		member.setmPhone(sc.next());
		System.out.print("   주소 : ");
		member.setmAddress(sc.next());
		System.out.println(member.toString());
		
	}
	/*
	private static void createStudent() {
		System.out.print("학생이름: ");
		String name = scanner.next();
		System.out.print("학생나이: ");
		int age = scanner.nextInt();
		scanner.nextLine();
		Student s = new Student();
		s.setName(name);
		s.setAge(age);
		studentList.add(s);
	*/
	
	public static void memberDelete() {
		
	}
	
	public static void memberSearch() {
		
	}
	
	public static void sales() {
		
	}

}
