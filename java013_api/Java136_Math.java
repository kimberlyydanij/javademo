package java013_api;

import static java.lang.Math.*;

/*
 * 난수를 이용해서 소숫점 첫째짜리 까지 반올림 해서 구하시오.
 * ex) 0.5689.. =>5.7
 */
public class Java136_Math {

	public static void main(String[] args) {

		double ran = random();
		System.out.println(ran);
		
		ran = ran * 100;
		System.out.println(ran);
		
		//System.out.println(round(ran));
		
		long data = round(ran);
		System.out.println(round(ran));
		
		double num = (double)data/10;
		System.out.println(num);
		
		System.out.println("/////////////////////////////////");
		double res = random();
		System.out.println(res);
		System.out.println((double)(round(res*100))/10);
	}

}
