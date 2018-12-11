package my.quiz;

public class Student {

	String sno;
	String name;
	byte kor;
	byte eng;
	byte math;

	public Student() {}

	public Student(String sno, String name, int kor, int eng, int math) {
		this.sno = sno;
		this.name = name;
		this.kor = (byte)kor;
		this.eng = (byte)eng;
		this.math = (byte)math;
	}

	public String showInfo() {
		String s = "\n========="+name+"님의 성적결과 =========\n"
				+ "1. 학번 : "+sno+"\n"
				+ "2. 성명 : "+name+"\n"
				+ "3. 국어 : "+kor+"\n"
				+ "4. 영어 : "+eng+"\n"
				+ "5. 수학 : "+math;
		return s;
	}

	public String showTotal() {
		int total = kor+eng+math;
		return "6. 총점 : "+ total;
	}
	public String showAvg() {
		float avg = (kor+eng+math)/3.0f;
		return "7. 평균 : "+ avg;
	}

}
