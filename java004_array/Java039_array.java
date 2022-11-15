package java004_array;

/* 
 * 출력결과
 * 홀수:3
 * 짝수:42
 */
public class Java039_array {
	public static void main(String[] args) {
		int[] num = new int[] {22,3,8,12};
		int odd = 0;
		int even = 0;

		
		for(int i =0;i<num.length;i++) {
			if(num[i] % 2 ==0) {
				even = even + num[i]; 
			}else {
				odd = odd + num[i];
			}
		}
		System.out.println("홀수:" + odd);
		System.out.println("짝수:" + even);
		
		
}//end main
}//end class
