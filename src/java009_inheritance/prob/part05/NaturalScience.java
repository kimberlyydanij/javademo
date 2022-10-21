package java009_inheritance.prob.part05;

public class NaturalScience extends Student{
	
	int physics;   // 물리
	int chemistry; // 화학
	
	public NaturalScience(String name, String major, int korean, int math, int english, int physics, int chemistry) {
		super(name, major, korean, math, english);
		this.physics = physics;
		this.chemistry = chemistry;
	}

	
}
