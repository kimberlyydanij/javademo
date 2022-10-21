package java016_stream;

import java.io.File;
import java.io.IOException;

public class Java173_stream {

	public static void main(String[] args) {
		File file = new File("java016_stream/text.txt");
		if(file.exists()) {
				file.delete(); // 파일  삭제
				System.out.println("파일 삭제");
		} else {
			System.out.println("파일 없음");
				
		}
	 } // end mail
} // end class
