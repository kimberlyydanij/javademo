package ncs.test04;

import java.util.Scanner;

/*
 * Product 클래스를 작성하고, 키보드로 각 필드에 기록할 값을 
 * 입력받아 객체 초기화에 사용한다.
 * 가격과 수량을 계산하여 구매가격을 출력한다.
 * 
 * 키보드로 입력받아 객체 초기화에 사용한다.
   name     price(원) quantity(개)
   갤럭시 s7   563500       3
 */
public class ProductTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product pd = new Product();
		System.out.println("정보를 입력하세요. name  / price(원) / quantity(개)");
	    pd.setName(sc.next());
		pd.setPrice(sc.nextInt());
		pd.setQuantity(sc.nextInt());
		
		System.out.println(Information(pd));
	} // end main

} // end class
