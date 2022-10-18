package java012_api;

public class Java116_String {

	public static void main(String[] args) {
		String sn = "java"; // 기존에 저장된 'java' 를 찾아 두개 모두 똑같은 메모리 주소를 가리킴
		String sg = "java";
		
		String st = new String("java"); // new 명령어의 경우 무조건 새로운 메모리 생성
		String ss = new String("java");
		
		
		//주소비교 (String 참조타입) 
		System.out.printf("sn==sg:%b\n",sn==sg); //sn==sg:true
		System.out.printf("st==ss:%b\n",st==ss); //st==ss:false
		
		//sn.equals(sg):true   equals는 메모리에 저장된 문자열을 비교해줌
		System.out.printf("sn.equals(sg):%b\n",sn.equals(sg));
		//st.equals(ss):true
		System.out.printf("st.equals(ss):%b\n",st.equals(ss));
		//st.euqalsIgnoreCas(st) : 대소문자 구분안하고 비교함 안함
		//st.equals(st) : 대소문자 구분하여 비교함
		
	}

}
