package java009_inheritance.prob.part05;

public class LiberalArts extends Student{
	
	int japanese; // 일본어
	int history;  // 한국사
	
	public LiberalArts(String name, String major, int korean, int math, int english, int japanese, int history) {
		super(name, major, korean, math, english);
		this.japanese = japanese;
		this.history = history;
	}
	

	}
}



