package my.day13;

public class Score {
	int kor=-1; //90
	int eng=-1; //91 
	int math=-1; //92

	private Student st;
	private int total;
	private double avg;
	private String grade;
	
	public void setStudent(Student st) {
		/*if(st!=null
				&&!(st.getSno().trim().isEmpty())
				&&!(st.getNum().trim().isEmpty())
				&&!(st.getName().trim().isEmpty())) */
			this.st=st; //null이 아닐경우에만 set한다.
		//else System.out.println("* 사용 불가");
	}
	public Student getStudent() {
		return st;
	}
	
	public int getTotal() {
		return kor+eng+math;
	}
	public double getAvg() {
		return Math.round((((kor+eng+math)*10)/3)/10.00);
	}
	public String getGrade() {
		grade = "";
		if(90<=getAvg()) grade="A";
		else if(80<=getAvg()&&getAvg()<90) grade="B";
		else if(70<=getAvg()&&getAvg()<80) grade="C";
		else if(60<=getAvg()&&getAvg()<70) grade="D";
		else grade="F";
		return grade;
	}
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		if(0<=kor&&kor<=100) this.kor = kor;
		else System.out.println("* 음수 불가"); 
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		if(0<=eng&&eng<=100) this.eng = eng;
		else System.out.println("* 음수 불가"); 
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		if(0<=math&&math<=100) this.math = math;
		else System.out.println("* 음수 불가"); 
	}
}
