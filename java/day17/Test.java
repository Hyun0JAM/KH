package my.day17;

import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		String str1 = "25";
		String str2 = "똘똘이";
		
		int a1 = Integer.parseInt(str1); // 가능
		//int a2 = Integer.parseInt(str2); // 실행시 에러 NumberFormatException
		
		//Runtime Exception 여기서는 NumberFormatException
		
		int[] arr = {10,20,30};
		for(int i=0;i<arr.length/*+1*/;i++) {
			System.out.println(arr[i]); //ArrayIndexOutOfBoundsException
		}
		
		int[] arr2 = {10,20,30};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]/(i-2)); //ArithmeticException (분모 0 오류)
		}
		
		try {
			int no = System.in.read(); //IOException(입출력오류)
		} catch (IOException e) {
			e.printStackTrace();
		}
		//checkedException >> 처음부터 오류인지 알수 있다.

	}

}
