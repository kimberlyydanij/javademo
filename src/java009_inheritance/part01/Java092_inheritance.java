package java009_inheritance.part01;
/*
 * 상속(inheritance) : 기본 클래스가 가지고 있는 멤버들을 새로 만들 클래스에서 직접 만들지 않고
 * 					 상속을 받음으로써 새 클래스가 자신의 멤버처럼 사용할 수 있게 만드는 기술이다.
 * 
 * 1. 기본 클래스를 재사용 해서 새로운 클래스를 정의하는 것이다.
 * 2. 두 클래스를 조상과 자손관계로 맺어준다. (extends)
 * 3. 상속을 해주는 클래스 : 수퍼클래스(super), 부모클래스, 기본클래스
 *    상속을 받는 클래스 : 서브클래스(sub), 자식클래스, 유도클래스
 * 4. 자식(손)의 클래스는 조상의 모든 자원을 상속받는다. (생성자, static{}은 제외)
 * 5. 자식(손)의 자원은 부모보다 크거나 같아야 하낟.
 * 6. 상속을 할때 사용되는 키워드 : extends
 *    클래스에 클래스를 상속 : 단일상속,  인터페이스에 인터페이스 상속 : 다중상속
 *    
 *    class A{ }
 *    class B extends A[]
 *    자식크랠스 B extends 부모클래스 A
 *    
 *    A는 B를 상속한다. 
 *    B는 A이다. (상속관계의 클래스를 is a 관계라 한다.)
 *    
 *    class 도형{}
 *    class 삼각형 extends 도형{}
 */

public class Java092_inheritance {

	public static void main(String[] args) {
		Child child = new Child();
		System.out.println("b=" +child.b);
		System.out.println("a=" +child.a);
		child.display();
		System.out.println(child.toString());
		//c멤버변수는 private가 선언되었기 때문에 상속되지 않는다.
		//System.out.println("c="+child.c);
		

	}

}
