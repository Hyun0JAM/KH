package my.day17;

import java.util.Scanner;

public class MemberMail {

	public static void main(String[] args) throws UserDefineExceptionPW,UserDefineExceptionID {
		Scanner scan = new Scanner(System.in);
		Member member1=new Member();
		
		try {
			member1.setName("최현영");
			member1.setId("admin");
			member1.setPw("asfjk1234!");
			
			
		} catch (UserDefineExceptionID e) {
			System.out.println(e.getMessage());
		}
		Member member2 =null;
		try {
			//member2=new Member("asdf","qwer1234!","이순신");	
			//member2=new Member("superman","qwer1234!","이순신");	
			member2=new Member("lssdd","qwer1234!","이순신");	
		} catch (UserDefineExceptionID e) {
			e.printStackTrace();
		}
		
		
		
		/*System.out.println("*********************************");
		System.out.print("* NAME :");
		String name = scan.nextLine();
		System.out.print("* ID :");
		String id = scan.nextLine();
		System.out.print("* PW :");
		String pw = scan.nextLine();*/
		
		scan.close();
	}

}
