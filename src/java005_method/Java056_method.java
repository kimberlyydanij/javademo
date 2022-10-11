package java005_method;

public class Java056_method {
	public static void main(String[] args) {
		int a = 10, b = 20;
		int c = a, d = b; // call by value, 값복사, 값에 의한 복사, 독립적임, 한번 넘겨주면 값이 변화하지 않음
		                  // 기본 변수로 선언되어있는 
		
		//c, d 변수의 값을 교환
		int temp = c;
		c = d;
		d = temp;
		
		System.out.printf("a=%d, b=%d\n", a,b); // a=10, b=20
		System.out.printf("c=%d, d=%d\n", c,d); // c=20, d=10
		
		System.out.println("====================================");
		int[] num = new int[] {10,20}; // 배열은 참조 데이터 타입.
		int[] arr = num; // call by reference, 주소에 의한 복사
		
		int imsi = arr[0];
		arr[0] = arr[1];
		arr[1] = imsi;
		
		System.out.printf("num[0]=%d, num[1]=%d \n",num[0], num[1]) ;
		System.out.printf("arr[0]=%d, arr[1]=%d \n",arr[0], arr[1]) ;
		
} // end main
	
} // end class
