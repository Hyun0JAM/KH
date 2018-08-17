package my.util;

import java.util.Date;
import java.util.Random;

public class MyUtil {
	public static void currentTime() {
		Date now = new Date();
		
		String today= String.format("%tm월 %td일 %tT",now,now,now);
		System.out.println("현재시각 : "+today);
	}
	
	public static int calcuration(int a, int b, int c) {
		return a+b+c;
	}
	public static int random(int a,int b){
		return (int)(Math.random()*(b-a+1)+a);
	}
	public static int random2(int a,int b){
		Random rnd = new Random();
		return rnd.nextInt(b-a+1)+a;
	}
	
	public static boolean checkPassword(String passwd) {
		if(passwd.length()<8) {
			System.out.println("암호는 8 글자 이상이어야 한다. ");
			return false;	
		}
		else {
			char[] chArr = passwd.toCharArray();
			boolean flagAlphabet = false, flagNumber = false, flagSpecial = false;
			// flagAlphabet,falgNumber,flagSpecial 을 false로 초기값을 지정한다.(boolean 은 false 아님 true의 값만 가짐)
			
			for(int i=0;i<chArr.length;i++) {
				if('A'<= chArr[i] && chArr[i]<='Z' ||'a'<= chArr[i] && chArr[i]<='z') {
					flagAlphabet = true;
				}
				else if('0'<= chArr[i] && chArr[i]<='9') {
					flagNumber = true;
				}
				else 
					flagSpecial = true;
			}
			if(flagAlphabet && flagNumber && flagSpecial) {
				System.out.println("암호 "+passwd + "로 입력이 완료되었습니다.");
				return true;
			}
			else {
				System.out.println("암호는 영문자, 숫자, 특수기호가 혼합되아야만 합니다.");
				return false;
			}
		}
	}
}