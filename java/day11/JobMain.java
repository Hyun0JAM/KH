package my.day11;

import java.util.Scanner;

import my.util.MyUtil;

class JobMain {
	//구직자 객체를 저장 시키는 배열
	JobSeeker[] seekerArr = new JobSeeker[10];
	boolean loginflag = false; //로그인된 상태인지 저장해두는 플래그
	String logid; //로그인시 로그인 된 아이디를 저장하는 변수
	
	//메뉴를 보여주는 메소드
	public static void menu() {
		System.out.println("- Menu -------------------------");
		System.out.println("1. 구직자 등록");
		System.out.println("2. 구인회사 등록");
		System.out.println("3. 로그인(구직자)");
		System.out.println("4. 로그인(구인회사)");
		System.out.println("5. 나의 정보조회");
		System.out.println("15. 종료");
		System.out.println("================================");
		System.out.print(">> 메뉴 번호 선택 : ");
	}//end of menu---------------------
	//구직자 등록(생성)해주는 기능

	public void registJobSeeker(Scanner scan) {
		String userid="";
		String pw="";
		String name="";
		String birth="";
		int    gender=0;
		String adress="";
		String school="";
		String mobile="";
		String hopejob="";
		int    hopemoney=0;
		
		boolean boolUserId = false;
		boolean boolPw = false;
		boolean boolBirth = false;
		boolean boolNumber = false;
		boolean boolhopemoney = false;
		
		System.out.println("--------------------------------");
		
		//1. 아이디값 입력받기
		do {
			System.out.print("1. ID : ");
			userid=scan.nextLine();
			boolUserId = userid.trim().isEmpty();
			//bool이 참인 경우는 user id가 공백만 있거나 또는 비었을경우
			
			if(boolUserId)  //앞뒤에 공백이있다면 제거하고 비었는지 확인
				System.out.println("* 아이디는 공백만으로 사용 불가합니다.");
			else if(idCheck(userid)) {
				System.out.println("* 아이디가 중복 되었습니다.");
			}
			else break;
		} while (boolUserId||idCheck(userid));
		
		//2. 암호 입력받기
		do {
			System.out.print("2. 암호 : ");
			pw = scan.nextLine();
			boolPw = MyUtil.checkPassword(pw);
			
			if(boolPw) break;
		} while (true);
		
		//3. 이름 입력받기
		do {
			System.out.print("3. 이름 : ");
			name = scan.nextLine();
			
			if(name.trim().isEmpty()) 
				System.out.println("* 이름은 공백만으로 사용 불가합니다.");
			else break;
		} while (name.trim().isEmpty());
		
		//4.생년월일 입력받기
		do {
			System.out.print("4. 생일 (ex.19941116): ");
			birth = scan.nextLine();
			
			boolBirth = MyUtil.checkNumber(birth);
			if(boolBirth) System.out.println("* 생년월일은 숫자로만 입력 가능합니다.");
			else if(birth.length()!=8) System.out.println("* 8자리의 숫자로 입력 해주세요.");
			else break;
		} while (true);
		
		//5. 성별 입력 받기
		do {
			try {
				System.out.print("5. 성별 (1:남자/2:여자): ");
				gender = Integer.parseInt(scan.nextLine());
			
				if(gender==1||gender==2) break;
				else {
					System.out.println("* 1번(남자)과 2번(여자)중 선택하여 입력해주세요");
					continue;
				}
			} catch (NumberFormatException e) {
				System.out.println("* 숫자로만 입력해주세요");
				//continue;
			}
		} while (!(gender==1||gender==2));
		
		//6. 주소 입력받기
		do {
			System.out.print("6. 주소 : ");
			adress = scan.nextLine();
			if(!adress.trim().isEmpty())break;
			else System.out.println("* 주소를 입력해주세요.");
		} while (true);
		
		//7. 학력 입력받기
		do {
			System.out.print("7. 학력(대졸이상=1,초대졸=2,고졸=3,고졸미만=4) : ");
			school = scan.nextLine();
			
			if("1".equals(school)||"2".equals(school)||"3".equals(school)||"4".equals(school))
				break;
			else System.out.println("* 1~4사이의 값을 입력해 주세요.");
		} while (true);
		
		//8. 연락처입력받기
		do {
			System.out.print("8. 연락처 : ");
			mobile = scan.nextLine();
			boolNumber = MyUtil.checkNumber(mobile);
			
			if(boolNumber) System.out.println("* 숫자로만 입력해 주세요.");
			else if(mobile.length()!=11) System.out.println("* 11자리의 숫자로만 입력해주세요");
			else break;
		} while (true);
		
		//9. 희망직종 입력받기
		do {
			System.out.print("9. 희망 직종 : ");
			hopejob = scan.nextLine();
			
			if(hopejob.trim().isEmpty()) 
				System.out.println("* 공백을 제외한 희망 직종을 입력해주세요.");
			else break;
		} while (true);
		
		//10. 희망연봉 입력받기
		do {
			System.out.print("10. 희망 연봉 (단위 _ 만원): ");
			String stmoney = scan.nextLine();
			
			boolhopemoney = MyUtil.checkNumber(stmoney);
			if(!boolhopemoney) {
				hopemoney = Integer.parseInt(stmoney);
				break;
			}
			else System.out.println("* 숫자로만 입력해 주세요.");
		} while (true);
		
		//구직자 생성
		seekerArr[JobSeeker.cnt-1] = new JobSeeker(userid,pw,name,birth,gender,adress,school,mobile,hopejob,hopemoney);
		System.out.println("--------------------------------");
		System.out.println("* "+(JobSeeker.cnt-1)+"번쨰로 구직 등록이 완료되었습니다!!");
	} //end of registJobSeeker(Scanner scan)-------------------
	
