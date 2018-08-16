package my.day8;

import java.util.Random;
import java.util.Scanner;

import my.util.MyUtil;

public class RandomTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();  //math클래스의 랜덤함수는 안전성이 떨어진다.
		
		System.out.print("1부터 10까지 중 랜덤한 수 : ");
		int rndnum = rnd.nextInt(10) +1; //0부터 9사이의 랜덤한 수 +1 //1~10
		System.out.println(rndnum);
		
		System.out.print("13부터 18까지 중 랜덤한 수 : ");  //min 부터 max사이의 랜덤한 정수를 얻으려면 int rndnum = rnd.nextInt(max-min+1)+min
		rndnum = rnd.nextInt(6) +13; //0부터 9사이의 랜덤한 수 +1 //1~10
		System.out.println(rndnum);
		
		System.out.print("1부터 100까지 중 랜덤한 수 : "+MyUtil.random2(1, 100));
		
		System.out.print("\n1부터 100까지 중 랜덤한 수 : "+(char)MyUtil.random2('A', 'Z'));  
		
		scan.close();
	}

}
