package my.day5;

import java.io.IOException;

public class SwithCaseTest1 {

	public static void main(String[] args) throws IOException {
		System.out.print("글자 한게를 입력하세요 : "); 
		int n = System.in.read();
		
		switch(n){
		case 65:
		case 66:
		case 67: //이어서 써도된다 ...
			System.out.println("대문자");
			break;
		case 97 :
			System.out.println("소문자");
			break;
		default :
			System.out.println("no");
			break;
		}

	}

}
