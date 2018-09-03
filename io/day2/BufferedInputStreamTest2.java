package io.day2;

import java.io.*;

public class BufferedInputStreamTest2 {

	public static void main(String[] args) {
		
		try {
			String srcFilename = "C:/iotestdata/Tulips.jpg";
			File srcFile = new File(srcFilename);
			long srcFileSize = srcFile.length(); // 원본파일의 크기 
			
			// 입력노드스트림 ==> 파일 FileInputStream
			FileInputStream fist = new FileInputStream(srcFile);
			
			// 입력노드스트림에 보조(필터)스트림(BufferedInputStream)을 장착한다.
			BufferedInputStream bist = new BufferedInputStream(fist, 4096); 
			// 노드스트림인 System.in(키보드)에 필터스트림(보조스트림)을 장착함.
			// 필터스트림(보조스트림)의 용량은 1024 byte 가 된다.
			
			
			String targetFilename = "C:/iotestdata2/튜울립2.jpg";
			File targetFile = new File(targetFilename);
			
			// 출력노드스트림 ==> 파일 FileOutStream
			FileOutputStream fost = new FileOutputStream(targetFile);
			
			// 출력노드스트림에 보조(필터)스트림(BufferedOutputStream)을 장착한다.
			BufferedOutputStream bost = new BufferedOutputStream(fost, 4096); 
			// 노드스트림인 fost(파일)에 필터스트림(보조스트림)을 장착함.
			// 필터스트림(보조스트림)의 용량은 1024 byte 가 된다.
			
			byte[] dataArr = new byte[512];
			
			int inputLength = 0;
			int totalByte = 0;
			
			int whileCount = 0;
			while( (inputLength = bist.read(dataArr) ) != -1 ) {
				
				bost.write(dataArr, 0, inputLength);
				bost.flush();
				
				totalByte += inputLength;
				
				int percent = (int) ((double)totalByte/srcFileSize*100);
				
				System.out.println(percent+"% 복사중....");
			}// end of while------------------------------
			
			System.out.println("------------------------------------------------------"); 
			System.out.println("whileCount : " + whileCount);
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
		
	}// end of main()-------------------------------------

}
