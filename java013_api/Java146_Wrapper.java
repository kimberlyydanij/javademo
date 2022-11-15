package java013_api;

/*
 * sn 변수에 저장된 문자열중에서 숫자갯수를 출력하는 프로그램을 구현하시오.
 * [출력결과]
 * 숫자개수3
 */
public class Java146_Wrapper {

	public static void main(String[] args) {
		
		String sn = "Korea12 paran3";
		int cnt = 0;

		/*
		 *
		for(int i=0;i<sn.length();i++) {
		char data = sn.CharAt(i);

			if(Character.isDigit(data))
				cnt++;
		} //end for
		*/
		
		char[] line = sn.toCharArray();
		for(char data : line) {
			if(Character.isDigit(data))
				cnt++;
		}
		
		System.out.println("숫자개수 "+cnt);
		
	}

}
