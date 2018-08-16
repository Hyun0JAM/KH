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
}
