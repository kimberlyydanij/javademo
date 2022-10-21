package java012_api;

/* 
 * JAVA API(Application Programming Interface)
 * Object
 * 1. 클래스 중에서 최상위 클래스이다.
 * 2. Object를 제외한 모든 클래스들은 Object를 상속받고 있다.
 * 3. java.lang 패키지에서 제공하는 클래스이다.
 */

public class Java114_Object {

	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println(obj);
		System.out.println(obj.toString());
				
		int x = 5;
		int y = 5;
		System.out.printf("x=%d, y=%d x==y:%b\n",x,y,x==y);
		
		Object ojt = new Object();
		// false, 주소 값을 비교하기 떄문에 항상 false (참조 데이터 타입)
		System.out.printf("obj==ojt:%b\n",obj==ojt); 
		
		//equals() : 주소 비교 - 객체 비교만 가능하다. // obj.equals(ojt):false
		System.out.printf("obj.equals(ojt):%b\n",obj.equals(ojt));
		
		//class java.lang.Object
		System.out.println(obj.getClass());
		
		//java.lang.Object
		System.out.println(obj.getClass().getName());
		
		//405662939
		int num = obj.hashCode();
		System.out.println(num);
	} // end main

} // end class
