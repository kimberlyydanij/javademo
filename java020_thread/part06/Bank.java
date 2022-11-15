package java020_thread.part06;

public class Bank implements Runnable() {
	private AccountNumber an;
	
	public Bank() {

	}
	
	public Bank(AccountNumber an) {
		this.an = an;
	}
	

	private void run() {
		an.input();
		an.withDraw();
	
	} // end run

	
} // end class
