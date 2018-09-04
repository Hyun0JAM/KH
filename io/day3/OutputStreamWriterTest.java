package io.day3;

import java.io.*;

public class OutputStreamWriterTest {

	public static void main(String[] args) throws IOException {
		String fileName = "C:/IOTestData/오늘의 날씨.txt";
		FileReader reader = new FileReader(fileName);
		int data=0;
		String returnData = "";
		do {
			data=reader.read();
			if(data!=-1) {
				returnData += (char)data;
			}
		} while (data!=-1);
		System.out.println(returnData);
		reader.close();
	}
}
