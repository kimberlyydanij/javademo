package java020_thread.part02;

public class UserImp implements Runnable{

	public UserImp() {
		
	}
	
	public void run() {
		
		for(int i=0; i<=5; i++) {
			System.out.printf("%s i=%d\n",Thread.currentThread().getName(),i); 
			
		} // end for
} // end run
	
} // end class

