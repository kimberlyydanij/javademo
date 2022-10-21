package java017_collection;

import java.util.Vector;

public class Java180_Vector {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add(new String("java"));
		v.add(new String("jsp"));
		v.add(new String("spring"));
		
		//일반 반복문////////////////////////
		for(int i=0;i<v.size();i++) {
			String data = v.get(i);
			System.out.println(data);
		} // end for
		
		//개선된 반복문//////////////////////
		//for(데이터타입변수 : 배열 or 컬렉션)
		for(String data : v) { 
			System.out.println(data);
		} // end for
		
		//Integer -> Number -> Object : up-casting
		Vector<Number> vt = new Vector<Number>();
		vt.add(new Integer(10));
		//Double -> Number - > Object : up-casting
		vt.add(new Double(10.4));
		//Float -> Number -> Object : up-casting
		vt.add(new Float(4.8f));
		
		for(Number ne : vt) {
			if(ne instanceof Integer) {
				Integer it = (Integer)ne;
				System.out.println(it); }
			else if (ne instanceof Double) {
				Double de = (double)ne;
				System.out.println(de); 
			}else if (ne instanceof Float) {
				Float ft = (float)ne;
				System.out.println(ft); }
		}
		
	} // end main

} // end class
