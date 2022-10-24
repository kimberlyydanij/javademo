package java016_stream.prob;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

<<<<<<< HEAD
/*
 * [문제]score.txt 파일의 점수 정보를 읽어 들여서 각 학생의 점수 총합을 
 *       콘솔창에 출력하는 입출력 프로그램을 main() 메서드에 구현하시오.
 * 
 * [프로그램 실행결과]
 * kim의 점수 통합 :146
 * hong의 점수 통합 :243
 * park의 점수 통합 :240
 */
public class Prob001_stream {
	
	public static void main(String[] args) {
		
		
		
	     //각 학생의 총점을 출력하는 프로그램을 구현하시오.
		File file=new File("./src/java016_stream/prob/score.txt");
		
		try(Scanner sc = new Scanner(file)) {
			
			while(sc.hasNextLine()) {

				String[] data = sc.nextLine().split("[:/]");
				
				System.out.printf("%s의 점수 통합 :%d\n",data[0],Integer.parseInt(data[1])+
						Integer.parseInt(data[2])+
						Integer.parseInt(data[3]));
		
				
				
				
			}
			
		} catch (Exception e) {
			
		}
=======


/*
 * [문제]score.txt 파일의 점수 정보를 읽어 들여서 각 학생의 점수 총합을 
 *       콘솔창에 출력하는 입출력 프로그램을 main() 메서드에 구현하시오.
 * 
 * [프로그램 실행결과]
 * kim의 점수 통합 :146
 * hong의 점수 통합 :243
 * park의 점수 통합 :240
 */
public class Prob001_stream {
	
	public static void main(String[] args) {
	     //각 학생의 총점을 출력하는 프로그램을 구현하시오.
		File file=new File("./src/java016_stream/prob/score.txt");
>>>>>>> branch 'master' of https://github.com/kimberlyydanij/javademo.git
		
	}//end main()

}//end class











