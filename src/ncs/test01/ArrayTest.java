package ncs.test01;

/*
 * 출력 결과는 다음과 같다. 소수점 아래 둘째자리까지 출력되게 한다.
합계 : 767.00
평균 : 38.35 
합계와 평균 값은 double로 처리한다.
 */

public class ArrayTest {

	public static void main(String[] args) {
	int [][]array = {{12, 41, 36, 56, 21}, {82, 10, 12, 61, 45}, {14, 16, 18, 78, 65}, {45, 26, 72, 23, 34}};
	double sum=0.0;
	double cnt=0.0;

	for(int i=0;i<array.length;i++) {
		for(int j=0;j<array[i].length;j++) {
			sum += (double)array[i][j];
			cnt = cnt+1.0;
		} // for j
		} //for i
		System.out.printf("합계 : %3.2f\n",sum);
		System.out.printf("평균 : %2.2f\n",sum/cnt);
		
	} // end main

	} // end class

