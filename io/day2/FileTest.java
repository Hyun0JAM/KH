package io.day2;
/*
  >>>>File 클래스 <<<<
 자바에서 File 클래스의 객체라함은 2가지 파일 및 폴더(디렉토리)를  다 포함한다.
  
 */

import java.util.Scanner;
import java.io.*;

public class FileTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("탐색기에 존재하는 파일명을 입력하시오. ");
		String fileName= sc.nextLine();
		//C:\IOTestData\Tulips.jpg
		sc.close();
		
		File file1 = new File(fileName);
		System.out.println("파일 명 : "+file1.getName());//fileName 출력 :  파일 명을 알려줌.
		System.out.println("파일 크기 : "+file1.length());//file 사이즈
		System.out.println(" 파일의 절대경로 : "+file1.getAbsolutePath());
		System.out.println("=====================");
		System.out.println(">>>> 디렉토리 생성하기 <<<<");
		
		File dir = new File("Mydir");
		
		
		String result = dir.exists()?"존재함":"존재하지 않음";
		
		System.out.println("");
		System.out.println(dir.getName()+"은 "+result);
		
		boolean bool = false;
		
		if(!dir.exists()) { //해당 디렉토리가 없으면 만드세요
			bool = dir.mkdir();
			result = bool?"디렉토리 생성 성공!!":"디렉토리 생성 실패";
			System.out.println("Mydir"+result);
		}
		if(dir.exists()) { // 해당 디렉토리가 있으면
			System.out.println("Mydir 디렉토리의 상대경로 : "+dir.getPath());
			System.out.println("Mydir 디렉토리의 절대경로 : "+dir.getAbsolutePath());
		}
		
		File dir2 = new File("testdir");
		
		if(dir2.exists()) {
			bool = dir2.delete();
			result = bool?"디렉토리 삭제 성공!!":"디렉토리 삭제 실패";
			System.out.println("testdir"+result);
		}
		sc.close();
		
	}

}
