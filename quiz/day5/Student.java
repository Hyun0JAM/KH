package my.quiz.day5;

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
		String s = "\n== "+name+"님의 성적결과 ============\n"
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
		double avg = (kor+eng+math)/3.0;
		avg = Math.round(avg*100)/100.0;
		return "7. 평균 : "+ avg;
	}
	public String showScore() {
		String s;
		double avg = (kor+eng+math)/3.0;
		avg = Math.round(avg*100)/100.0;
		
		if(90<=avg) s="A";
		else if(80<=avg) s="B";
		else if(70<=avg) s="C";
		else if(60<=avg) s="D";
		else s="F";
		
		return "8. 학점 : "+s;	
	}
	public String showScore2() {
		String s;
		double avg = (kor+eng+math)/3.0;
		avg = Math.round(avg*100)/100.0;
		
		//avg가 90이상이라면 90, 90미만이라면 80으로, 80미만이라면 70으로, 70미만이라면 60으로 만든다.
		
		switch((int)(avg/10)) { //key값은 정수형(byte,short,int) 또는 문자열만 사용가능하다
					//jdk 1.7이후부터 문자열 사용 가능
			case 10 :
			case 9 : s="A"; break;
			case 8 : s="B"; break;
			case 7 : s="C"; break;
			case 6 : s="D"; break;
			default : s="F"; break;
		}
		return "8. 학점 : "+s;	
	}
	public String getGift(){
		
		double avg = (kor+eng+math)/3.0;
		avg = Math.round(avg*100)/100.0;
		String s = "9. 선물 : ";
		switch((int)(avg/10)) {
		case 10 : 
		case 9: s+= "놀이공원이용권, ";
		case 8: s+= "뷔페이용권, ";
		case 7: s+= "치킨, ";
		case 6: s+= "아이스크림 "; break;
		default : s+="꿀밤 3대"; break;
		}
		return s;
	}

}
