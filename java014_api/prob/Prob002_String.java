package java014_api.prob;

import java.util.Arrays;

/*
 * javac Prob001_String.java
 * java Prob001_String JAva Test
 */
/*1 프로그램 실행할때  "JAva Test" 문자열을 args배열에서 값을 받아 출력결과에 같이
 *  나오도록 프로그램을 구현하시오.
 *  java Prob001_String JAva Test
 *   * 
 * 2 출력결과
 *   source : JAva Test 
 *   convert: jaVA tEST
 *   length: 9
 *   reverse : tseT avAJ
 */

public class Prob002_String {

	public static void main(String[] args) {
		
		String s = Arrays.toString(args);
		
		char[] data = s.toCharArray();
		
		System.out.print("source  : ");

		for(int i=0;i<args.length;i++) {
	 		System.out.print(args[i]);
		}
		System.out.println();
		System.out.print("convert : ");
		///////////////////////////////////////////////////////////
		
		
		for(int i=1;i<data.length-1;i++) {
			if(Character.isUpperCase(data[i])) {
				data[i] = Character.toLowerCase(data[i]);
				System.out.print(data[i]);}
				else if (Character.isLowerCase(data[i])) {
					data[i] = Character.toUpperCase(data[i]);
					System.out.print(data[i]);}
				else System.out.print(" "
						);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}// end for i 

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println();
		System.out.println("length: "+(data.length-2));
		//System.out.println(data.reverse().toString);
		
			
		//for(int i=0;i<data.length;i++) {
	 	//	System.out.print(data[i].charAt);
	 		
		//}
		
		//String b = data.charAt();	
		//System.out.println("source : "+data.charAt); }  
			} // end main
		
}// end class

