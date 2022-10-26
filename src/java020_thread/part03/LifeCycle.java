package java020_thread.part03;

/* 
 * 스레드 생명주기(Thread Life Cycle)
 * start() - 실행준비상태(Runnable) - run() - Terminated
 *                             sleep(시간), wait(깨워야힘)-대기상태(waiting)
 *                                
 */
public class LifeCycle extends Thread{
	public LifeCycle() {
	
	} // end LifeCycle
	
	public void run() {
		System.out.println(getState()); // RUNNABLE
	} // end run

} // end class
