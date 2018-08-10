package my.day5;

import java.util.Scanner;

public class IfTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int i = Integer.parseInt(sc.nextLine());
		
		IfTest1 obj = new IfTest1();
		obj.holjak(i);
		
		//입력하신 숫자 8은 짝수입니다.
		//입력하신 숫자 9는 홀수입니다.
		sc.close();
		
		}// end of main method <<체크하는 습관 들이기
	public void holjak(int n) {
		if(n%2==0) System.out.println("입력하신 숫자 "+n+"는 짝수입니다.");
		else System.out.println("입력하신 숫자 "+n+"는 홀수입니다.");
	}
}