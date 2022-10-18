package java012_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Java126_RegEX {

	public static void main(String[] args) {
		String phone = "016-253-5243";
		String dPhone = "010-8264-6896";
		System.out.println(phone.matches("01(1|6|9)-([0-9]{3}|[0-9]{4})-[0-9]{4}"));
		System.out.println(phone.matches("01(1|6|9)-([\\d]{3}|[\\d]{4})-[\\d]{4}"));
		
		Matcher mt = Pattern.compile("01(1|6|9)-([0-9]{3}|[0-9]{4})-[0-9]{4}").matcher(phone);
		while(mt.find())
			System.out.printf("%s\n",mt.group());
		
		Matcher dmt = Pattern.compile("01(1|6|9|0)-([0-9]{3}|[0-9]{4})-[0-9]{4}").matcher(dPhone);
		while(dmt.find())
			System.out.printf("%s\n",dmt.group());
	} //end main()

} //end class
