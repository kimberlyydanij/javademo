package java016_stream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Java166_stream {

	public static void main(String[] args) {
		File file = new File("sample.txt");
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.length());
		
		FileWriter fw = null;
		
		try {
			// mode의 값이 true 이면 append
			// mode의 값이 false이면 update
			// mode의 값을 생략하면 false 이다.
			
			fw = new FileWriter(file,false);
			fw.write("java\n"); // buffer에 저장
			fw.flush(); // 파일로 내보냄
			fw.write("jsp\n");
			fw.flush();
			fw.write(new char[] {'s','p','r','i','n','g'});
			fw.write("\n");
			fw.flush();
			fw.write(97); // 유니코드
			fw.flush();
			fw.write(new char[] {'s','p','r','i','n','g'},0,3);
			fw.write("\n");
			fw.flush();
			fw.close(); // 버퍼 내용을 타겟으로 보내고 버퍼내용을 지움,연결종료
			fw.write("mybatis");
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	} // end main();

} // end class
