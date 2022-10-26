package java003_statements;

public class Java031_for {

	public static void main(String[] args) {
				
		for(int row=1; row<=4; row++) {
				for(int col =1; col<=5; col++) {
				//data++;
				System.out.printf("%4d",col);
				
				if(col%5==0)
					System.out.println("");					
			}
			
		}

	}

}
 