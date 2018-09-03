package io.day2;

import java.io.*;

public class FileWriterTest {

	public static void fileCopy(String srcFileName, String targetFileName) 
		    throws FileNotFoundException, IOException {
			
		// 해당 소스파일에 노드 연결 생성(빨대꽂기)
		FileReader fr = new FileReader(srcFileName);
		
		// 해당 타겟파일에 노드 연결 생성(빨대꽂기)
		FileWriter fw = new FileWriter(targetFileName);  
		
		char[] charArr = new char[10];
		int charLength = 0;
			
		do {
			charLength = fr.read(charArr); 
			// 파일로 부터 글자(char)10개씩 읽어들임.
			// 읽어들인 글자수(길이)는 dataLength 에 저장시킨후
			// 읽어들인 글자는 char[] 타입의 배열인 dataArr 에 저장시킨다.
			// 그런데 파일이 손상되었을시 IOException 이 발생된다.  
		    if(charLength != -1) {
		    	fw.write(charArr, 0, charLength);
		        fw.flush();
		    }
		} while(charLength != -1); // end of while---------------
		
		System.out.println(">>> 파일복사 완료!! <<<");
		
		fr.close(); // 빨대제거
		fw.close(); // 빨대제거
	}
		
		
	public static void main(String[] args) {
		// 읽어들일 파일명은 명령줄 인자(파라미터)로 주겠다.
		
		try {
			FileWriterTest.fileCopy(args[0], args[1]); 
			// args[0] 에 c:/myjava/sample.txt 로 할 것이다.
			// args[1] 에 c:/myjava/sampleCopy.txt 로 할 것이다.
			
		} catch (FileNotFoundException e) {
			System.out.println(args[0] + " 이라는 파일은 없습니다.!!"); 
		} catch (IOException e) {
			System.out.println(args[0] + " 파일이 손상되었습니다.!!");
		}
		
	}// end of main()-----------------------------	

}
