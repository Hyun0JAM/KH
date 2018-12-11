/*
    === while 문 형식 ===
    
       변수의 초기화;
       
    while(조건식) {
             조건식이 참(true)이라면 반복해서 실행할 명령문 계속해서 실행하고,
             조건식이 거짓(false)이라면 { } 이부분을 빠져나간다.       
             
             반복해서 실행할 명령문;
             증감식;      
    }
*/

package my.day7;

public class WhileTest {

	public static void main(String[] args) {
		int i=0;
		while(i<5) {
			System.out.println((i+1)+". 안녕 자바~~");
			i++;
		}//end of while-------------------------------
		
		/*System.out.println("");
		i=0;
		while(++i<5) System.out.println(i+". Hello Java");
		
		int n=2;
		System.out.println("\n==========3단");
		while(n<10) {
			System.out.println("3 * "+n+" = "+3*n);
			n++;
		}*/
		
		i=0;
		System.out.println("");
		while(i++<9) {
			System.out.println("3 * "+i+" = "+3*i);
		}
		
		i=1;
		System.out.println("");
		while(i<9) {
			System.out.println("3 * "+i+" = "+3*i);
			i+=2;
		}
		
		i=0;
		System.out.println("");
		while(i++<7) {
			System.out.println("3 * "+i+" = "+3*i);
		}
		
		System.out.println("\n* 구구단 ");
		int row=0, col=0;
		while(row++<9) {
			while(col++<9) {
			String str = (col<9)?"\t":"\n";
			System.out.print(row+"*"+col+"="+(row*col)+str);
			}
			col =0;
		}
		
		System.out.println("\n* 구구단(3단 7단 제외) ");
		row=0; col=0;
		while(row++<9) {
			while(col++<9) {
			if(row==3||row==7) continue;
			String str = (col<9)?"\t":"\n";
			System.out.print(row+"*"+col+"="+(row*col)+str);
			}
			col =0;
		}
		
	}
}
