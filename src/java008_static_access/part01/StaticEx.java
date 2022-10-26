package java008_static_access.part01;

/*
 * static
 * 1. class loader 일때 method area에 저장이 된다.
 * 2. 같은 클래스로 생성된 객체끼리 공유해서 사용한다.
 * 3. static 키워드가 선언된 메소드에서 this, super키워드를 사용할 수 없다.
 */
public class StaticEx {
	int x = 5;
	static int y = 10;


	public StaticEx() {
		
	}

	public StaticEx(int x) {
	
		this.x = x;
	}
} //end class
