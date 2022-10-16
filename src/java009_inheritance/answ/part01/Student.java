package java009_inheritance.answ.part01;

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

	public void prn(data[](String name, String major, int korean, int math, int english)) {
		int total;
		double avg;

		System.out.println("   이름    학과    총점    평균   순위 ");
		System.out.println("===================================");

		    
		// 계산식을 구현하시오 
			for (int i=0;i<data.length;i++) {
				total = 0;
				avg = 0.0;
			
					
				}
				for (int j=2;j<data[i].length;j++) {
					total = total + data[j];
					
					
				} // end j
				} // end i
					
			} // end prn;
	  
 	
	public String toString() {
		
		String data = name + "\t" + major + "\t" + korean + "\t" + math + "\t" + english;
		return data;
						
	} // end toStiring
} // end class


