package io.day2;

import java.io.*;
import java.util.Scanner;

public class BufferedInputStreamTest3 {

	public static void main(String[] args) {
		
		// 원본파일크기 620,888 byte
		// ################################################## 
		// ##################################################
		// ################################################## 
		// ##################################################
		// ################################################## 
		// ##################################################
		// ################################################## 
		// ##################################################
		// ################################################## 
		// ##################################################
		// ################################################## 
		// ##################################################
		// ######
        // # 1개를 1024 byte 로 본다. 
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("복사할 원본파일명(절대경로) 입력 => "); 
			String srcFilename = sc.nextLine();
			
			System.out.print("목적 파일명(절대경로) 입력 => "); 
			String targetFilename = sc.nextLine();
			
			File srcFile = new File(srcFilename);
		//	long srcFileSize = srcFile.length(); // 원본파일의 크기 
			
			// 입력노드스트림 ==> 파일 FileInputStream
			FileInputStream fist = new FileInputStream(srcFile);
			
			// 입력노드스트림에 보조(필터)스트림(BufferedInputStream)을 장착한다.
			BufferedInputStream bist = new BufferedInputStream(fist, 10240); 
			// 노드스트림인 System.in(키보드)에 필터스트림(보조스트림)을 장착함.
			// 필터스트림(보조스트림)의 용량은 10240 byte 가 된다.
			
			File targetFile = new File(targetFilename);
			
			// 출력노드스트림 ==> 파일 FileOutStream
			FileOutputStream fost = new FileOutputStream(targetFile);
			
			// 출력노드스트림에 보조(필터)스트림(BufferedOutputStream)을 장착한다.
			BufferedOutputStream bost = new BufferedOutputStream(fost, 10240); 
			// 노드스트림인 fost(파일)에 필터스트림(보조스트림)을 장착함.
			// 필터스트림(보조스트림)의 용량은 10240 byte 가 된다.
			
			byte[] dataArr = new byte[1024];
			
			int inputLength = 0;
			int totalByte = 0;
			
			int sharpCount = 0;
			while( (inputLength = bist.read(dataArr) ) != -1 ) {
				
				bost.write(dataArr, 0, inputLength);
				bost.flush();
				
				totalByte += inputLength;
				
				if(inputLength == 1024) {
					System.out.print("#");
					sharpCount++; 
				}
				
				if(sharpCount%50 == 0)
					System.out.print("\n");
			}// end of while------------------------------
			
			System.out.println("\n------------------------------------------------------"); 
			System.out.println("총 " + totalByte + "bytes 읽고 " + targetFilename + " 파일에 씀"); 
			System.out.println("------------------------------------------------------");
			
			bost.close();
			fost.close();
						
			bist.close();
			fist.close();
		
		} catch(FileNotFoundException e) {
			System.out.println(">> 파일의 경로명이 올바르지 않습니다.");
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		sc.close();
	}// end of main()----------------------------

}
