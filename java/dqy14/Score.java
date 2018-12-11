package my.dqy14;

public class Score {
	private String sno;
	private String quarter;
	private int kor;
	private int eng;
	private int math;
	private int science;
	private int society;
	
	public Score() {}
	public Score(String sno, String quarter, int kor, int eng, int math, int science, int society) {
		super();
		this.sno = sno;
		this.quarter = quarter;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.science = science;
		this.society = society;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getQuarter() {
		return quarter;
	}
	public void setQuarter(String quarter) {
		this.quarter = quarter;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getSociety() {
		return society;
	}
	public void setSociety(int society) {
		this.society = society;
	}
	// - 메소드의 오버로딩 --------------------------------------
	// 매개변수가 타입,갯수가 다를때 오버로딩된다.
	public void setScore(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public void setScore(int kor,int eng, int math, int science,int society) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.science = science;
		this.society = society;
	}
}
