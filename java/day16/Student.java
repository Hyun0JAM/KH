package my.day16;

import java.util.Scanner;

public class Student implements Inter1, Inter2, Inter3 {//부모클래스는 하나이지만, 인터페이스는 다중상속 가능하다
	public static int cnt;
	
	private String sno;
	private String name;
	private int score;
	private String comment;
	private String grade;
	
	public Student() {cnt++;}
	public Student(String sno, String name, int score) {
		super();
		this.sno = sno;
		this.name = name;
		setScore(score);
		//this.comment = comment; 코멘트도 학생 저장후 정보 조회로 코멘트를 달수 있으므로 생성자에서 제외한다.
		//this.grade = grade; 학점은 점수에따라 자동으로 나뉘므로 생성자에서 제외시킨다.
		cnt++;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		if(score<0)
			this.score = 0;
		else if(score>100)
			this.score = 100;
		else this.score = score;
		
		switch(this.score/10) {
		case 10: this.grade = "A"; break;
		case 9: this.grade = "B"; break;
		case 8: this.grade = "C"; break;
		case 7: this.grade = "D"; break;
			default: this.grade = "F"; break;
		}
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getGrade() {
		return grade;
	}

	@Override
	public void printInfo() {
		System.out.println("----------------------------");
		System.out.println("* 1. 학번 : "+sno);
		System.out.println("* 2. 이름 : "+name);
		System.out.println("* 3. 점수 : "+score);
		System.out.println("* 4. 학점 : "+grade);
		System.out.println("* 5. 코멘트 ");
		System.out.println(" : "+comment+"\n");
	}

	@Override
	public Student search(String sno) {
		Student student = null;
		if(sno!=null&&sno.equals(this.sno))
			student = this;
		return student;
	}

	@Override
	public void comment(String sno, Scanner scan) {
		Student student = search(sno);
		if(student!=null) {
			System.out.println("* 이름 : "+name);
			System.out.println("* 점수 : "+score);
			System.out.println("* 코멘트 (입력 종료하려면 exit를 입력해주세요)");
			System.out.println(":");
			StringBuilder sb = new StringBuilder();
			String str="";
			do {
				str=scan.nextLine();
				if("exit".equalsIgnoreCase(str.trim())) break; //좌우 공백 없이 exit라면(대소문자 구분없이)
				else sb.append(str+"\n");  //QQQQQ?!
			} while (true);
			student.comment = sb.toString();
		}
		else System.out.println("* 존재하지 않는 학번입니다.");
	}
}