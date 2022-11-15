package java006_class.part01;

public class Java065_class {

	public static void main(String[] args) {
		
		Person ps; // 객체 참조변수 선언
		ps = new Person(); // 선언하고 초기값을 주지 않으면 데이터 타입에 따락 기본값을 가짐
		
		ps.name = "홍길동";
		ps.age = 30;
		ps.gender = '남';
		ps.develop();
		ps.run();
		
		System.out.printf("%s %d %c\n", ps.name, ps.age, ps.gender);
		
		Person pn = new Person();
		ps.name = "김영희";
		ps.age = 28;
		ps.gender = '여';
		ps.develop();
		ps.run();
		  
		System.out.printf("%s %d %c\n", ps.name, ps.age, ps.gender);
	}

}
