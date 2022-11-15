package java009_inheritance.prob.part05;

/*
 *  Students 클래스를  상속받아 LiberalArts,NaturalScience 클래스를 오버라이딩 하고
 *  평균 점수를 오름차순하여 성적순으 출력하시오
 *  
 *  
 *  [데이터]
 *  
 *  이름    학과    국어   수학   영어   일본어  한국사  물리  화학
 * 김석진   이과     80   100    95                100  90  
 * 민윤기	  문과     100  60     70    50    65 
 * 정호석   이과     70   80     60                 90  80
 * 김남준   문과     100   90    100   100   95
 * 박지민   믄과     60    50    70    75    70 
 * 김태형   이과     60    70    50                 75  60
 * 전정국   이과     80    95    70                 90  70
 *  
 * [출력결과]
 * 이름    학과    총점    평균   순위 
 * ==================================
 * 김석진  이과   
 */



public class Prob05_inheritance {
	
	public static void main(String[] args) {
		
		Student st[] = new Student[7];
		
		st[0] = new Student ("김석진","이과",80,100,95,100,90);
		st[1] = new Student ("민윤기","문과",100,60,70,50,65);
		st[2] = new Student ("정호석","문과",70,80,60,90,70);
		st[3] = new Student ("김남준","문과",100,90,100,100,95);
		st[4] = new Student ("박지민","문과",60,50,70,75,70);
		st[5] = new Student ("김태형","이과",60,70,50,75);				
		st[6] = new Student ("전정국","이과",80,95,70,90);	
		
		// 출력결과와 같이 출력 되도록 구현하시오
		
		} //end main;


} // end class