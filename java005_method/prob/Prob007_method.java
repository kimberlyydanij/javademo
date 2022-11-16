package java005_method.prob;
/*
 * [출력결과]
 * 내림 차순 결과
    31
	22
	16
	11
	10
	9
    오름 차순 결과
	9
	10
	11
	16
	22
	31
 */
import java.util.Arrays;
public class Prob007_method {

	public static void main(String[] args) {
		int[] arr = {10, 22, 9, 16, 11, 31};
		int[] result1 = sort(arr,"desc");
		int[] result2 = sort(arr,"asc");

		System.out.println("내림 차순 결과");
		for (int i = 0; i < result1.length; i++) {
			System.out.printf("%d ",result1[i]);
		}
		System.out.println();
		System.out.println("오름 차순 결과");
		for (int i = 0; i < result2.length; i++) {
			System.out.printf("%d ",result2[i]);
		}
	}//end main( )

	private static int[] sort(int[] array, String orderby) {
		// 구현하시오.
		int[] data=array.clone();
		int temp;
		if(orderby=="desc") {
			
			for(int i = 0; i < data.length; i++) {
				for(int j = 0 ; j< data.length; j++) {
					if (data[i] > data[j]) {
						temp = data[i];
						data[i] = data[j];
						data[j] = temp;
					} // end if
				}	// and j
				} // end i
			} else if(orderby=="asc") {
				for(int i = 0; i < data.length; i++) {
					for(int j = 0 ; j< data.length; j++) {
						if (data[i] <  data[j]) {
							temp = data[i];
							data[i] = data[j];
							data[j] = temp;
						} // end if
					}	// and j
					} // end i
			} //end if			
		return data;
	}//end sort( )
}