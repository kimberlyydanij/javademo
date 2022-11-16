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
		
		//여기에 작성하시오.
		
		int won[] = {500,100,50,10};
		
		for(int i=0;i<won.length;i++) {
			int mok = money/won[i];
		    System.out.printf("%d 원 : %d 개\n",won[i],mok);
		    money = money%won[i];		
		}
		 System.out.printf("1원 : %d 개\n",money);
				
	}//end main()

}//end class


