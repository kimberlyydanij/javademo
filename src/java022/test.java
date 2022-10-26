package java022;

import java.util.ArrayList;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		ArrayList<Book> aList = new ArrayList<Book>();
		Scanner sc = new Scanner(System.in);
		System.out.println("1: 추가  2: 수정  3: 삭제 4: 리스트 ");
		int num = sc.nextInt();
		if(num==1)
			System.out.println("추가를 선택");

		System.out.print("책 제목 입력 : ");
		String title = sc.nextLine();
		System.out.println("책 가격 입력 : ");
		int price = Integer.parseInt(sc.nextLine());
		
		Book book = new Book(title, price);
		aList.add(book);
		
		System.out.println(aList.get(0));

	} // end main

} // end class
