package java012_api;


/*
 * [출력결과]
 * ip:127.0.0.1
 * port:8000
 */
public class Java118_String {

	public static void main(String[] args) {
		String sn = "127.0.0.1:8000";
		String ss[] = sn.split(":");
		System.out.println("ip:" +ss[0]);
		System.out.println("port:" +ss[1]);
		
		int index = sn.indexOf(":");
		System.out.println("ip: "+sn.substring(0,index));
		System.out.println("port: "+sn.substring(index+1));
		
	}

}
