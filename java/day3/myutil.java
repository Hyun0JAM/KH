package my.util;

import java.util.Date;

public class MyUtil {
	public static void currentTime() {
		Date now = new Date();

		String today= String.format("%tm월 %td일 %tT",now,now,now);
		System.out.println("현재시각 : "+today);
	}

	public static int calcuration(int a, int b, int c) {
		return a+b+c;
	}
}
