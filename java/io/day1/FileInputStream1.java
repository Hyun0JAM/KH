/*
      === c:\iotestdata\korea.txt 파일을 읽어서
                  그 내용을 모니터(콘솔화면)에 출력하는 예제 ===
                  
      1. 데이터소스 : 파일로 부터 읽어들임(노드스트림: FileInputStream) 
      2. 데이터목적지 : 결과물을 모니터에 출력(노드스트림: System.out)
      
      >>>> FileInputStream
         - Node 스트림(접속점이 파일인 입력스트림)
         - 1byte 기반 스트림.
        
      >>>>> System.out :
                    부모클래스가 추상클래스 OutputStream(기본 출력 스트림) 타입인 것으로서
                    접속점(빨대)이 콘솔화면(모니터)인 출력 스트림(PrintStream)이다.
                    
       -- Node(접속점)가 콘솔화면(모니터)인 출력스트림이다.
       -- 1byte 기반 스트림이다.
       -- 주요 메소드 : println(String str),
                     print(String str),
                     write(int b)                  
 */
package io.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileInputStream1 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.print("읽을 파일의 이름(절대경로)을 입력 : ");
		String filename = scan.nextLine(); // 파일명 입력 >> 데이터 소스 (C:\IOTestData\io.txt)
		int input = 0;
		int totalbyte =0 ;
		try {
			FileInputStream file = new FileInputStream(filename);
			while((input = file.read())!=-1) {
				//file.read(); 메소드는 해당 파일에서 1byte씩 읽어서 int 타입으로 리턴해준다.
				//만약에 파일의 내용물에서 더이상 읽어들일 데이터가 없다 라면 -1을 리턴시켜준다.
				System.out.write(input);
				System.out.flush();
				totalbyte++;
			}//end of while-------------------
			System.out.println("\n읽어들인 바이트 수 : "+totalbyte);
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
	}
}
