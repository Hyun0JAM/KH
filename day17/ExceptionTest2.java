package my.day17;

public class ExceptionTest2 {

	public static void main(String[] args) {
		try {

			for(int i=0;i<=5;i++){
				int result = 50/(3-i);
				System.out.println("* result : 50/(3-"+i+") = "+result);
			}
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("---오류가 나던지 안나던지 관계없이 반드시 출력해야 할 내용 ");
		}
	}

}
