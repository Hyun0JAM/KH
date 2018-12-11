package io.day2;

import java.io.*;

public class FileReaderTest2 {
	public static String reading(String fileName) {
		try {
			FileReader fr = new FileReader(fileName);
			char[] charArr = new char[10];
			String returnData="";
			int charLength=0;
			do {
				charLength = fr.read(charArr);
				if(charLength!=-1) {
					String str = new String(charArr,2,5);
					returnData += str; 
				}
			} while (charLength !=-1);
			fr.close();
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
		//읽어들일 데이터는 파라미터로 주겠다.
		String str = FileReaderTest.reading(args[0]);
		System.out.println(str);
	}
}
