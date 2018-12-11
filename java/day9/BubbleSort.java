package my.day9;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] numArr = {9,7,3,5,1};
		// 7 9 3 5 1 // 3 9 7 5 1 // 3 7 9 5 1
		//추출 대상 갯수 : 
		int temp=0;
		System.out.println("-----------------------------------");
		System.out.print("* 정렬 전 : ");
		for(int i=0;i<numArr.length;i++) System.out.print(numArr[i]+" ");
		System.out.println("\n-----------------------------------");
		for(int i=0;i<numArr.length-1;i++) { // 추출 대상갯수 배열길이 -1
			for(int j=i+1;j<numArr.length;j++) { //비교대상 갯수 배열길이 -1부터 1씩감소해야 하므로 -i까지 해준다.
				if(numArr[i]>numArr[j]) {
					temp = numArr[i];
					numArr[i]=numArr[j];
					numArr[j]=temp;
				}
			}
		}
		System.out.print("* 정렬 후 : ");
		for(int i=0;i<numArr.length;i++) System.out.print(numArr[i]+" ");
		
		int[] numArr2= {9,7,3,5,1};
		Arrays.sort(numArr2);
		System.out.println("");
		for(int i=0; i<numArr.length;i++)System.out.print(" "+numArr2[i]);
		
	}
}
