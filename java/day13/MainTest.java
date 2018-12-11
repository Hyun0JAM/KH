package my.day13;

public class MainTest {

	public static void main(String[] args) {
		Score[] scoreArr = new Score[4];
		//student 객체 생성
		Student st1 = new Student();
		st1.setSno("kh001");
		st1.setName("한석규");
		st1.setNum("01035468617");
		
		Student st2 = new Student();
		st2.setSno("kh002");
		st2.setName("두석규");
		st2.setNum("01035468616");
		
		Student st3 = new Student();
		st3.setSno("kh003");
		st3.setName("    ");
		st3.setNum("01035468615");
		
		Student st4 = new Student();
		st4.setSno("kh004");
		st4.setName("최현영");
		st4.setNum("01035468614");
		
		//Score객체 생성
		Score sc1 = new Score();
		sc1.setKor(90);
		sc1.setEng(91);
		sc1.setMath(92);
		sc1.setStudent(st1);
		
		Score sc2 = new Score();
		sc2.setKor(80);
		sc2.setEng(81);
		sc2.setMath(84);
		sc2.setStudent(st2);
		
		Score sc3 = new Score();
		sc3.setKor(70);
		sc3.setEng(71);
		sc3.setMath(72);
		sc3.setStudent(st3);
		
		Score sc4 = new Score();
		sc4.setKor(60);
		sc4.setEng(61);
		sc4.setMath(62);
		sc4.setStudent(st4);
		
		if(sc1.getStudent()!=null) scoreArr[0] = sc1; 
		if(sc2.getStudent()!=null) scoreArr[1] = sc2;
		if(sc3.getStudent()!=null) scoreArr[2] = sc3;
		if(sc4.getStudent()!=null) scoreArr[3] = sc4;

		System.out.println("* 성적입력완료");
		System.out.println("\n---------------------------------------------------------------------------------------");
		System.out.println("학번\t이름\t전화\t\t국어\t수학\t영어\t총점\t평균");
		System.out.println("---------------------------------------------------------------------------------------");
		for(Score sc : scoreArr) {
			System.out.println(sc.getStudent().getSno()+"\t"+sc.getStudent().getName()+"\t"+sc.getStudent().getNum()+"\t"+
					sc.getKor()+"\t"+sc.getMath()+"\t"+sc.getEng()+"\t"+sc.getTotal()+"\t"+sc.getAvg());
		}
		for(int i=0;i<scoreArr.length;i++) {
			System.out.println("");
			System.out.println("* "+scoreArr[i].getStudent().getName()+"님의 정보 ===========");
			System.out.println("1. 학	번 : "+scoreArr[i].getStudent().getSno());
			System.out.println("2. 이	름 : "+scoreArr[i].getStudent().getName());
			System.out.println("3. 전	화 : "+scoreArr[i].getStudent().getNum());
			System.out.println("4. 국	어 : "+scoreArr[i].getKor());
			System.out.println("5. 수	학 : "+scoreArr[i].getEng());
			System.out.println("6. 영	어 : "+scoreArr[i].getMath());
			System.out.println("7. 총	점 : "+scoreArr[i].getTotal());
			System.out.println("8. 평	균 : "+scoreArr[i].getAvg());
		}
	}
}
