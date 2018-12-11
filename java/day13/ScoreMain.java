package my.day13;

public class ScoreMain {

	public static void main(String[] args) {
		Score score= new Score(); 
		score.setKor(90);
		score.setEng(91);
		score.setMath(92);
		
		System.out.println("- score --------------------");
		System.out.println("1. 국어 : "+score.getKor());
		System.out.println("2. 영어 : "+score.getEng());
		System.out.println("3. 수학 : "+score.getMath());

		System.out.println("4. 총점 : "+score.getTotal());
		System.out.println("5. 평균 : "+score.getAvg());
		System.out.println("6. 학점 : "+score.getGrade());
		
	}

}
