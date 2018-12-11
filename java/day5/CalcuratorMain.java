package my.day5;

import java.util.Scanner;

public class CalcuratorMain {

	public static void main(String[] args) {
		try {
			Calcurator cal = new Calcurator();
			Scanner scan = new Scanner(System.in);
			
			System.out.print("************************************\n");
			System.out.print("* 첫번째 수 : ");
			String str1 = scan.nextLine();
			double a = Double.parseDouble(str1);
			
			System.out.print("* 두번째 수 : ");
			String str2 = scan.nextLine();
			double b = Double.parseDouble(str2);
			
			System.out.print("* 연산자(+, -, *, /) : ");
			String op = scan.nextLine();
			
			if(!("+".equals(op)||"-".equals(op)||"*".equals(op)||"/".equals(op))) {
					System.out.println("* 연산자 입력 오류!!\n************************************"); 
					return; // system.exit(0); _ 시스템 종료
			}
			String result = cal.calc(a, b, op);
				
			System.out.println("* 연산결과 : "+str1+" "+op+" "+str2+" = "+result+"\n************************************");
			
			scan.close();
			
		}catch(NumberFormatException e){
			System.out.println("* 숫자로만 입력하세요!!\n************************************");
			//System.out.println("* "+e.getMessage()); 
			//e.printStackTrace(); //어디가 잘못되었는지 출력해준다.	
		}
	}
}
