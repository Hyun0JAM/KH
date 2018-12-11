package my.day13;

public class Student {
	private String sno="";
	private String name="";
	private String num="";
	
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		if(sno.trim().isEmpty()) System.out.println("* 학번은 공백만으로 입력이 불가능합니다.");
		else this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.trim().isEmpty()) System.out.println("* 성명은 공백만으로 입력이 불가능합니다.");
		else this.name = name;
	}
	public String getNum() {
		String str =""; 
		if(num.length()==10) str = num.substring(0, 3)+"-" + num.substring(3, 6)+"-" + num.substring(6);
		else str = num.substring(0, 3)+"-" + num.substring(3,7)+"-" + num.substring(7);
		return str;
	}
	public void setNum(String num) {
		if(!(10<=num.length()&&num.length()<=11)) System.out.println("* 연락처는 10~11자리로 입력해 주세요.");
		this.num = num;
	}
	
}
