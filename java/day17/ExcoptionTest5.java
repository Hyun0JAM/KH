package my.day17;

public class ExcoptionTest5 {

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
			//return; //finally절 수행하고 나서 종료한다.
			//System.exit(0); //finally절을 수행하지 않고 종료된다. 
			//0 : 정상종료 / 다른 나머지정수들 : 비정상종료 
			//정상종료인지 아닌지 구분하기 좋게 하기 위해 0과 다른값으로 구분을 두는 것이지 실행되어지는 것은 동일하게 종료되어진다.
		}
		finally { //try문 부분 실행에 있어서 오류(Exception)가 발생 하든지 안하든지 관계없이 try부분의 실행이 끝나고 나서 무조건 실행되어지는 부분이다.
			System.out.println("---오류가 나던지 안나던지 관계없이 반드시 출력해야 할 내용 ");
		}
		System.out.println("* 프로그램 종료합니다.");
	}
}
