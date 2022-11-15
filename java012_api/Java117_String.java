package java012_api;

public class Java117_String {

	public static void main(String[] args) {
		String str = new String("KoREa,jsp,java");
		System.out.println("문자열 길이: "+str.length()); //14
		System.out.println("대문자 : "+str.toUpperCase()); //KOREA,JSP,JAVA
		System.out.println("소문자 : "+str.toLowerCase()); //korea,jsp,java
		System.out.println("문자 : "+str.charAt(0)); // K (0 번째 문자)
		System.out.println("인덱스 : "+str.indexOf('a')); //4 ('a'가 위치한 첫 인덱스)
		System.out.println("인덱스 : "+str.indexOf(97)); //4
		System.out.println("인덱스 : "+str.lastIndexOf('a')); //13 뒤에서부터 찾아줌
		System.out.println("범위 : "+str.substring(5,13)); //,jsp,jav 5번부터 13번까지 출력
		System.out.println("범위 : "+str.substring(5)); // ,jsp,java 5부터 마지막 까지
		
		//메모리에 저장된 문자열을 ","로 구분해서 문자열 배열로 리턴		
		String[] arr = str.split(",");
		for(int i=0;i<arr.length;i++) {
			System.out.printf("arr[%d]=%s\n",i,arr[i]);
		}
		/* 
		 *  arr[0]=KoREa
			arr[1]=jsp
			arr[2]=java
		 */
		int x = 10;
		int y = 20;
		System.out.printf("%d+%d=%d\n",x,y,x+y); //10+20=30
		
		//Stirng <- int  valueOf
		String s1 = String.valueOf(x); 
		String s2 = String.valueOf(y);
		System.out.printf("%s+%s=%s\n",s1,s2,s1+s2); //10+20=1020
		
		char[] data = {'1','2','3'};
		String s3 = String.valueOf(data);
		System.out.println(s3); //123
	} // end main

} // end class
