package java016_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Java170_stream {

	public static void main(String[] args) throws IOException {

		File file = new File("java016_stream/song.txt");
		RandomAccessFile raf = null;
		
		String stn = new String("Maroon 5 - Daylight, Sunday Morning\r\n");
		
		
		try {
			raf = new RandomAccessFile(file, "rw");
			System.out.println(raf.getFilePointer());//
			
			//song.txt 파일의 총 길이를 리턴한다.
			long size = raf.length();
			raf.seek(size); // 커서를 파일의 끝으로 이동함.
			//파일 대상에 데이터를 보낸다.
			raf.writeBytes(stn);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} finally {
			try {
				raf.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} }
				
	} // end main

} // end class
