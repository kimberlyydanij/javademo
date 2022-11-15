package java007_class.part07;

public class CountVarg {

	void addValue(double...arr) {
		double sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
		} // end for
		System.out.println(sum);
	} // end addValue
	
	//고정 매개변수와 가변매개변수가 같이 사용될때는 언제나 고정매개변수를 먼저 선언한다.
	void sumValue(String name, int...arr) {
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
		} // end for
		System.out.printf("name=%s, sum=%d\n",name,sum);	
	} // end sumValue
} // end class
