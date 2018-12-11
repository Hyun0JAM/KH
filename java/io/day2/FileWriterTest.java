package io.day2;

import java.io.*;

public class FileWriterTest {

	public static void fileCopy(String srcFileName,String targetFile) {
		try {
			FileReader fr = new FileReader(srcFileName);
			FileWriter fw = new FileWriter(targetFile);
			char[] charArr = new char[10];
			int charLength=0;
			do {
				charLength = fr.read(charArr);
				if(charLength!=-1) {
					fw.write(charArr,0,charLength);
					fw.flush();
				}
			} while (charLength !=-1);
			fr.close();
			fw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		//읽어들일 데이터는 파라미터로 주겠다.
		try {	
			FileWriterTest.fileCopy(args[0], args[1]);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
