package java009_inheritance.prob.part05;

public class Student {

	String name;     //이름
	String major;    //학과
	int korean;      //국어
	int math;        //수학
	int english;     //영어
	

		
	public Student(String name, String major, int korean, int math, int english) {
		super();
		this.name = name;
		this.major = major;
		this.korean = korean;
		this.math = math;
		this.english = english;
	}

	public void prn() {
		
		// 계산식을 구현하시오 
	}

 	
	public String toString() {
		
		String data = name + "\t" + major + "\t" + korean + "\t" + math + "\t" + english;
		return data;
						
	}
}


