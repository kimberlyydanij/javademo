package java008_static_access.part03;

public class Java085_static {
	int x = 3;
    static int y=5;
    
	public static void main(String[] args) {
		
		//System.out.printf("x=%d\n", x);
		System.out.printf("x=%d\n", y);
		
		//process(); // non-static
		display();
		Java085_static js = new Java085_static();		
		js.process();
	} // end main
	
	public void process() {
		System.out.println("process");
		
		
	}// end process
	
	public static void display() {
		System.out.println("display");
	} // end display
} // end class
 