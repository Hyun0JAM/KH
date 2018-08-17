/*
 * int ball : 1~45
 * ---------------------------------------------------------
 * |0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|.....|43|44|45|
 * ---------------------------------------------------------
 */

package my.day9;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	public static void sort(int[] arr) {
		int temp=0;
		for(int i=0;i<arr.length-1;i++) { // 추출 대상갯수 배열길이 -1
			for(int j=i+1;j<arr.length;j++) { //비교대상 갯수 배열길이 -1부터 1씩감소해야 하므로 -i까지 해준다.
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		int index = 0; //방번호
		int[] myArr = new int[6];
		int[] tempArr = new int[6]; //기존에 뽑았던 방번호를 기억시켜 두는 공간
		int[] ballArr = new int[45];
		
			for(int i=0;i<6;i++) {
				System.out.print("* "+(i+1)+"번 : ");
				int n = Integer.parseInt(scan.nextLine());
				if(n<=45||n>0) System.out.print("");
				else {
					System.out.println("* 1이상 45이하의 숫자만 입력해 주세요.");
					i--;
					continue;
				}
				myArr[i]=n;
			}
		for(int i=0;i<ballArr.length;i++) ballArr[i] = i+1; //배열에 1~45저장
		
		//공을 꺼내어 오면 꺼내온 공의 방번호(index번호)를 담아두는 곳으로 사용, 
		//꺼내온 공의 방번호가 0값이 들어올 수도 있으므로 초기치는 방번호로 사용하지 않는 -1로 모두 초기화 한다.
		for(int i=0;i<tempArr.length;i++) tempArr[i] = -1; 
		
		outer:
		for(int i=0;i<6;i++) { //공의 방번호를 꺼내는 작업을 6번 반복.
			//rnd.nextInt(max-min+1)+min;
			index = rnd.nextInt(45);  //0~44까지 난수 발생
			
			for(int j=0;j<tempArr.length;j++) {
				if(tempArr[j]==index) {
					i--; // ****중복이기때문에 다시 뽑아야하므로 올라갔던 카운터를 다시 내려줘야한다.
					continue outer;
				}
			}
			// tempArr |-1|-1|-1|-1|-1|
			if(i<6) tempArr[i] = index;
		}
		sort(tempArr);
		
		System.out.println("\n* 1등 로또 당첨 번호 입니다.");
		System.out.println("---------------------------------");
		System.out.print(" | ");
		for(int i=0;i<tempArr.length;i++) System.out.print(tempArr[i]+" | ");
		System.out.println("\n---------------------------------");
		
		System.out.println("\n* 내가 찍은 번호.");
		System.out.println("---------------------------------");
		System.out.print(" | ");
		
		sort(myArr);
		
		int cnt=0;
		for(int i=0;i<6;i++) {
			System.out.print(myArr[i]+" | ");
			for(int j=0;j<6;j++) {
				if((tempArr[i]) == myArr[j]) {
					cnt++;
				}
			}
		}
		System.out.println("\n---------------------------------");
		System.out.print("* 맞춘갯수 : "+cnt+" >> ");
		switch(cnt) {
		case 0:
		case 1:
		case 2:
		case 3: System.out.println("당첨되지 않으셨습니다.");break;
		case 4: System.out.println("3등으로 당첨 되셨습니다."); break;
		case 5: System.out.println("2등 당첨 축하드립니다!!"); break;
		case 6: System.out.println("1등!!!!!!!!!!!!!!!!"); break;
			default: break;
		}
	}// end of main ------------------
}
