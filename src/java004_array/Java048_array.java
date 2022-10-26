package java004_array;

/*
 *   1   2   3   4   5
 *  10  9
 *  11  12  13  14  15   
 *  16  17  18  19  20
 */

public class Java048_array {
	public static void main(String[] args) {

		int[][] num= {{1,2,3,4,5},
					  {6,7,8,9,10},
					  {11,12,13,14,15},
					  {16,17,18,19,20}};
		
	/*	for(int i = 0; i<num.length;i++) {  // 0~3 4회
			int cnt = num.length;
			if(i%2==0) {
				for (int j = 0; j<cnt+1;j++) 
						System.out.printf("%3d",num[i][j]); 
				}else {
					for (int k=cnt;k>-1;k--) 
						System.out.printf("%3d",num[i][k]);  
				}
			System.out.println();
		}  */
	
		
		for(int i = 0; i<num.length;i++) {  // 0~3 4회
			if(i%2==0) {
				for (int j = 0; j<=num.length;j++) 
						System.out.printf("%3d",num[i][j]); 
				}else {
					for (int k=num.length;k>=0;k--) 
						System.out.printf("%3d",num[i][k]);  
				}
			System.out.println();
		}
		
		
	}
}

				
			