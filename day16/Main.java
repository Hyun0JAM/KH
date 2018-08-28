package my.day16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student[] stArr = new Student[3];
		   String str = '\u0041'+"0"; //참
		   System.out.println(str);
		stArr[0] = new Student("KH001","한석규",93);
		stArr[1] = new Student("KH002","두석규",72);
		stArr[2] = new Student("KH003","세석규",86);
		
		for(Student st : stArr) {
			st.comment(st.getSno(), scan);
		}
		for(Student st : stArr) {
			st.printInfo();
		}
		Student searchST=null;
		System.out.println("----------------------------");
		System.out.print("* 검색 할 학번 : ");
		String sno = scan.nextLine();
		for(Student st : stArr) {
			searchST = st.search(sno);
			if(searchST!=null)
				searchST.printInfo();
			break;
		}
		if(searchST==null) System.out.println("* 검색하신 학번 "+sno+"는 존재하지 않습니다!!");
		
		scan.close();
	}

}
