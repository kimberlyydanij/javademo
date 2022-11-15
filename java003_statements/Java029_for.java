package java003_statements;

public class Java029_for {
	public static void main(String[] args) {
	
		int odd = 0; //홀수
		int even = 0; //짝수
		for(int i = 1;i <= 10; i++) {
			if(i%2==0) {
			even = even + i;
			} else {
				odd = odd+ i;
			}
		} 
		System.out.printf("홀수의 합은=%d, 짝수의 합은=%d\n", odd, even);
}

}
 