	// 입력한 아이디와 비밀번호가 같을 시 로그인 성공 여부를 반환하는 클래스
	public boolean applogin(String userid,String pw) { //userid와 password 를 입력받고 배열중 해당 아이디와 비밀번호가 일치하는 객체가있는지 반환받는다.
		for(int i=0;i<JobSeeker.cnt-1;i++) {
			if(seekerArr[i].login(userid,pw)) return true;
		}
		return false;
	}
	
	//로그인 된 구직자의 정보를 보여주는 클래스
	public void showInfo(String userid) {
		for(int i=0;i<JobSeeker.cnt-1;i++) { //배열에 저장된 구직자 정보중 현재 로그인된 아이디와 같은 객체를 찾고 정보를 반환
			if((seekerArr[i].userid).equals(userid)) {
				String info=seekerArr[i].getInfo();
				System.out.println(info); //반환된 정보 출력
			}
		}
	}
	//아이디 중복여부를 반환 해주는 클래스
	public boolean idCheck(String id) {
		for(int i=0;i<JobSeeker.cnt-1;i++) { //배열안에 이미있는 아이디라면 true를 반환.
			if((seekerArr[i].userid).equals(id)) return true;
		}return false;
	}
	//메인 메소드
	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
		JobMain jobapp = new JobMain();
		
		String select;
		
		do {
			menu();
			select = scan.nextLine();
			
			switch(select) {
			case "1": //구직자등록 
				jobapp.registJobSeeker(scan); //스캐너를 넘겨줄수 있다.
				//seekerArr[cnt-1].getInfo();
				break;
			case "2": //구인회사 로그인
				break;
			case "3": // 구직자 로그인
				System.out.print("* ID : ");
				String userid = scan.nextLine();
				System.out.print("* PW : ");
				String pw = scan.nextLine();
				if(jobapp.applogin(userid,pw)) {
					jobapp.loginflag = true;
					jobapp.logid = userid;
					System.out.println("* 로그인에 성공하셨습니다.");
				}
				else System.out.println("로그인 실패");
				break;
			case "4": //구인회사 로그인
				break;
			case "5": //로그인 했다면 나의정보보기
				if(!jobapp.loginflag) {
					System.out.println("* 로그인이 필요합니다.");
					continue;
				}
				System.out.println("--------------------------------");
				jobapp.showInfo(jobapp.logid);
				break;
			case "15": //종료
				break;
			default: 
				break;
			}//end of switch -------------------------
		} while (!"15".equals(select)); //15입력시 종료
		System.out.println("========= 프로그램 종료!! ==========");
		scan.close();
	}
}
