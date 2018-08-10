package my.day5;

import java.io.IOException;
import java.util.Scanner;

public class IfTest2 {
	
	public void showInfo(int n) {
		
		char ch = (char) n; // 알파벳의 번호를 기억안해도 되도록 변형
		
		if('A'<= ch && ch<='Z') { //영문 대문자라면 65~
			System.out.println("입력하신 글자는 영문"+(char)n+"는 대문자입니다.");
		}
		else if('0'<=ch && ch<='9') //숫자
			System.out.println("입력하신 글자는 영문"+(char)n+"는 숫자 입니다.");
		else if ('a'<=ch && ch<= 'z')
			System.out.println("입력하신 글자는 영문"+(char)n+"는 소문자 입니다.");
		else
			System.out.println("입력하신 글자는 나머지 입니다.");
		
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		System.out.print("글자 한개를 입력하세요 : ");
		int n =System.in.read(); //system.in은 키보드 / System.in.read()은 키보드로 입력받은 글자중 첫번째 글자 한개만 읽어 들이는 것이다. 	
								 //return Type = int
		
		IfTest2 obj = new IfTest2();
		obj.showInfo(n);		

		sc.close();

	}

}
