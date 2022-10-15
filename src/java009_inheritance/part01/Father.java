package java009_inheritance.part01;

//최상위 Object, Object를 제외한 모든 클래스는 Object를 상속 받는다.
//아무것도 상속받지 않으면 내부적으로 extends Object를 상속시킨다.
public class Father /* extends Object */ {
	int a = 3;
	
	public Father() {

	}
	
	void display() {
		System.out.println("a=" +a);
	}

}
