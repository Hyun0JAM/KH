/*
      === do ~ while() ===
      
           변수초기화;
      
      do{
                 반복해서 실행할 명령문;
                 증감식;
      } while(조건식);
      
      while 문의 경우 조건식이 true 일때만 반복 실행하지만,
      do ~ while 문의 경우는 조건식이 false 일지라도
          무조건 do{ } 속에 있는 명령문은 1번은 실행하고서 반복문을 벗어난다.
          
          그러므로 do ~ while 문은 무조건 do{ } 속에 있는 명령문을 실행하고서
      while(조건식) 속의 조건에 따라 참(true)이라면 계속 반복하고,
          조건이 거짓(false)이라면 중지한다.  
 */
package my.day7;

public class DoWhileTest {

	public static void main(String[] args) {
		
		int i=0;
		do { //거짓이더라도 한번 실행한 후 조건에 만족되는 동안 반복한다.
			System.out.println("최민주는 닭똥집을 먹습니다.");
		}while(i++<10);
		
		System.out.println("-------------------------------------------\n");
		//1~100 중 17의 배수
		//1~100중 17 배수의 합은
		int sum=0; 
		do {
			if(i%17==0) {
				String str = (i==17)?"":", ";
				System.out.print(str+i);
				sum+=i;
				}
			}while (i++<100);
		System.out.print("\n* 총 합 : "+sum);

		System.out.println("Quiz---------------------------------------\n");
		//아래위 출력 결과가 어떻게 나오는지 손으로 직접 적어보세요
		
		int m=1, n=10;
		do {
			if(m>n) break;
			n--; //9 8 7 6 5
		} while (++m<5); //2 3 4 5 6
		
		System.out.println("m : "+m+" n : "+n); //5 6
	
	}
}
