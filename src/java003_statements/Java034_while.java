package java003_statements;

/*
 * while(조건식)
 * 반복문장 수행;
 */
public class Java034_while {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
	//	int i=1;
	//while(i<=5) {
	//System.out.println(i);
	//i++;
		
		int i=0;
		while(i++ <5) {
			System.out.println(i);
		}
	}

}
