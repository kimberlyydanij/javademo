package java004_array;

public class Java049_array {

	public static void main(String[] args) {
		
		char[][] alpa = new char [][]{{'a','b','c','d'},
									  {'a','b','c','d'},
									  {'a','b','c','d'},
									  {'a','b','c','d'},
									  {'a','b','c','d'}};
		
		for(int i=0;i<alpa.length;i++) {
			for(int j=0;j<alpa[i].length;j++) {
				if(i!=j)  {
					System.out.printf("%c ",alpa[i][j]);  }
				else { 
					System.out.printf("* ");
					System.out.printf("%c ",alpa[i][j]);
					}
				if(i==j && j==4)
					System.out.printf("* ");
			} // end j;

		System.out.println();
		} // end i; */
		


		
		} // end main()
		
	} //end class


