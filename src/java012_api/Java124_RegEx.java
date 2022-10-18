package java012_api;

/* 
 * 정규화 표현식(Regular Expression)
 * 정규화 표현식(정규식)이란 텍스트 데이터 중에서 원하는 조건(패턴)과 일치하는 문자열을 
 * 찾내기 위해 사용하는 것으로 미리 정의된 기호와 문자를 이용해서 작성한 문자열을 말한다.
 */

public class Java124_RegEx {

	public static void main(String[] args) {	
		String sn = "java korea";
		String sg = "";
		
		//a또는 r이면 '_'로 변경
		
		for(int i=0;i<sn.length();i++) {
			char data = sn.charAt(i);
			if (data=='a' || data=='r') {
				sg += "_";
		} else {
			sg += data;
		} // end if
			
		} // end for
		System.out.println(sg);
		System.out.println("Regular Expression을 이용한 문자 변경");
		System.out.println(sn.replaceAll("[ar]","_"));  // [] 안의 숫자는 a이거나 r
		
		System.out.println(sn.matches(".*[ar].*"));  //true, 문자열안에 a이거나 r이 포함되어 있으면 true, 아니면 false 리턴
		System.out.println(sn.matches("[ar].*")); //false, a이거나 r로 시작하면;
		
		String st = "java      korea";
		String sa = st.replaceAll("\\s{2,3}", "@");  // \\s 공백 2~3을 @로 바꿔라
		System.out.println(sa);
		String so = "java       korea";
		String sb = so.replaceAll("\\s{1,2}", "@");
		System.out.println(sb);
		
} // end main
}// end class
