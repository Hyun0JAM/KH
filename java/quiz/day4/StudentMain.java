package my.quiz.day4;

public class StudentMain {
	public static void main(String[] args) {
		
		Student st1 = new Student("kh001","홍길동",90,91,93);
		Student st2 = new Student("kh002","이미자",80,81,83);
		
		System.out.println(st1.showInfo());
		System.out.println(st1.showTotal());
		System.out.println(st1.showAvg());
		
	}
}
