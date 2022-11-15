package java008_static_access.part01;

public class Java083_static {

	public static void main(String[] args) {
		
		System.out.printf("StaticEx.y=%d\n", StaticEx.y);
		//System.out.printf("StaticEx.y=%d\n", StaticEx.x);
		
		StaticEx se = new StaticEx();
		System.out.printf("se.x=%d, se.y=%d\n", se.x, se.y);
		
		StaticEx ss = new StaticEx();
		System.out.printf("ss.x=%d, ss.y=%d\n", ss.x, ss.y);
		
		se.x = 20;
		se.y = 30;
		
		System.out.printf("se.x=%d, se.y=%d\n", se.x, se.y);
		System.out.printf("ss.x=%d, ss.y=%d\n", ss.x, ss.y);
		
	} // end main

} // end class
