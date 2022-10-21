package java001_basic;

/*
 * 리터럴(literal) : 그 자체의 값(1,2,3,..., 'a','b','c',...,true,false)
 * 변수(variable) : 하나의 값을 저장하기 위한 메모리 공간 
 * 자바에서 제공하는 데이터 타입
 * 1. Primitive DataType (기본 데이터 타입)
 * 	문자 - char(2byte)
 * 	숫자 - 정수 : byte(1byte), short(2byte), int(4byte), long(8byte)
 *  	 실수 : float(4byte), double(8byte)
 *  논리 - boolean(1byte)
 *  	
 * 2. Reference DataType(참조 데이터 타입)
 * 	  Array, Class, Interface (new 사용해서 메모리 생성)
 * 
 * 시스템에서 인식하는 데이터 타입 크기
 * byte(1) < char(2) < short(2) < int(4) < long(8) < float(4) < double(8)
 */

public class Java003_dataType {
	public static void main(String [] args) {
		int data; // 데이터타입 변수명;
		data = 3; // data변수에 3값을 할당(저장)
		
		//int data = 3; 
		
		System.out.println(data);
		
		data = 10;
		System.out.println(data);
		
		double ave = 4;
		//Type mismatch: cannot convert from double to int
		//int num = 4.0;
		
		//Type mismatch: cannot convert from float to long
		//long ko = 4.0f;
		
		int x = 0101;  //65; 8진수
		System.out.println(x);
		
		int xx = 101;  //101;
		System.out.println(xx);
		
		int y = 65;
		System.out.println(y);
		
		int z = 0B101; //5 2진수,b(0B101 == 0b101)
		System.out.println(z);
		
		int k = 0X101; //257 16진수,x (0X101 == 0x101)
		System.out.println(k); 
		
		
		
	}
}
