package java013_api.prob;

import java.util.Arrays;
/*[문제]
 * 2~20 사이의 난수 10개를 발생시켜 배열에 저장한 후에 리턴하는 
 * makeArray() 메서드와 배열에서 소수를 구하여 출력하는 primeNumber() 메서드를 각각 구현하시오.
 * [출력결과]
<< 발생된 난수 >>
*  15 7  4  4  8  7  2  11  17  5 
<< 소수 숫자 >>
*  7 7 2 11 17 5
*  */
import java.util.Random;

public class Prob003_random {

	public static void main(String[] args) {
		int[] array = makeArray();
		System.out.println("<< 발생된 난수 >>");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println("\n<< 소수 숫자 >>");
		primeNumber(array);
	}// end main( )

	private static int[] makeArray() {
		// 난수값를 발생시킨후 반환하는 프로그램을 구현하시오.
		Random ran = new Random();
		int[] arr = new int[10];
		for(int i=0;i<10;i++) {
			arr[i] = ran.nextInt(20)+1;
			if(arr[i]==1)
			i--;
		}
		Arrays.sort(arr);
		return arr;
	
	}// end makeArray()

	public static void primeNumber(int[] array) {

		// array배열에서 소수만 출력하는 프로그램을 구현하시오.
		for(int j=0;j<array.length;j++) {
			 boolean result = true;
		        for(int i = 2; i < array[j]; i++) {
		        	System.out.printf("i=%d j=%d\n",array[i],j);
		            if( array[i]%j == 0) {
		                result = true;
		                break; 
		                //나누어 떨어지면 더이상 소수가 아니므로 break를 걸어 for문을 끝낸다.
		            } else {
		                result = false; } // end if
		        } // end j
			if (result=true)
				System.out.print(array[j]+ "+ ");
				
			} // end i
	
	}// end primeNumber()

}// end class
