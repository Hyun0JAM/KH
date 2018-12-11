package io.day4;

import java.util.*;

public class Main {
	public void menu() {
		System.out.println("- Menu ----------------------");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 모든회원출력");
		System.out.println("4. 특정 ID검색하기");	
		System.out.println("5. 내정보 확인하기");	
		System.out.println("6. 나의 정보변경");	
		System.out.println("7. 종료");
		System.out.println("-----------------------------");
		System.out.print(">> 선택하실 번호 : ");
	}
	public Member regist(Scanner scan,List<Member> memList) {
		boolean boolid = false;
		String id;
		do {
			System.out.print("* ID : ");
			id = scan.nextLine();
			for(Member mem : memList) {
				if(mem.getId().equals(id)) {
					boolid = true;
					System.out.println("아이디가 중복되었습니다. 다시 입력해주세요");
				}
				else boolid = false;
			}	
		} while (boolid);
		System.out.print("* PW : ");
		String pw = scan.nextLine();
		System.out.print("* NAME : ");
		String name = scan.nextLine();
		return new Member(id,pw,name);
	}
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		SerializableTest serial = new SerializableTest();
		List<Member> memList = new ArrayList<Member>();
		Member loginMember = null;
		Object obj = null;
		Main main = new Main();
		int selectNo=0;
		do {
			main.menu();
			try {
				selectNo = Integer.parseInt(scan.nextLine());	
			} catch (NumberFormatException e) {
				System.out.println("* 1~5사이의 번호로 입력해 주세요.");
			}
			switch(selectNo) {
			case 1: //회원가입
				memList.add(main.regist(scan,memList));
				serial.objextToFileSave(memList,"C:\\IOTestData\\serializable\\member.dat");
				System.out.println("* 회원가입성공!!");
				break;
			case 2: //로그인
				System.out.print("* ID : ");
				String loginid = scan.nextLine();
				System.out.print("* PW : ");
				String loginpw = scan.nextLine();
				
				obj = serial.getObjectFormFile("C:\\IOTestData\\serializable\\member.dat");
				memList = (List<Member>)obj;
				
				for(Member mem : memList) {
					if(mem.login(loginid, loginpw)==null) {
						System.out.println("* 로그인 실패");
					}
					else {
						loginMember = mem.login(loginid, loginpw);
						System.out.println("* 로그인 성공");
					}
				}
				break;
			case 3: //모든회원 출력하기
				obj = serial.getObjectFormFile("C:\\IOTestData\\serializable\\member.dat");
				if(obj!=null) {
					memList = (List<Member>)obj;
					for(Member mem : memList) {
						System.out.println(mem.toString());
					}
				}
				else System.out.println("파일에 저장된 객체정보가 없습니다.");
				break;
			case 4: //특정ID검색
				obj = serial.getObjectFormFile("C:\\IOTestData\\serializable\\member.dat");
				if(obj!=null) {
					memList = (List<Member>)obj;
					System.out.print("* 검색 할 ID : ");
					String searchid = scan.nextLine();
					for(Member mem: memList) {
						if(mem.getId().equals(searchid)) 
							System.out.println(mem.toString());
					}
				}
				break;
			case 5: //내정보 확인하기
				if(loginMember!=null) {
					obj = serial.getObjectFormFile("C:\\IOTestData\\serializable\\member.dat");
					memList = (List<Member>)obj;
					loginMember = memList.get(loginMember.cnt-2);
					System.out.println(loginMember.toString());
				}
				else System.out.println("* 로그인 상태가 아닙니다.");
				break;
			case 6: //내정보 변경하기
				System.out.print("* 변경 할 PW : ");
				String pw = scan.nextLine();
				memList.set(loginMember.cnt-1, new Member(loginMember.getId(),pw,loginMember.getName()));
				serial.objextToFileSave(memList,"C:\\IOTestData\\serializable\\member.dat");
				System.out.println("* 변경완료!!");
				break;
			case 7: break;
			default : 
				System.out.println("* 잘못된 입력입니다. 다시입력해주세요!!");
				break;
			}	
		} while (selectNo!=7);	
		System.out.println("* 프로그램 종료!!");
	}
}
