/* [ 파일 복사하기 ]
 * C:\IOTestData\io.txt 파일을 읽어다가
 * C:\IOTestData\iocopy.txt 파일을 생성하시오.
 * 
 * byte[] 크기는 64byte로 사용해서.
 * */
package io.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Filecopy1 {
	public static void main(String[] args) throws IOException {
		String filename = "C:\\IOTestData\\io.txt"; // 파일명 입력 >> 데이터 소스 (C:\IOTestData\io.txt)
		String filename2 = "C:\\IOTestData\\iocopy.txt";
		boolean append = true;
		byte[] dataArr = new byte[64];
		int input = 0;
		try {
			FileInputStream filein = new FileInputStream(filename);
			FileOutputStream fileout = new FileOutputStream(filename2,append);
			while((input = filein.read(dataArr))!=-1) {
				//file.read(); 메소드는 해당 파일에서 1byte씩 읽어서 int 타입으로 리턴해준다.
				//만약에 파일의 내용물에서 더이상 읽어들일 데이터가 없다 라면 -1을 리턴시켜준다.
				fileout.write(dataArr,0,input);
				fileout.flush();
			}//end of while-------------------
			filein.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
