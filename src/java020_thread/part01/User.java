package java020_thread.part01;

public class User extends Thread {
	public User() {
		
	}
	
	@Override
	public void run() {
		//Thread로 실행 할 문장을 구현
		for(int i=0; i<=5; i++) {
			System.out.printf("%s i=%d\n",getName(),i); 
			// getName()현재 실행중인 thread이름을 리턴함
		} // end for
		
	} // end run
} // end class
