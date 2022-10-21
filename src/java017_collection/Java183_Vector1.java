package java017_collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Vector;

import sun.security.action.GetBooleanAction;

/*
 * [프로그램 출력결과]
 * kim  56 78  12 146
 * hong 46 100 97 243
 * part 95 56  88 240
 */
 
public class Java183_Vector1 {

	public static void main(String[] args){
		String path = "java017_collection/score.txt";
		Vector<Sawon> vt = lines(path);
		prnDisplay(vt);
		
	} // end main()

	private static Vector<Sawon> lines(String fileName) {
		// strName 매개변수의 값을 이용해서 Vector에 데이터를 저장한 후
		// 리턴하는 프로그램을 구현하시오
		File file = new File(fileName,"r");
		FileReader fr = null;
		LineNumberReader nr = null;
		Vector<Sawon> vt = new Vector<>();
		Sawon[] sw = new Sawon[4];
		
		
		try {
			fr=new FileReader(fileName);
			nr=new LineNumberReader(fr);
			String line = null;
			
			while((line=nr.readLine()) !=null) {
			System.out.printf("%d : %s",nr.getLineNumber(),line);
			
			//vt.add(new Sawon(line.get())); 
			System.out.println(vt);
			}
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
			finally {
			}
		
		
		return null;
	} // end lines
	
	private static void prnDisplay(Vector<Sawon> vt) {
	  //vt에 저장된 객체들을 출력결과와 같이 프로그램을 구현하시오.
		
	} // end prnDisplay
} // end Class

