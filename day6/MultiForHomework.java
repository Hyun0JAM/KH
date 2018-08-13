package my.day6;

public class MultiForHomework {

	public static void main(String[] args) {
		/*문제 1
		 
		  *****
		  ****
		  ***
		  **
		  *
		  
		 */
		System.out.println("\n===== 문제1 =====\n");
		
		for(int i=5;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		
		/*문제2
		 
		 *********1
		 ********2
		 *******3
		 ******4
		 *****5
		 ****6
		 ***7
		 **8
		 *9
		  
		 */
		
		System.out.println("\n===== 문제2 =====\n");
		
		for(int i=9;i>0;i--) {
			for(int j=0; j<i;j++) {
				System.out.print("*");
			}
			System.out.print((10-i)+"\n");
		}
		
		/*문제 3
		 
		  *****
		  ****
		  ***
		  **
		  *
		  	(0,0)
		  	(1,0) (1,1)
		  	(2,0)(2,1)(2,2)
		  	(3,0)(3,1)(3,2)(3,3)
		  	(4,0)(4,1)(4,2)(4,3)(4,4)
		  
		  	i>=j라면 *을 출력한다.
		 */
		System.out.println("\n===== 문제3 =====\n");
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i>=j)
				System.out.print("*");
			}
			System.out.print("\n");
		}
		/*
		for(int i=0;i<5;i++) {
			for(int j=0;j<i+1;j++) {
				if(i>=j) System.out.print("*");}
			System.out.print("\n");}
		---------------------------------
		for(int i=0;i<5;i++) {
			for(int j=i+1;j>0;j--) {
				System.out.print("*");}
			System.out.print("\n");}*/
		
		/*문제 4
		 
		       *
		      **
		     ***
		    ****
		   *****
		  
		  	(0,0)
		  	(1,0) (1,1)
		  	(2,0)(2,1)(2,2)
		  	(3,0)(3,1)(3,2)(3,3)
		  	(4,0)(4,1)(4,2)(4,3)(4,4)
		  
		  	i>=j라면 *을 출력한다.
		 */
		System.out.println("\n===== 문제4 =====\n");
		for(int i=5;i>0;i--) {
			for(int j=0;j<5;j++) {
				if(i>j+1)
				System.out.print(" ");
				else
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		/*문제5
		 
		    *
		   ***
		  *****
		  
		 */
		System.out.println("\n===== 문제4 =====\n");
		for(int i=0;i<3;i++) {
			for(int j=0; j<5;j++) {
				if(i+j>=2 && j-i<=2) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.print("\n");
		}
		
		System.out.println("\n===== 문제5 =====\n");
		for(int i=0;i<3;i++) {
			for(int j=0; j<5;j++) {
				if(i+j>=2 && j-i<=2) System.out.print("*");
				else System.out.print("$");
			}
			System.out.print("\n");
		}
		
		System.out.println("\n-----------------\n");
		//" "2번 "*"1번 " "2번
		//" "1번 "*"3번 " "1번
		//" "0번 "*"5번 " "0번
		for(int i=1;i<=3;i++) {
			for(int j=0;j<(5-(i*2-1))/2;j++) {
				System.out.print(" "); //j<2 j<1 j<0
			}
			for(int j=0;j<(i*2-1);j++) {
				System.out.print("*"); //j<1 j<3 j<5
			}
			for(int j=0;j<(5-(i*2-1))/2;j++) {
				System.out.print(" "); //j<2 j<1 j<0
			}
			System.out.print("\n");
		}
		
		System.out.println("\n===== 문제6 =====\n");
		for(int i=2;i>=0;i--) {
			for(int j=0; j<5;j++) {
				if(i+j>=2 && j-i<=2) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}





