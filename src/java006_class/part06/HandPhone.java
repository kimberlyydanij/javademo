package java006_class.part06;

/* 
 * 생성자(constructor)
 * 1. 객체의 초기값 할당
 * 2. 생성자명은 클래스명하고 같다.
 * 3. 생성자는 클래스에서 1개 이상이 존재 한다.
 * 4. 클래스에 정의된 생성자가 없으면 JVM에서 기본 생성자를 제공한다.
 *    [기본생성자]
 *    - 클래스의 접근제어자 (modifier)하고 같고 파라미터가 없는 구조이다.
 *    	public HandPhone () {} 
 */

 /* this(자신) 호출할 때
  * 1. 멤버 변수명과 매개변수명이 같을때 this를 붙임
  * 2. 생성자 안에서 다른 생성자를 부를 떄 this를 붙임
  * 3. 현재 메모리에 생성된 메모리 자신
  */
public class HandPhone {
	//멤버변수 
	String name;
	String number;
	
	//기본 생성자
	//public HandPhone() {} //생성자를 정의할떄는 반드시 클래스명과 동일해야한다. 생성자가 1개라도 있으면 자바에서 제공하지 않는다.
	
	HandPhone() {}  
	
	//오버로딩 매개변수가 아닌 타입으로 구별, 매개변수의 수가 다름
	HandPhone(String name) {
		this.name = name;
	}
	
	HandPhone(String name, String number) {
		this.name = name;
		this.number = number;
	}
	
	//메소드
	void display() {
		System.out.printf("%s %s\n", name, number);
	}
}
