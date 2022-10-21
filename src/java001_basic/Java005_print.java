package java001_basic;

public class Java005_print {
	public static void main(String[] args) {
		byte bNum = 2; // 1byte : -128 ~ +127끼지 표현가능
		short sNum = 4;
		int xNum = 5;
		long lNum = 6L; // L OR l
		float fNum = 2.5F; // F or f
		double dNum = 7.4;
		char cData = 'a';
		boolean eNum = true; // true or false
		String sData = "java";

		System.out.println(bNum + "," + sNum);
		/*
		 * System.out.printf("출력형식", 값1, 값2, 값..args.) 출력기호 %d : 정수(byte, short, int,
		 * long) %f : 실수(float, double) %b : 논리값(true, false) %c : 문자(char) %s :
		 * 문자열(String) %% : % \n : 줄바꿈 \t : 탭
		 */
		System.out.printf("%d %d %d %d %f %f %b %c %s \n", 
				bNum, sNum, xNum, lNum, fNum, dNum, eNum, cData, sData);
		//2 4 5 6 2.500000 7.400000 true a java 
		
		System.out.printf("%d %% %d = %d\n", 5,2,5%2); //5 % 2 = 1
		System.out.print("java"); //출력만하고 줄바꿈 없음
		System.out.println("program"); //출력후 줄바꿈 있음
		System.out.println(""); 
		System.out.println("jsp"); 
		System.out.println("test"); 
	}
}
