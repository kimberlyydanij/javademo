package java011_casting.part02;

/*
 * 다형성(polymorphism)
 * 1 사전적 의미는 '여러가지 형태를 가질 수 있는 능력'을 의미한다.
 * 2 자바에서는 한 타입의 참조변수로 여러 타입의 객체를 참조하는 기술이다.
 *   예를 들면, 하나의 타입으로 상속관계에 있는 여러 객체를 다루는 기술이다.
 */

public class Java110_binding {
	
	public static void main(String[] args) {
	
		Employee emp = new Employee("Steven", "code001");
		process(emp);
		
		Manager mg = new Manager("Neesa","professor","second");
		process(mg);
	}
	
	public static void process(Employee emp) {
		System.out.println(emp.toString());
	}
	
	public static void process(Manager mg) {
		System.out.println(mg.toString());
	}
}
