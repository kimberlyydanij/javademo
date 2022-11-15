package java004_array;

/* 
 * [데이터]
 * 홍길동  90 85 40
 * 이영희 100 35 75
 * 
 * [출력결과]
 * 홍길동  90 85 40 215 71.7
 * 이영희 100 35 75 210 70.7
 */
public class Java045_array {

	public static void main(String[] args) {
		String[] name = {"홍길동","이영희"};
		int[][] jumsu = {{90,85,40},{100,35,75}};

			for(int i = 0;i<name.length;i++) {
			int sum = 0;
			float avg = 0.1F;
			for(int j=0;j<jumsu[i].length;j++) {
				sum = sum + jumsu[i][j];}
			
			avg = sum / jumsu[i].length;
			System.out.printf("%s :",name[i]);
		
				for(int k=0;k<jumsu[i].length;k++) {
					System.out.printf("%3d ",jumsu[i][k]); 
					}
			System.out.printf("%4d %4.1f\n",sum, avg); }
			    
				
		
	} //end main();

} //end class
