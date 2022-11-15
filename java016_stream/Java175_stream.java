package java016_stream;

import java.io.File;

public class Java175_stream {

	public static void main(String[] args) {
		File file = new File("java016_stream/a");
		deleteFileLisT(file);
	} // end main

	public static void deleteFileLisT(File srcFile) {
		File[] fileAll = srcFile.listFiles();
		
		if(fileAll != null) {
			System.out.println(fileAll.length);
			for(File file : fileAll) {
				System.out.println(file);
				deleteFileLisT(file);
			} // end for
		} // end if
		System.out.println("Remove File : "+srcFile.getPath());
		srcFile.delete();
	} // end deleteFileList
} // end class
