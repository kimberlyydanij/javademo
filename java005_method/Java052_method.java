package java005_method;

/*
 * method(메소드)정의
 * 1. 값을 계산하기 위해서 사용되는 기능이다.
 * 2. 객체의 동작을 처리하기 위한 기능이다.
 * 
 * method정의 : 선언부 + 구현부
 * 반환자료형           메소드명(데이터타입 매개변수) => 메소드 선언부
 * {      (void/반환값이 없을때)  String[] args
 *    메소드가 호출 되었을때 실행 문장              => 메소드 구현부
 *    return 값; 
 * }
 * 
 * 매개변수 = parameter
 * 인수 = argument
 * 
 * 1. 리턴값이 없고, 매개변수가 없는 형식
 *    void add() { 
 *     int x = 10;
 *     int y = 20;
 *     if(x<0)
 *    	 return;  // 메소드를 빠져나올때는 강제적으로 return; (void 일때는 값을 주면 안됨)
 *    System.out.println(x+y);
 *    }
 *    
 * 2. 리턴값은 있고, 매개변수는 없는 형태
 *    double avg() {
 *     int x = 10;
 *     int y = 20;
 *       return (x+y)/2;  // double ave = (x+y)/2; 타입이 안맞으면 자동 형변환 발생
 *    }
 * 
 * 3. 리턴값이 없고, 매개변수는 있는 형태
 *    void plus(int x, int y) {
 *     System.out.println(x+y);
 *    }
 *    
 *    plus(10,20);
 *    
 * 4. 리턴값이 있고, 매개변수도 있는 형태
 *    double avg(int x, int y){
 *     return (x+y)/2.0;  
 *    }
 */

public class Java052_method {

	/* 
	 * 프로그램을 실행하면 JVM(자바 가상머신-Java Virtual Machine)에서
	 * main 스레드가 main() 메소드를 호출한다.
	 * 
	 * JVM은 운영체제에 특화된 코드로 변환하여 실행한다. 즉 자바 프로그램 실행환형을 만들어 주는 소프트웨어이다.
	 */
	
	public static void main(String[] args){ //1
		System.out.println("main start");   //2
		makeTest();                         //3
		System.out.println("main end;");    //7
	} // end main                           //8
	
	public static void makeTest() {         //4
		System.out.println("makeTest");     //5
	} // end makeTest                       //6

} // end class
