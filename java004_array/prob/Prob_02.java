package java004_array.prob;
/*
 * 4행 4열 data배열에 가로 세로 합계를 구하는 프로그램을 구현하시오.
 * [출력결과]
 *  1   2   3   6
 *  4   5   6  15
 *  7   8   9  24
 * 12  15  18  45
 */

public class Prob_02 {

	public static void main(String[] args) {
		int[][] data = new int[4][4];
		int cnt = 1;
		int sum = 0;
		// 여기를 구현하시오.
		for(int i=0; i<data.length-1;i++) {
			sum = 0;
			for(int j=0;j<data[i].length-1;j++) {
				
				data[i][j] = cnt;
				sum = sum + cnt;
				System.out.printf("%4d",data[i][j]);
				cnt++;
			} //end j
			data[i][data.length-1] = sum;
			System.out.printf("%4d \n",sum);
					
		} //end i

		for(int i=0;i<=data.length-1;i++) {
			sum = 0;
			for(int j=0;j<data[i].length-1;j++) {
				sum = sum + data[j][i];
				//System.out.printf("%4d",sum);
			}
			System.out.printf("%4d",sum);
		}
	}// end main()

}// end class


