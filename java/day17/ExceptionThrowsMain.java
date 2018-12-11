package my.day17;

public class ExceptionThrowsMain {

	public static void main(String[] args) {
		ExceptionThrows ex= new ExceptionThrows();
		ex.setName("홍길동");
		try {
			ex.setScore("asdf");
			System.out.println("* 성명 : "+ex.getName());
			System.out.println("* 점수 : "+ex.getScore());
			System.out.println("* 학점 : "+ex.getGrade());
		} catch (NumberFormatException e) {
			System.out.println("* 숫자만 입력하세요.");
			//return;
		}

	}

}
