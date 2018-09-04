package io.day1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) throws IOException {
		System.out.println("내용을 입력하세요[입력하신 내용은 C:\\IOTestdata\\result.txt파일에 저장됩니다.]");
		String filename = "C:\\IOTestData\\result.txt";
		boolean append = true;
		int input = 0;
		int totalbyte=0;
		FileOutputStream fost = new FileOutputStream(filename,append);
		/*
	       만약에  탐색기에서 
	    C:/iotestdata/result.txt 파일이 없다라면
	       파일을 자동으로 생성해준다.
	       단, 탐색기에서 C:/iotestdata 폴더는 존재해야 한다.
	    
	       두번째 파라미터인 append 가 true 인 경우는
	       첫번째 파라미터인 해당파일에 이미 내용물이 적혀 있는 경우일때
	       기존내용물은 그대로 두고 기존내용뒤에 새로운 내용을 덧붙여
	       추가하겠다는 말이다. 
	       
	       두번째 파라미터인 append 가 false 인 경우는
	       첫번째 파라미터인 해당파일에 이미 내용물이 적혀 있는 경우일때
	       기존내용물은 싹 지우고 새로운 내용을 새롭게 처음부터 쓰겠다는 말이다.
	     
	       그런데 만약에 두번째 파라미터를 생략하면    
	       즉, FileOutputStream fost = new FileOutputStream(filename); 이라면
	       자동적으로 false 로 인식한다.   
	 */
		while((input = System.in.read())!=-1) {
			fost.write(input);
			fost.flush();
			totalbyte++;
		}
		System.out.println("* totalbyte : "+totalbyte);
		System.in.close();
	}

}
