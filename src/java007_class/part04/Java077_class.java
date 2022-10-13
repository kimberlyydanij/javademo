package java007_class.part04;

/* 
 * [데이터]
 * a001 
 * a002 생명보험 운전자보험 20000
 * b001 손해보험 화재보험  15000
 * b002 손해보험 해상보험  25000
 */
public class Java077_class {

	public static void main(String[] args) {
		
	} // end main
	
	public static int process(Insurance[] is, String name) {
		int sum = 0;
		for(int i=0;i<is.length;i++) {
			if(is[i].name == name) {
				sum += is[i].payment;
			} // end if
		} // end for
		return 0;
	} // end process
	
	public static void totalPrice(int sum, String name) {
		System.out.printf("%s 총납입액은 %d원 입니다\n.",name,sum);
		
	}

} // end class
