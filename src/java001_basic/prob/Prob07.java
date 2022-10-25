package java001_basic.prob;
/*
* 동전교환프로그램
* 1 가장 적은 동전으로 교환할 수 있는 프로그램을 작성하시오
* 2 [출력결과]
*   500원: 15개 
    100원: 2개
    50원: 1개
    10원: 2개
    1원: 7개
    */

public class Prob07 {

	public static void main(String[] args) {
		int money = 7777;
		int mok = money / 500;
		int sum = money % 500;
		
		if (sum == 0) {
			System.out.printf("500원 : %d개",mok);
			sum = money % 500;
		} else if (sum!=0) {
			System.out.printf("500원 : %d개\n",mok);
			sum = money % 500;
			// System.out.println(sum);
			mok = sum / 100;
			System.out.printf("100원 : %d개\n",mok);
<<<<<<< HEAD
			sum = sum % 100
=======
			sum = sum % 100;
			System.out.println(sum);
			
>>>>>>> branch 'master' of https://github.com/kimberlyydanij/javademo.git
			//if(mok!=0)
				
			
			
		}
		//여기에 작성하시오.
				
	}//end main()

}//end class


