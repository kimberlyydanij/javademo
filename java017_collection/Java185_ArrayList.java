package java017_collection;

import java.util.ArrayList;

public class Java185_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add(new String("Java"));
		aList.add(new String("jsp"));
		aList.add(new String("spring"));
		prnDisplay(aList);
		process(aList);

	} // end main
 
	public static void prnDisplay(ArrayList<String> aList) {
		//aList 매개변수의 요소에서 'j'가 포함되어 있는 요소만 
		//출력하는 프로그램을 구현하세요.
		/*
		for(int i=0;i<aList.size();i++) {
			String chk="";
			chk = aList.get(i).toUpperCase();
			System.out.println(chk);
			for(int j=0;j<chk.length();j++)
				if(chk.indexOf[j]=="J")  */
		
		for(String sn : aList) {
			if(sn.toLowerCase().contains("j"))
				System.out.println(sn);
					}
	} // end prnDisplay
	
	public static void process(ArrayList<String> aList) {
		System.out.println(aList.contains("jsp"));
		
	}
} // end class
