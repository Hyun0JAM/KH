package my.day17;

public class ExceptionThrows {
	
	private String name;
	private String score;
	private String grade;
	
	public ExceptionThrows() {}
	public ExceptionThrows(String name, String score, String grade) {
		super();
		this.name = name;
		this.score = score;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) throws NumberFormatException { //책임을 호출한 쪽으로 던진다.
		this.score = score;
		
		int jumsu = Integer.parseInt(score);
		switch(jumsu/10) {
		case 10: grade="A"; break;
		case 9: grade="B"; break;
		case 8: grade="C"; break;
		case 7: grade="D"; break;
		default: grade="F"; break;
		}
	}
	public String getGrade() {
		return grade;
	}
}
