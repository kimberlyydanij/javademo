package java005_method;

/*
 * [출력결과]
 * java test
 * tset avaj
 * java test
 */

public class Java064_method {
	public static void main(String[] args) {
		char arr[] = {'j','a','v','a',' ','t','e','s','t'};
		
				System.out.println(arr);  // java test
				System.out.println(reverse(arr)); // tset avaj
				System.out.println(arr); // java test
				
	} // end main
		
	public static char[] reverse(char[] data) {
		//data 의 요소 앞 뒤를 바꿔서 리턴하는 프로그램 구현
		char rvs[] = new char[data.length];
		int j = 0;
		for(int i=data.length-1;i>=0;i--) {
    	rvs[j] = data[i];
    	j++;
		} // end i
		
	return rvs;
	} // end reverse;
	
	} // end class

