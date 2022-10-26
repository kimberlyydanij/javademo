package java019_inner.part02;

public class OuterStatic {
	private int x;
	static private int y;
	
	static void call() {
		//x = 30; x가 non-static이기 때문에 호출 안됨
		y = 9;
		
	} // end call()
	
	static class InnerStatic {
		int z ;
		void prn() { // 클래스에 static이 붙으면 멤버변수에는 안붙어도 됨
			// x = 50; non-static 이기때문에 호출 안됨
			// non-static 외부 자원을 static 내부 클래스에서 참조할 수 없다.
			y = 20;
			z = 40;
			System.out.printf("y=%d, z=%d\n",y,z);
			
		} // end prn()
		
	} // end InnerStatic
} // end class
