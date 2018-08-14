package my.day7;

import java.util.Scanner;

public class Gugudan {
	
	public void showDan(int n) {
		System.out.println("\n<< "+n+"단 >>\n");
		for(int i=2;i<10;i++) {
			System.out.print(" "+n+"*"+i+"="+(i*n)+"\n");
		}
	}

	public void showSum(int a, int b) {
		int sum=0;
		for(int i=a;i<=b;i++)
			sum += i;
		System.out.println("* 결과 : " +a+"부터 "+b+"까지의 합은 "+sum+"입니다.\n");
	}
	/*	public static int returnSum(int a, int b) {
		int sum=0;
		for(int i=a;i<=b;i++)
			sum += i;
		return sum;
	}*/

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Gugudan dan = new Gugudan();
		System.out.println("\n--------------------------- 구구단 ------------------------------\n");
		
		for(int i=1;i<10;i++) {
			for(int j=2;j<10;j++) {
				String str = (j==9)?"\n":"\t";
				System.out.print(i+"*"+j+"="+(i*j)+str);
			}
		}
		System.out.println("\n--------------------------------------------------------------\n");
		for(;;) {
			try {
				System.out.print("* 몇단 볼래? : ");
				int n = Integer.parseInt(scan.nextLine());
				//int a =scan.nextInt();
				dan.showDan(n);
				break;
			} catch (NumberFormatException e) {
				System.out.println("\n* 숫자(정수)만 입력해 주세요!!\n");
				//continue; _하던 안하던 똑같다 for문이 돌고있기 때문에
			}
		}//end of for--------------------------
		System.out.println("\n------------------------- 누적치 합구하기 -------------------------\n");
		System.out.print("* 시작 수  : "); 
		int start = Integer.parseInt(scan.nextLine());
		//int start = scan.nextInt();
		System.out.print("* 종료 수  : "); 
		int finish = Integer.parseInt(scan.nextLine());
		dan.showSum(start,finish);	
			
		scan.close();	
	} // end of main --------------------------
}
