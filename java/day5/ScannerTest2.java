package my.day5;

import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요  : "); // 커서가 다음줄로 가지 않게 하기위해 ln제거
		int i = Integer.parseInt(sc.nextLine()); //String Type을 integer로 변환
		System.out.println("입력한 정수 : "+i);
		
		System.out.print("문자열 단어를 입력하세요 : ");
		String str = sc.nextLine();
		System.out.println("입력한 단어 : "+str);
		
		System.out.print("문자열을 입력하세요 : ");
		String str2 = sc.nextLine();
		System.out.println("입력한 문자열 : "+str2);
		
		sc.close();
		
	}

}
