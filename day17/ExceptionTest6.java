package my.day17;

public class ExceptionTest6 {
	public static void main(String[] args) {
		try {
			for(int i=0;i<=5;i++){
				//int result = 50/(6-i);
				int result = 50/(3-i);
				System.out.println("* result : 50/(3-"+i+") = "+result);
			}
		} 
		catch(ArithmeticException e) {
			System.out.println("* 분모는 0으로 할수 없습니다.");
			System.out.println("* e.getMessage() : "+e.getMessage());
			e.printStackTrace(); //어디가 들렸는지 추적하고 오류메세지를 보여준다. QQQ? - 처리안한거랑 뭐가다른지 모르겠네
		}
		finally { //try문 부분 실행에 있어서 오류(Exception)가 발생 하든지 안하든지 관계없이 try부분의 실행이 끝나고 나서 무조건 실행되어지는 부분이다.
			System.out.println("---오류가 나던지 안나던지 관계없이 반드시 출력해야 할 내용 ");
		}
		System.out.println("* 프로그램 종료합니다.");
	}
}
