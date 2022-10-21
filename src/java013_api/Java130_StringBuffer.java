package java013_api;

public class Java130_StringBuffer {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("java test");
		
		// 4인덱스에 ", jsp" 문자열을 삽입
		sb.insert(4, ", jsp"); 
		System.out.println(sb); //java, jsp test
		
		sb.delete(4, 9) ;
		System.out.println(sb); //java test
		
		//마지막에 문자열을 추가
		sb.append(" start");
		System.out.println(sb); // java test start
		
		//문자열을 반대로 변경
		sb.reverse();
		System.out.println(sb); // trats tset avaj
		
		// Stirng - > StringButter -> String
		String data = "mybatis orm";
		StringBuffer sf = new StringBuffer(data);
		sf.reverse();
		System.out.println(sf); //mro sitabym
		System.out.println(data);  //mybatis orm
		String re = sf.toString();
		System.out.println(re); // mro sitabym
		
		//char[] -> String ->  StringButter
		char[] arr = {'k','o','r','e','a'};
		String sp = String.valueOf(arr);
		System.out.println(sp); // korea
		StringBuffer se = new StringBuffer(sp);
		se.reverse();
		System.out.println(se); //aerok
		
		System.out.println(new StringBuffer(String.valueOf(arr)).reverse()); // aerok  위에꺼 한줄로 표현 가능
		
		//StringBuffer -> String - > char[]
		String st = se.toString();
		char[] val = st.toCharArray();
		System.out.println(val); //aerok
		
		System.out.println(se.toString().toCharArray()); //위에꺼 한줄로 정리
		
		

				
		
	} // end main()

} // end class
