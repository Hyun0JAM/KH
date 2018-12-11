package my.day5;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력학세요 : "); //Enter전까지만 읽어온다.
		int n = sc.nextInt();
		System.out.println("입력한 정수 : "+n);
		
		System.out.println("단어를 입력하세요 : ");
		String s = sc.next(); // 단어 - 공백(space)전 까지만 읽어온다
		System.out.println("입력한 문자열 : "+s);
		
		System.out.println("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		System.out.println("입력한 문자열 : "+str);
		
		sc.close(); // 더이상 입력할것이 없다면 스캐너를 닫아줘여한다.
	}
}
