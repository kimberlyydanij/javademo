package java013_api;

import java.util.StringTokenizer;

// ctr shift + o / 또는 뒤에 커서 놓고 컨트롤 + 스페이스바


public class Java132_StringTokenizer {

	public static void main(String[] args) {
		//StringTokenizer("문자열", "구분자")
		//구분자가 공백일 때 생략 가능
		
		StringTokenizer st = new StringTokenizer("java jsp");
		//System.out.println(st.countTokens()); // 2
		//System.out.println(st.nextToken()); // java
		//System.out.println(st.countTokens()); // 1
		//System.out.println(st.nextToken()); // jsp
		//System.out.println(st.countTokens());  //0  
		// 토큰을 꺼내오면 기존에 생성된 메모리는 없어짐
	
		//int count = st.countTokens();
		//for(int i = 0; i<count;i++) {
		//	System.out.println(st.nextToken());
		//}
			
		while(st.hasMoreTokens()) {  //hasMoreTokens(논리값 리턴, has또는 is로 시작하면 거의 논리값 리턴)
			System.out.println(st.nextToken());
		}
		
		
		
	}  //end main

	
} // end class
