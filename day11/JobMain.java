package my.day11;

import java.util.Scanner;

import my.util.MyUtil;

class JobMain {
	//구직자 객체를 저장 시키는 배열
	JobSeeker[] seekerArr = new JobSeeker[10];
	JobSeeker seeker = new JobSeeker();
	boolean loginflag = false;
	String logid;
	
	//메뉴를 보여주는 메소드
	public static void menu() {
		System.out.println("- Menu -------------------------");
		System.out.println("1. 구직자 등록");
		System.out.println("2. 구인회사 등록");
		System.out.println("3. 로그인(구직자)");
		System.out.println("4. 로그인(구인회사)");
		System.out.println("5. 구직자 정보보기");
		System.out.println("15. 종료");
		System.out.println("================================");
		System.out.print(">> 메뉴 번호 선택 : ");
	}//end of menu---------------------
	//구직자 등록(생성)해주는 기능
	
	public boolean idCheck(String id) {
		for(int i=0;i<seeker.cnt-1;i++) {
			if((seekerArr[i].userid).equals(id))
				return true;
		}
		return false;
	}
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
		seekerArr[seeker.cnt-1] = new JobSeeker(userid,pw,name,birth,gender,adress,school,mobile,hopejob,hopemoney);
		System.out.println("--------------------------------");
		System.out.println("* "+(seeker.cnt-1)+"번쨰로 구직 등록이 완료되었습니다!!");
	} //end of registJobSeeker(Scanner scan)-------------------
	
	public boolean applogin(String userid,String pw) {
		for(int i=0;i<seeker.cnt-1;i++) {
			if(seekerArr[i].login(userid,pw)) return true;
		}
		return false;
	}
	public void showInfo(String userid) {
		for(int i=0;i<seeker.cnt-1;i++) {
			if((seekerArr[i].userid).equals(userid)) {
				String info=seekerArr[i].getInfo();
				System.out.println(info);
			}
		}
	}
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
			case "2": 
				break;
			case "3": 
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
			case "4": 
				break;
			case "5":
				if(!jobapp.loginflag) {
					System.out.println("* 로그인이 필요합니다.");
					continue;
				}
				System.out.println("--------------------------------");
				jobapp.showInfo(jobapp.logid);
				break;
			case "15":
				break;
			default: 
				break;
			}//end of switch -------------------------
		} while (!"15".equals(select));
		System.out.println("========= 프로그램 종료!! ==========");
		scan.close();
	}
}
