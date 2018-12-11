package my.day7;

import java.util.Scanner;

import my.util.MyUtil;

public class GuyBuyBo {

	public static void menu() {
		System.out.println("========================================\n[ 가위 바위 보 Game ]\n");
		System.out.println("* 1.가위 \t 2.바위 \t 3.보 \t 4.종료");
		System.out.println("----------------------------------------");
		System.out.print("* 선택하세요 :  ");
	}
	
	public static void play(String a,String b) {
		System.out.println("----------------------------------------");
		if(a.equals(b)) System.out.println("* You Draw");
		else {
			if("1".equals(a) && "2".equals(b)||"2".equals(a) && "3".equals(b)||"3".equals(a) && "1".equals(b)) 
				System.out.println("* You lose");
			else System.out.println("* You Win");
		}
		String me= "";
		String you= "";
		if("1".equals(a)) me ="가위";
		else if("2".equals(a)) me ="바위";
		else if("3".equals(a)) me ="보";
		
		if("1".equals(b)) you = "가위";
		else if("2".equals(b)) you = "바위";
		else if("3".equals(b)) you = "보";
		
		System.out.println("* ME : "+me+"\t* COMPUTER : "+you);
	}
	public static void main(String[] args) {
		
		GuyBuyBo gbb = new GuyBuyBo();
		Scanner scan = new Scanner(System.in);
		String num;
		do {
			gbb.menu();
			num = scan.nextLine();
			
			switch(num) {
			case "1": 
			case "2":
			case "3": 
				int player = MyUtil.random(1, 3);
				gbb.play(num, Integer.toString(player));
			case "4": break;
				default: 
					System.out.println("----------------------------------------");
					System.out.println("* 1~4 중 하나의 숫자로 다시 입력해 주세요.");
					continue;
			}
		} while (!"4".equals(num));
		
		System.out.print("* 프로그램 종료 >> ");
		MyUtil.currentTime();
		System.out.println("========================================");
		scan.close();
	}

}
