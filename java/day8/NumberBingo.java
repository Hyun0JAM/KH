package my.day8;

import java.util.Scanner;
import my.util.MyUtil;

public class NumberBingo {
	int cnt=0;
	
	public void bingo(int random, int userNum) {
		String str ="";
		
		if(userNum>random) {
			str = "> "+userNum+"보다 작습니다.";
			cnt++;}
		else if(userNum<random) {
			str = "> "+userNum+"보다 큽니다.";
			cnt++;}
		else if(userNum==random) {
			str = ">> "+userNum+"정답입니다."+cnt+"번 만에 맞추셨습니다";}
		System.out.println(str);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		NumberBingo bin = new NumberBingo();
		
		// 컴퓨터가 1부터 100까지의 숫자중 랜덤한 숫자를 가지도록한다.
		int random = MyUtil.random(1, 100);
		int userNum = 0;
		
		do {
			try {
				System.out.print("* 1부터 100사이의 정수를 입력하세요 : ");
				userNum =Integer.parseInt(scan.nextLine());
				if(userNum<1||userNum>100) {
					System.out.println("* 경고 : 1과 100사이의 정수만 가능합니다.");
					//continue;
				}
				bin.bingo(random, userNum);
				String s = "";
				while(true) {
					if(userNum==random) {
						System.out.print("* 게임을 더 하시겠습니까?(Y:네  NO:아니오) ");
						s = scan.nextLine();
						if("N".equals(s)||"n".equals(s)||"Y".equals(s)||"y".equals(s)) {
							if("Y".equals(s)||"y".equals(s)) {
								bin.cnt=0;
								random = MyUtil.random(1, 100);
								System.out.println("-------------------------------------");
								break;
								}
							else if("N".equals(s)||"n".equals(s)) {
								System.out.println("***** 프로그램 종료!!");
								break;
								}
							break;
							}
						else {
							System.out.println("* Y또는 N로 입력해주세요!!");
							continue;
							}
						}
					else break;
				} // end of while ----------------------
				if("N".equals(s)||"n".equals(s))
					break;
			} catch (NumberFormatException e) {
				System.out.println("* 정수만입력하세요.");
				//continue;
			}
		} while (true); // end of while ----------------------
	}
}
