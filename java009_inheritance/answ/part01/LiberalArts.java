package java009_inheritance.answ.part01;

public class LiberalArts extends Student{
	
	int japanese; // 일본어
	int history;  // 한국사
	
	public LiberalArts(String name, String major, int korean, int math, int english, int japanese, int history) {
		super(name, major, korean, math, english);
		this.japanese = japanese;
		this.history = history;
	}

	public void prn(data[](String name, String major, int korean, int math, int english, int japanese, int history)) {
		int total;
		double avg;

		System.out.println("   이름    학과    총점    평균   ");
		System.out.println("===================================");

		    
		// 계산식을 구현하시오 
			for (int i=0;i<data.length;i++) {
				total = 0;
				avg = 0.0;
				for (int j=2;j<data[i].length;j++) {
					total = total + data[j];
					
					
				} // end j
				} // end i
					
			} // end prn;
	  
 	
	public String toString() {
		
		String data = name + "\t" + major + "\t" + korean + "\t" + math + "\t" + english;
		return data;
	}
}



