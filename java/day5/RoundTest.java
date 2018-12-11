package my.day5;

public class RoundTest {
	public static void main(String[] args){
		//반올림에 대해서 알아본다
		double db1 = 93.45678, db2 = 89.87654;
		
		System.out.println("========== 반올림 후 ============== ");
		
		System.out.println("db1 : "+Math.round(db1)+", db2 : "+Math.round(db2));
		
		System.out.println("========== 특정 소수부 자리에서 반올림 후"); 
		/* 소수부 2번쨰 자리에서 반올림 하려고 한다.
		 * ex) 93.45678 * 10 >> 934.5678
		 * Math.round(934.5678); = 935
		 * 935/10.0 >> 93.5
		 * 
		 * 소수부 3번쨰에서 반올림
		 * ex) 86.87654 * 100 >> 8687.654
		 * Math.round(86.87654) = 8688
		 * 8688/100.0 >> 86.88
		 */
		
		System.out.println("db1 : "+Math.round(db1*10)/10.0);
		System.out.println("db2 : "+Math.round(db2 *100)/100.0);
		
	}

}
