/*
      **** 반복문(loop) ==> for 문 ****
      
              ※ for 문의 형식
       
        for(초기화; 조건식; 증감식) {
           	반복해서 실행할 문장;
        }  
        
                   ▣ 순서
        1) 초기화;
        2) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.         
                                  조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
                   } 을 빠져나간다.)
        3) 증감식
        4) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.         
                                  조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
                   } 을 빠져나간다.) 
        5) 증감식
        6) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.         
                                  조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
                   } 을 빠져나간다.)                                                  
        
 */

package my.day6;

import java.util.Scanner;

public class ForTest {
	
	public void loopName(int n, String name) {
		for(int i =0; i<n; i++) {
			System.out.println((i+1)+". "+name);
		}
	}

	public static void main(String[] args) {
		
		System.out.println("----------------");
		
		ForTest ft = new ForTest();
		ft.loopName(5, "설현");
				
		//for(i=0; j=1; i<5; i++ j+=2){} 초기치 여러개 조건식 한개 증감 여러개 가능
		
		System.out.println("----------------");
		
		for(int x=0; x<10; x+=2) {
			System.out.println(x+". --");
		}
		
		System.out.println("----------------");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String str = scan.nextLine(); //자바 개발자
		int i =0;
		try {
			System.out.print("반복 할 횟수 : ");
			int n = Integer.parseInt(scan.nextLine());
			
			for(; i<n; i++) { //초기치를 반드시 쓸필요 없다.
				System.out.println(str);}
		} catch (NumberFormatException e) {
			System.out.println("반복횟수는 숫자만 입력가능합니다. \n 프로그램 종료");
			//System.exit(0); 정상종료 , 1은 비정상종료.
			return;
		}	
		System.out.println("*반복을 마친 i값 : "+i);
		
		System.out.println("----------------");
		
		for(;i>0;i--) {
			System.out.println(i+"."+str);
		}
		
	}

}
