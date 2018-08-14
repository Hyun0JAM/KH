package my.day7;

import java.util.Scanner;

public class Factorial {
	
	//재귀방법
	public int facCal(int n) {
		if(n>1) n*=facCal(n-1);
		return n;
	}
	public void facCal2(int n) {
		int cal=1;
		for(int i=1;i<n;i++) cal = cal*(i+1);
		System.out.println("* '"+n+"!'의 정답 : "+cal);
	}

	public static void main(String[] args) {
		//알고싶은 팩토리얼 수를 입력
		Scanner scan = new Scanner(System.in);
		Factorial ft = new Factorial();
		
		for(;;) {
			System.out.println("\n-- Factorial ------------------------------\n");
			System.out.print("* 팩토리얼 수 : ");
			try {
				int n = Integer.parseInt(scan.nextLine());
				//ft.facCal2(n);
				if(n<1) {
					System.out.println("\n************* 입력하는 값은 1이상의 정수 이어야 합니다.");
					continue;
				}
				System.out.println("* '"+n+"!'의 정답 : "+ft.facCal(n)+"\n");
			} catch (NumberFormatException e) {
				System.out.println("\n************************** 정수만 입력해주세요!!");
				continue;
			}
			System.out.println("-------------------------------------------\n");
			System.out.print("* 계속 하시겠습니까(Y:예, N:아니오)? ");
			String yn = scan.nextLine();
			
			if("n".equals(yn)||"N".equals(yn)) {
				System.out.println("\n*************************** 프로그램을 종료합니다.");
				break;
			}
		}
	}
}
