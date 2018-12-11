package my.day5;

public class Calcurator {
	public Calcurator() {}
	
	public String calc(double a, double b, String op) {
		
		double result = 0;
		
		switch(op) {
		case "+": result = a+b; break;
		case "-": result = a-b; break;
		case "*": result = a*b; break;
		case "/": 
			if(b==0) return "두번 째 인자 값b는 0이 될수 없다.";
			else result = a/b; break;
			
/*				try{result = a/b; 
					break;}
				catch(ArithmeticException e) {
					//분모가 0 일때 발생_ 어떤숫자를 0으로 나눌 때
					return "두번 째 인자 값b는 0이 될수 없다.";}*/
			
		default : break;}
		
		if(result%(int)result ==0) return Integer.toString((int)result); //소수부가 .0인경우
		else return Double.toString(result); //소수부가 .0이 아닌경우
	}
}
