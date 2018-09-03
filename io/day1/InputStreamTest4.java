package io.day1;

import java.io.IOException;

public class InputStreamTest4 {

	public static void main(String[] args) 
		throws IOException {
		
		byte[] dataArr = new byte[10];
		
		int inputLength = 0;
		int totalByte = 0;  // byte 수 누적용도
		
		while( (inputLength = System.in.read(dataArr)) != -1 ) {
			// 키보드로 Ctrl+C(강제종료)를 누르지 않으면 계속실행해라
			
			/*
			   System.in.read(dataArr)은 
			    입력한 데이터가 "대한민국서울시동대문구"+"엔터" 이라면
			    입력한 내용에서 배열 dataArr의 크기만큼(지금은  10byte)
			    읽어들인다(지금은 "대한민국서"). 읽어들인 "대한민국서"을 
			   배열 dataArr 에 저장시키고, 읽어들인 크기를(지금은 10)
			   리턴시켜준다. 
			  반복문의 첫번째일때
			   dataArr 에는  "대한민국서" 이 들어가고,
			   inputLength 에는 10 이 들어간다.
			 반복문의 두번째일때
			   dataArr 에는  "울시동대문" 이 들어가고,
			   inputLength 에는 10 이 들어간다.
			   
			 반복문의 세번째일때
			   dataArr 에는  "구엔터" 이 들어가고,
			   inputLength 에는 4 이 들어간다.    
			*/
			
			System.out.write(dataArr, 0, inputLength);
			// 배열 dataArr 에 저장된 데이터에서 시작점이 0번째 index 부터(처음부터) 
			// inputLength byte 수 만큼 출력해라는 말이다.
			System.out.flush();
			
			totalByte += inputLength; // 10 + 10 + 4 
			
		}// end of while-----------------------
		
		System.out.println("총 : " + (totalByte-2) + " bytes 입력함");  
		
		System.in.close();  // 입력노드(키보드)연결 닫기
		System.out.close(); // 출력노드(모니터)연결 닫기 

	}// end of main()----------------------

}
