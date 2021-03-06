package io.day1;

import java.io.*;
import java.util.Scanner;

public class FileCopy4 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("복사할 원본파일명(절대경로) 입력 => "); 
		String srcFilename = sc.nextLine();
		
		System.out.print("목적 파일명(절대경로) 입력 => "); 
		String targetFilename = sc.nextLine();
		
		System.out.println("소스파일 : " + srcFilename);
		System.out.println("목적파일 : " + targetFilename);
		
		try {

			// 소스 File 객체 생성하기
			// String 타입인 srcFilename(파일경로명)이 실제 File 클래스의 객체로 되어진다. 
			File srcFile = new File(srcFilename);
			
		    long srcFileSize = srcFile.length(); // 파일의 크기를 알려준다.
			
		    System.out.println(">> 원본 파일 크기 : " + srcFileSize + "bytes" );   
		    
			// FileInputStream 생성 : 접속점이 파일인 것으로 특정 파일에 빨대를 꽂아 파일의 내용물을 1byte 기반으로 빨아들이는 입력노드 스트림이다.  
			FileInputStream fist = new FileInputStream(srcFile);  
			
			// FileOutputStream 생성 : 접속점이 파일인 것으로 특정 파일에 빨대를 꽂아 파일의 내용물을 1byte 기반으로 기록해주는(써주는) 출력노드 스트림이다.   
			File targetFile = new File(targetFilename);
			FileOutputStream fost = new FileOutputStream(targetFile);
		//  FileOutputStream fost = new FileOutputStream(targetFile); 은
		//  FileOutputStream fost = new FileOutputStream(targetFile, false); 와 같다.	
			
			byte[] dataArr = new byte[128];
			int inputLength = 0;
			int totalByte = 0;
			
			while( (inputLength = fist.read(dataArr)) != -1 ) {
				
				fost.write(dataArr, 0, inputLength); // 파일에 쓰기 
				fost.flush();
				
				totalByte += inputLength;
				
				double percent = ((double)totalByte/srcFileSize)*100;
				
				System.out.println("\n"+(int)percent+"% 복사중....");
			} // end of while---------
			
			System.out.println("\n복사완료!! 총 " + totalByte + "byte 복사됨.");    
			
			fost.close();
			fist.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("파일의 경로가 올바르지 않습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		sc.close();
	}// end of main()----------------------------	

}
