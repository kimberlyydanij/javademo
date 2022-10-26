package java004_array;

/*
 *  
 *  [출력결과]
 *   1   2   3   4   5
 *   -   -   -   -   - 
 *  11  12  13  14  15    
 *   -   -   -   -   - 
 *  
 */

public class Java046_array {
	public static void main(String[] args) {
	
		int[][] num= {{1,2,3,4,5},
					  {6,7,8,9,10},
					  {11,12,13,14,15},
					  {16,17,18,19,20}};
		
		for(int i = 0; i<num.length;i++) {
			
			for (int j = 0; j<num[i].length;j++) {
				if(i%2!=0) 
					System.out.printf("%3s","-"); 
				else System.out.printf("%3d",num[i][j]);
				
				 					 } //end j;
			System.out.println();
		}//end i;
		
	} // end main();
} // end class

