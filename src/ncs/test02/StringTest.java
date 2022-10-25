package ncs.test02;
/* 
 * [문제 2] 다음과 같은 조건을 만족하는 프로그램을 작성 하시오
 * 주어진 String 데이터를 “,”로 나누어 5개의 실수 데이터들을 꺼내어 합과 평균을 구한다. 
 * 단, String 문자열의 모든 실수 데이터를 배열로 만들어 계산한다.
 * 1. 사용 데이터
 * String str = "1.22,4.12,5.93,8.71,9.34";
 * 
 * 합계와 평균은 모두 소수점 3자리까지만 표현한다
 * 합계:29.320
 * 평균:5.864
 */
public class StringTest {

	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34";
		double data[]= new double[5];
		double sum = 0;
		// str에서 데이터를 분리한다.
		String[] st = str.split(",");
		for(String a : st) 
			sum += Double.parseDouble(a);
		System.out.printf("합계 : %3.3f \n",sum);
		System.out.printf("평균 : %2.3f",sum/st.length);
		
			
		//for(Double  : st[]){ //for~each 문 사용한다.
		 // 배열에 실수 데이터를 넣는다.
		//배열 데이터의 합을 구한다. 
		//} // end for 
		 // 결과 값을 출력 한다.
		
	} // end main

} // end class
