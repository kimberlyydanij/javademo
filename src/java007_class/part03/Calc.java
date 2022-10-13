package java007_class.part03;

import javax.xml.stream.events.EndDocument;

public class Calc {
	int left;
	int right;
	char ope; // 연산자는 +, -, /, *만 저장함
	
	public Calc() {
	}

	public Calc(int left, int right, char ope) {

		this.left = left;
		this.right = right;
		this.ope = ope;
	}
	
	public int process() {
		switch(ope) {
		case '+' : return left+right;
		case '-' : return left-right;
		case '*' : return left*right;
		case '/' : return left/right;
		default : return 0;
		}// end switch
	} // end process

	public String toString() {
	
		return toString("%2d %2c %2d = %d", left, ope, right, process());
	}

} // end Calc

