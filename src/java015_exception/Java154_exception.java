package java015_exception;

public class Java154_exception {

	public static void main(String[] args) {

		int[] num = new int[3];
		num[0] = 10;
		System.out.println(num[0]);
		process(num);
		try {
			display(num);
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.toString());
		}
		
		} // end main
	
	public static void display(int[] num) throws ArrayIndexOutOfBoundsException {
		System.out.println(num[5]);
	}

	public static void process(int[] num) {

		try {
			//예외발생 가능 구문
		System.out.println(num[4]);
		} catch(ArrayIndexOutOfBoundsException ex) {
			// 예외가 발생했을때만 실행됨
			//System.out.println(ex.getMessage()); 에러메세지 가져옴
			//System.out.println(ex.toString());
			// ex.printStackTrace(); 예외가 발생하는 위치를 추적해줌
			
		} finally { 
			//finally는 무조건 수행
			System.out.println("program end");
			}
	} // end process
} // end class
