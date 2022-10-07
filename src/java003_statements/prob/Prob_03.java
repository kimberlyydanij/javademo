package java003_statements.prob;

/*
1+
1+2+
1+2+3+
1+2+3+4+
1+2+3+4+5=??

출력결과
sum=35
*/
public class Prob_03 {

	public static void main(String[] args) {
	
		String data="";
	for(int i = 1; i<=5; i++) {
		if(i==5) {
			data=data+i+"=??";
			System.out.println(data);}
			else {			
		data=data+i+"+";
		System.out.println(data); }
	}
	}// end main()
}// end class
