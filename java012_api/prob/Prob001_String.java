package java012_api.prob;

/*
 1 매개변수로 받은 문자열에서 각 단어의 첫 번째 글자만 대문자로 변환하여
 리턴하는 initcap() 메서드를 구현하시오. 
 2 예를 들어 "hello world java" 는 "Hello World Java"로 변환됩니다. 
 3 출력결과
 Hello World Java
 Java Programming
 */
public class Prob001_String {

	public static void main(String[] args) {
		System.out.println(initcap("hello world java"));
		System.out.println(initcap("java programming"));
	}// end main()

	private static String initcap(String str) {
		// 매개변수로 받은 문자열에서 각 단어의 첫 번째 글자만 대문자로
		// 변환하여 반환하는 프로그램을 구현하시오.
		String arr[] = str.split(" ");
		String data="";
		for(int i=0;i<arr.length;i++) {
			if (arr[i].charAt(0)>='a' && arr[i].charAt(0)<='z')  //분리하고 첫글자 소문자인지 물어보기
				arr[i]= arr[i].substring(0,1).toUpperCase()+arr[i].substring(1);
		} // end for
		for(int i=0;i<arr.length;i++)
			data = data + arr[i] +" ";
	return data;
		
	}// end initcap()
}// end class
