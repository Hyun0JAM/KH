package my.quiz.day7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class WaterTax {
	//메뉴를 보여주는 클래스
	public static void menu() {
		System.out.println("========================================\n----------------------------------- MENU");
		System.out.println("1. 가정용(1L 50won)");
		System.out.println("2. 상업용(1L 50won)");
		System.out.println("3. 공업용(1L 50won)");
		System.out.println("4. 종료(Exit)");
		System.out.println("----------------------------------------");
		System.out.print("* 메뉴를 선택하세요 :  ");
	}
	
	public static void main(String[] args) {
		WaterTax wt = new WaterTax();
		Scanner scan = new Scanner(System.in);
		
		//프로그램종료(4번)이 입력될때 까지 메뉴를 계속실행하는 루프
		while(true) {
			wt.menu();
			String mno = scan.nextLine();
			//메뉴선택
			switch(mno) {
			case "1": break;
			case "2": break;
			case "3": break;
			case "4": break;
			default: 
				System.out.println("* 잘못 입력하셨습니다. 1~4사이의 숫자를 입력해 주세요."); 
				continue;
			}
			//2중루프를 벗어나기위한 break
			if("4".equals(mno)) break;
			
			int result=0;
			String type ="";
			
			//요금 계산과 양의 정수로 입력받기위한 예외처리
			while(true) {
				try {
					System.out.print("* 물 사용량 : ");
					int useLiter = Integer.parseInt(scan.nextLine()); //parseInt를 쓰는이유는 nextInt로 받아올시 문자입력에 취약하고 
																	  //parseInt는 예외처리를 해줄시 안정성이높아진다
					if(useLiter<=0) {
						System.out.println("* 물 사용량(L)은 0보다 큰 양의 정수로 입력해주십시오.\n----------------------------------------");
						continue;
					}
					else if("1".equals(mno)) {
						result = useLiter*50; 
						type ="가정용";
						break;
					}
					else if("2".equals(mno)) {
						result = useLiter*45; 
						type ="상업용";
						break;
					}
					else if("3".equals(mno)) {
						result = useLiter*30; 
						type ="공업용";
						break;
					}
				} catch (NumberFormatException e) {
					System.out.println("* 물 사용량(L)은 숫자로 입력해주십시오.\n----------------------------------------");
				}
			}
			DecimalFormat df = new DecimalFormat(); //숫자로 되어진 데이터를 세자리마다','를 찍어주는 객체이다.
			System.out.println("----------------------------------------\n* 수도요금("+type+") : "+df.format(result)+"원");
		}// ----------end of loop
		
		System.out.println("*********************** 프로그램을 종료합니다.\n========================================");
		scan.close();
		
	}

}
