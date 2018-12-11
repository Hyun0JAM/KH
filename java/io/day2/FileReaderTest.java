package io.day2;

import java.io.*;

public class FileReaderTest {

	public static String reading(String fileName) {
		try {
			FileReader fr = new FileReader(fileName);
			int data=0;
			String returnData = "";
			do {
				data=fr.read();
				if(data!=-1) {
					returnData += (char)data;
				}
			} while (data!=-1);
				fr.close(); //빨대 제거
			return returnData;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return fileName+"이라는 파일은 없습니다.";
		} catch (IOException e) {
			e.printStackTrace();
			return fileName+"이라는 파일은 손상되었습니다..";
		}
	}
	public static void main(String[] args) {
		String str = FileReaderTest.reading(args[0]);
		System.out.println(str);
		
	}
}
/*
 * 실행하기 (명령프롬프트에서)
 * c:\myjava\IOTest\bin>java io.day2.FileReaderTest2 c:\myjava\...
 */