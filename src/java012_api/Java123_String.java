package java012_api;

/* 
 * [출력결과]
 * 박상원님은 남성입니다.
 * 김연아님은 여성입니다.
 * 잘못입력하셨습니다. 
 */

public class Java123_String {

	public static void main(String[] args) {
		String p1 = "박상원,561203-1597650";
		String p2 = "김연아,030628-4056892";
		String p3 = "정해인,900824-8052582";
		display(p1);
		display(p2);
		display(p3);
		
	 } // end main
	
	public static void display(String str) {
		//여기를 구현하시오
		String data[]= str.split(",");
		System.out.println(data[1].charAt(7));
		char a = data[1].charAt(7);
		switch (a) {
			case 1:
			case 3:
			case 5:
				System.out.printf("%s님은 남성입니다.\n",data[0]);
				break;
			case 2:
			case 4:
			case 6:
				System.out.printf("%s님은 여성입니다.\n",data[0]);
				break;
			default : 
				System.out.println("잘못 입력하셨습니다.");
				break;
		} // end case
			
	} // end display 
	
} // end main
