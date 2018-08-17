/* [2차원 배열]
 * 
 * */


package my.day9;

public class ArrayTwoDimension {

	public static void main(String[] args) {
		int[][] pointArr =new int[4][3]; //4행 3열
		
		pointArr[0][0] = 10;
		pointArr[0][1] = 20;
		pointArr[0][2] = 30;
		
		pointArr[1][0] = 40;
		pointArr[1][1] = 50;
		pointArr[1][2] = 0;
		
		pointArr[2][0] = 70;
		pointArr[2][1] = 80;
		pointArr[2][2] = 90;
		
		pointArr[3][0] = 100;
		pointArr[3][1] = 110;
		pointArr[3][2] = 120;

		System.out.println("* pointArr.length : "+pointArr.length); //4 : 행수가 나옴
		System.out.println("* pointArr[0] : "+pointArr[0].length); //3 : 열수가 나옴
		
		System.out.println("---------------------");
		for(int i=0;i<pointArr.length;i++) {
			for(int j=0;j<pointArr[0].length;j++) {
				System.out.print(pointArr[i][j]+"\t");
			}System.out.print("\n");
		}
		System.out.println("---------------------");
		for(int i=0;i<pointArr.length;i++) {
			for(int j=0;j<pointArr[0].length;j++) {
				if(i==1) continue;
				System.out.print(pointArr[i][j]+"\t");
			}System.out.print("\n");
		}
		System.out.println("====================");
		
		int[][] scoreArr= new int[4][]; //4행 ?열
		scoreArr[0] = new int[3];
		scoreArr[1] = new int[3]; //2로 했을 때 ArrayOutOfBpunds 오류발생!!
		scoreArr[2] = new int[3];
		scoreArr[3] = new int[3];
		
		scoreArr[0][0] = 10; //열에대한 배열크기를 설정하지 않았으므로 NullPointerException이 발생한다.
		scoreArr[0][1] = 20;
		scoreArr[0][2] = 30;
		
		scoreArr[1][0] = 40;
		scoreArr[1][1] = 50;
		scoreArr[1][2] = 60;
		
		scoreArr[2][0] = 70;
		scoreArr[2][1] = 80;
		scoreArr[2][2] = 90;
		
		scoreArr[3][0] = 100;
		scoreArr[3][1] = 110;
		scoreArr[3][2] = 120;
		
		System.out.println("* scoreArr.length : "+scoreArr.length); //4 : 행수가 나옴
		System.out.println("* scoreArr[0] : "+scoreArr[1].length); //3 : 열수가 나옴
		
		int[][] valArr = {{10,20,30},{40,50},{70,80,90},{100,110,120}}; 
		//4행 //0 - 3열 //1 - 2열 //2 - 3열 //3 - 3열
		
		System.out.println("* valArr.length : "+valArr.length); 
		System.out.println("* valArr[0] : "+valArr[0].length);
		System.out.println("* valArr[1] : "+valArr[1].length); 
		System.out.println("* valArr[2] : "+valArr[2].length);
		System.out.println("* valArr[3] : "+valArr[3].length); 
		
	}
}
