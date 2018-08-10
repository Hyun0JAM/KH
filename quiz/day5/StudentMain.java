package my.quiz.day5;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("학번 : ");
		String sno = sc.nextLine();
		System.out.print("성명 : ");
		String name = sc.nextLine();
		System.out.print("국어 : ");
		int kor = Integer.parseInt(sc.nextLine());
		System.out.print("수학 : ");
		int eng = Integer.parseInt(sc.nextLine());
		System.out.print("영어 : ");
		int math = Integer.parseInt(sc.nextLine());
		
		Student st = new Student(sno,name,kor,eng,math);
		
		System.out.println(st.showInfo());
		System.out.println(st.showTotal());
		System.out.println(st.showAvg());
		System.out.println(st.showScore());
		System.out.println(st.showScore2());
		System.out.println(st.getGift()); 
	}
}
