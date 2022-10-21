package java007_class.part07;

/*
 * spread operator(...)
 * 1. jdk5 이전 버전세어슨 특정 메소드를 정의할 때 인자와 매개변수의 갯수 및 타입의 수를
 *    정해놓고 호출할 때 일치하지 않으면 오류가 발생한다.
 * 2. 이를 유연하게 처리할 수 있도록 variable agument 기능을 제공해주고 있다.
 * 3. 리턴타입 메소드명(데이터타입...가변매개변수) {}
 * 
 */
public class Java080_class {

	public static void main(String[] args) {
		CountVarg cv = new CountVarg();
		cv.addValue(4,8);
		cv.addValue(2,5,6);
		cv.addValue(2,3,5,6,8);
		cv.addValue(1.3,2.5);
		cv.sumValue("홍길동",70,80,65);
		

	}

}
