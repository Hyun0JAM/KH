package my.day6;

public class BreakContinueTest {

	public static void main(String[] args) {
		System.out.println("\n====== 1 =====\n");
		
		for(int i=0;i<4; i++) {
			if(i==2) break; //가장 가까운 반복문을 벗어난다.
			System.out.println("i : "+i);
		}
		
		System.out.println("\n====== 2 =====\n");
		/*
		 *  1 2 3
		 *  4 5 6
		 */
		int n=0;
		for(int i=0;i<10;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(++n+" ");
				/*String str = (++n%3==0)?"\n":" ";
				System.out.println(+str);*/
			}
			System.out.print("\n");
			if(i==1) break;
		}
		System.out.println("--------------");
		System.out.println("");
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<5;j++) {
				if(j==3) break;
				System.out.print("["+i+", "+j+"] ");
			}// break되는 구간
			System.out.println("\n");
		}
		
		/*레이블명은 outer라고 하겠다.
		 * 레이블명 뒤에 ':'을 붙이면 반드시 반복문앞에 써야한다.*/
		outer : //레이블명
		for(int i=0;i<10;i++) {
			for(int j=0;j<5;j++) {
				if(j==3) break outer; //break 레이블명; 을 하면 가장 가까운 레이블 명이 붙은 반복문을 벗어난다.
				System.out.print("["+i+", "+j+"] ");
			}// break되는 구간
			System.out.println("\n");
		}
		
		System.out.println("\n\n====== 3 =====\n");
		
		for(int i=0;i<10;i++) {
			String str = (i<9)?", ":"\n\n";
			System.out.print((i+1)+str);
		}
		
		for(int i=0;i<10;i++) {
			if((i+1)%2==0) continue; //continue는 아래의 명령줄을 실행하지말고 for문의 증감식으로 다시 올라가라는 말이다.
			String str = (i<8)?", ":"\n\n";
			System.out.print((i+1)+str);
		}
		for(int i=0;i<10;i++) {
			if((i+1)%2!=0) continue; //continue는 아래의 명령줄을 실행하지말고 for문의 증감식으로 다시 올라가라는 말이다.
			String str = (i<8)?", ":"\n\n";
			System.out.print((i+1)+str);
		}
		
		System.out.println("\n\n====== 3 =====\n");
		int sum=0;
		for(int i=1;i<=10;i++) sum+=i;
		System.out.println("\n* 1부터 10까지 누적의 합은? "+sum);
		
		sum=0;
		for(int i=1;i<=10;i+=2)	sum+=i;
		System.out.println("\n* 1부터 10까지 홀수의 누적의 합은? "+sum);
		
		/* Continue 방법 
		sum=0;
		 for(int i=0;i<10;i++) {
			if((i+1)%2==0) continue;
			sum+=(i+1);}
		System.out.println("\n* 1부터 10까지 홀수의 누적의 합은? "+sum);
		*/
		
		sum=0;
		for(int i=2;i<=10;i+=2) sum+=i;
		System.out.println("\n* 1부터 10까지 짝수의 누적의 합은? "+sum);
		
		/* IF문 방법
		sum=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) sum+=i;}
		System.out.println("\n* 1부터 10까지 짝수의 누적의 합은? "+sum);
		*/
		
		System.out.println("--------------");
		
		sum=0;
		for(int i=1;i<=10;i++) {
			if(i==5||i==7) continue;
			sum+=i;}
		System.out.println("\n* 5, 7을 제외한 1부터 10까지 누적의 합은? "+sum);
		
		//1부터 100까지 중 3의 배수의 합은 얼마인가, 1부터 100까지 중 9의 배수의 합
		int sum3=0;int sum5=0;
		for(int i=1;i<=100;i++)
			if(i%3==0) sum3+=i;
			else if(i%5==0) sum5+=i;
		System.out.println("\n* 3의 배수의 합은 ? "+sum3+"\n\n* 5의배수의 합은? "+sum5);
		
		//continue문
		sum3=0; sum5=0;
		for(int i=0;i<100;i++)
			if(i%3==0) {
				sum3+=i;
				continue; }
			else if(i%5==0) {
				sum5+=i;
				continue; }
		System.out.println("\n* 3의 배수의 합은 ? "+sum3+"\n\n* 5의배수의 합은? "+sum5);
		
	}

}
