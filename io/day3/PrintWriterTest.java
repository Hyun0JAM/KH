package io.day3;

import java.io.*;

public class PrintWriterTest {

	public static void main(String[] args) {
		try {
			String srcFile = "C:/IOTestData/myprofile.txt";//소스파일이름
			FileReader fReader = new FileReader(srcFile); //2byte기반의 입력노드 스트림 생성(빨대꽂기)
			BufferedReader preader = new BufferedReader(fReader,1024); //필터스트림을 입력 노드스트림에 장착하기
			
			String targetFile = "C:/IOTestData/myprofile복사.txt"; //타겟파일이름
			FileWriter fWriter = new FileWriter(targetFile); //2byte기반의 출력 노드스트림 생성
			PrintWriter pwriter = new PrintWriter(fWriter,true); //필터스트림(보조스트림,오리발)을 입력노드스트림에 장착하기
			// new PrintWriter(fWriter,true); true는 개행문자를 만날때마다 자동으로 flush()메소드가 작동한다는말이다.

			String strLine="";
			while((strLine = preader.readLine())!=null) {
				//bufReader.readLine() 메소드는 1줄단위로 읽어와서 읽어온 내용을 String타입으로 반환해준다.
				//1줄을 읽어오되 엔터전까지 읽어온다.
				pwriter.println(strLine); 
			}
			System.out.println(">> 파일복사완료!! <<");
			pwriter.close();
			preader.close();
			fWriter.close();
			fReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
