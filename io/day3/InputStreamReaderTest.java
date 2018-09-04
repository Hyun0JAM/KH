/*
 * 소스 : 입력노드 스트림 키보드(System.in) - 1byte기반
 * 	|브릿지 스트림 InputStreamReader - 1byte기반을 2byte기반으로 변경
 * 목적지 : 출력노드 스트림 FileWriter - 2byte기반
 * */

package io.day3;

import java.io.*;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		try {
			InputStreamReader istReader = new InputStreamReader(System.in);
			//키보드에서 입력하는것은 1byte기반인데 이것을 2byte기반으로 변경한다.
			
			String fileName = "C:/IOTestData/오늘의 날씨.txt";
			
			FileWriter writer = new FileWriter(fileName);
			
			int input =0;
			while((input =istReader.read())!=-1) {
				writer.write(input);
				writer.flush();
			}	
			System.out.println("종료합니다.!!");
			writer.close();
			istReader.close();
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
}
