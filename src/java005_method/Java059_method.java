package java005_method;

public class Java059_method {
	public static void main(String[] args) {
		
		int data = 10;
		process(data);
		
	} // end main
	
	public static boolean process(int data) {
		// data 매개변수의 값이 짝수이면 true,
		// 홀수이면 false를 리턴하는 메소드 구현
		
		if(data%2==0) {
			System.out.printf("%d는 짝수입니다.\n",data); }
		  	 //return true;
		else  {
			System.out.printf("%d는 홀수입니다.\n",data); }
			return false;
	
	} // end process()
} // end class
