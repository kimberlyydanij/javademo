package java019_inner.part03;

// local class에서는 final 선언이 중요함

public class OuterLocal {
	private int x;
	static int y;
	final private int z = 10; // final이 붙은 변수는 새로운 값이 할당이 안됨
	
	public void call(int a) {
		final int b = 20;
		int c = 30;
		//a = 300;
		//c = 500;
		System.out.printf("a = %d\n",a);
		
		class InnerLocal {
			void prn() {
				x = 5;
				y = 150;
			    // z = 20; // final이 붙은 변수는 새로운 값이 할당이 안됨
				
				System.out.println("x=" +x);
				System.out.println("y=" +y);
			    System.out.println("a= "+a);
				System.out.println("b= "+b);
				System.out.println("c= "+c);
				 
			} // end prn()
		} // end InnerLocal
		
		InnerLocal inner = new InnerLocal();
		inner.prn();
		
	} // end call
} // end class
 