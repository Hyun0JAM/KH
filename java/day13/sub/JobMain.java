package my.day13.sub;

import java.util.Scanner;
import my.util.MyUtil;

class JobMain {
	//구직자 객체를 저장 시키는 배열
	Common[] comArr = new Common[100];
	Recruit[] recruitArr = new Recruit[100];
	
	boolean loginflag = false; //로그인된 상태인지 저장해두는 플래그
	boolean adminlogin = false;
	
	//메뉴를 보여주는 메소드
	public static void menu() {
		System.out.println("- Main Menu --------------------");
		System.out.println("1. 구직자 등록"); //
		System.out.println("2. 구인회사 등록");//
		System.out.println("3. 로그인(구직자)"); //
		System.out.println("4. 로그인(구인회사)"); //
		System.out.println("5. 로그인 관리자"); //
		System.out.println("15. 종료");//
		System.out.println("================================");
		System.out.print(">> 메뉴 번호 선택 : ");
	}//end of menu---------------------
	
	//구직자 메뉴
	public static void jobSeekerMenu() {
		System.out.println("- JobSeeker Menu ---------------");
		System.out.println("1. 나의 정보 조회"); //
		System.out.println("2. 나의 정보 변경"); //
		System.out.println("3. 모든 채용공고 조회"); 
		System.out.println("4. 구인회사 ID검색"); 
		System.out.println("5. 특정 업종 채용공고"); 
		System.out.println("6. 로그아웃"); //
		System.out.println("7. 회원탈퇴"); //
		System.out.println("================================");
		System.out.print(">> 메뉴 번호 선택 : ");
	}
	
	//구인회사 메뉴
	public static void CompanyMenu() {
		System.out.println("- Company Menu ---------------");
		System.out.println("1. 우리회사 정보조회"); //
		System.out.println("2. 우리회사 정보 변경"); //
		System.out.println("3. 모든 구직자 정보 조회"); //
		System.out.println("4. 특정 구직자 아이디 검색"); //
		System.out.println("5. 채용공고 하기"); 
		System.out.println("6. 로그아웃"); //
		System.out.println("7. 회원탈퇴"); //
		System.out.println("================================");
		System.out.print(">> 메뉴 번호 선택 : ");
	}
	
	//관리자로 로그인 했을시 보여주는 메뉴
	public static void adminMenu() {
		System.out.println("- Admin Menu -------------------");
		System.out.println("1. 모든 구직자 정보 출력"); //
		System.out.println("2. 모든 회사 정보 출력");
		System.out.println("3. 특정 구직자 삭제"); //
		System.out.println("4. 특정 회사 삭제"); //
		System.out.println("5. 관리자 로그아웃"); //
		System.out.println("================================");
		System.out.print(">> 메뉴 번호 선택 : ");
	}
	// 메인메뉴 1번. 구직자 등록(생성)해주는 기능
	public void regist(String no,Scanner scan) {
		String id="";
		String pw="";
		String name="";
		String birth="";
		int    gender=0;
		String adress="";
		String school="";
		String tel="";
		String hopejob="";
		int    hopemoney=0;
		String ceo="";
		long seedmoney=0;
		String jobtype="";
		
		boolean boolid = false;
		boolean boolPw = false;
		boolean boolBirth = false;
		boolean boolNumber = false;
		boolean boolhopemoney = false;
		
		System.out.println("--------------------------------");
		
		//1. 아이디값 입력받기
		do {
			System.out.print("* ID : ");
			id=scan.nextLine();
			boolid = id.trim().isEmpty();
			//bool이 참인 경우는 user id가 공백만 있거나 또는 비었을경우
			
			if(boolid)  //앞뒤에 공백이있다면 제거하고 비었는지 확인
				System.out.println("* 아이디는 공백만으로 사용 불가합니다.");
			else if(idCheck(id)) { //중복아이디 검사
				System.out.println("* 아이디가 중복 되었습니다.");
			}
			else break;
		} while (boolid||idCheck(id));
		
		//2. 암호 입력받기
		do {
			System.out.print("* 암호 : ");
			pw = scan.nextLine();
			boolPw = MyUtil.checkPassword(pw);
			pw = pw.substring(pw.length()-1,pw.length())+pw.substring(1,pw.length()-1)+pw.substring(0, 1);
			
			if(boolPw) break;
		} while (true);
		
		//3. 이름 입력받기
		do {
			System.out.print("* 이름 : ");
			name = scan.nextLine();
			
			if(name.trim().isEmpty()) 
				System.out.println("* 이름은 공백만으로 사용 불가합니다.");
			else break;
		} while (name.trim().isEmpty());
		
		//4.생년월일 입력받기
		if("1".equals(no)) {
			do {
				System.out.print("* 생일 (ex.19941116): ");
				birth = scan.nextLine();
				
				boolBirth = MyUtil.checkNumber(birth);
				if(boolBirth) System.out.println("* 생년월일은 숫자로만 입력 가능합니다.");
				else if(birth.length()!=8) System.out.println("* 8자리의 숫자로 입력 해주세요.");
				else break;
			} while (true);
			
			//5. 성별 입력 받기
			do {
				try {
					System.out.print("* 성별 (1:남자/2:여자): ");
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
		}
		//6. 주소 입력받기
		do {
			System.out.print("* 주소 : ");
			adress = scan.nextLine();
			if(!adress.trim().isEmpty())break;
			else System.out.println("* 주소를 입력해주세요.");
		} while (true);
		if("1".equals(no)) {
			//7. 학력 입력받기
			do {
				System.out.print("* 학력(대졸이상=1,초대졸=2,고졸=3,고졸미만=4) : ");
				school = scan.nextLine();
				
				if("1".equals(school)||"2".equals(school)||"3".equals(school)||"4".equals(school))
					break;
				else System.out.println("* 1~4사이의 값을 입력해 주세요.");
			} while (true);
		}
		//8. 연락처입력받기
		do {
			System.out.print("* 연락처 : ");
			tel = scan.nextLine();
			boolNumber = MyUtil.checkNumber(tel);
			
			if(tel.length()>11||tel.length()<10) System.out.println("* 11~10자리의 숫자로만 입력해주세요");
			else if(boolNumber) System.out.println("* 숫자로만 입력해 주세요.");
			else break;
		} while (true);
		if("1".equals(no)) {
			//9. 희망직종 입력받기
			do {
				System.out.print("* 희망 직종 : ");
				hopejob = scan.nextLine();
				
				if(hopejob.trim().isEmpty()) 
					System.out.println("* 공백을 제외한 희망 직종을 입력해주세요.");
				else break;
			} while (true);
			
			//10. 희망연봉 입력받기
			do {
				System.out.print("* 희망 연봉 (단위 _ 만원): ");
				String stmoney = scan.nextLine();
				
				boolhopemoney = MyUtil.checkNumber(stmoney);
				if(!boolhopemoney) {
					hopemoney = Integer.parseInt(stmoney);
					break;
				}
				else System.out.println("* 숫자로만 입력해 주세요.");
			} while (true);
		}
		else if("2".equals(no)) {

			System.out.print("* CEO : ");
			ceo = scan.nextLine();
			
			System.out.print("* 자본금 : ");
			seedmoney = Integer.parseInt(scan.nextLine());
			
			System.out.print("* 직종 : ");
			jobtype = scan.nextLine();
				
		}
		//구직자로 회원가입 여부를 물어본다
		System.out.print(">> 회원 가입 여부 확인(1:Yes 2:No) : ");
		String yn = scan.nextLine();
		//구직자 생성
		if(!"1".equals(yn)) System.out.println("* 회원가입이 취소 되었습니다.;");
		else if("1".equals(yn)&&Common.cnt>=comArr.length) {
			System.out.println("* 정원이 초과했으므로 구직자 회원가입이 불가합니다.");
		}
		else {
			if("1".equals(no)) comArr[Common.cnt] = new JobSeeker(id,pw,name,adress,tel,birth,gender,school,hopejob,hopemoney);
			else if("2".equals(no)) comArr[Common.cnt] = new Company(id,pw,name,adress,tel,ceo,seedmoney,jobtype);
			System.out.println("--------------------------------");
			System.out.println("* "+(Common.cnt)+"번쨰로 회원 가입이 완료되었습니다!!");
		}
	} //end of registJobSeeker(Scanner scan)-------------------
	
	//아이디 중복여부를 반환 해주는 클래스
	public boolean idCheck(String id) {
		for(int i=0;i<Common.cnt;i++) { //배열안에 이미있는 아이디라면 true를 반환.
			if(comArr[i] instanceof JobSeeker &&(comArr[i].getId()).equals(id)) return true;
		}return false;
	}
	// 메인 메뉴 3번. 로그인을 해주는 메소드 생성
	public JobSeeker seekerLogin(Scanner scan) {
		JobSeeker jobseeker = null;
		System.out.println("--------------------------------");
		System.out.print("* 아이디 : ");
		String id = scan.nextLine();
		System.out.print("* 암호 : ");
		String pw = scan.nextLine();
		for(int i=0;i<Common.cnt;i++) {
			if(comArr[i] instanceof JobSeeker)
				jobseeker = (JobSeeker) comArr[i].login(id, pw);
			if(jobseeker != null) break;
		}
		return jobseeker;
	}
	
	//메인 메뉴 4번 구인회사 로그인 메소드
	public Company companyLogin(Scanner scan) {
		Company com = null;
		System.out.println("--------------------------------");
		System.out.print("* 아이디 : ");
		String id = scan.nextLine();
		System.out.print("* 암호 : ");
		String pw = scan.nextLine();
		for(int i=0;i<Common.cnt;i++) {
			if(comArr[i] instanceof Company)
				com = (Company) comArr[i].login(id, pw);
			if(com != null) break;
		}
		return com;
	}
	
	//정보변경
	public void changeInfo(Common cs,Scanner sc) {
		System.out.print("* 변경 할 비밀번호 : ");
		String pw = sc.nextLine();
		cs.setPw(pw);

		System.out.print("* 변경 할 주소 : ");
		String adress = sc.nextLine();
		cs.setAdress(adress);
		
		System.out.print("* 변경 할 연락처 : ");
		String tel = sc.nextLine();
		cs.setTel(tel);
		
		System.out.println("* 변경이 완료되었습니다.");
	}
	
	//관리자가 모든정보를 보게함
	public void showAllInfo() {
		if(Common.cnt==0) System.out.println("* 등록된 정보가 없습니다.");
		for(int i=0;i<Common.cnt;i++) {
			if(comArr[i] instanceof JobSeeker)
				System.out.println("--------------------------------");
				System.out.println("* "+(i+1)+"번째 구직자 "+((JobSeeker)comArr[i]).getSeekerInfo()); //형변환후 콤마 찍으면 변환된 오프젝트의 함수들이 나온다.
		}
	}
	//
	public void showAllComInfo() {
		if(Common.cnt==0) System.out.println("* 등록된 정보가 없습니다.");
		for(int i=0;i<Common.cnt;i++) {
			if(comArr[i] instanceof Company)
				System.out.println("--------------------------------");
				System.out.println("* "+(i+1)+"번째 구직자 "+((Company)comArr[i]).getCompanyInfo());
		}
	}
	//구직자 정보삭제
	public void delInfo(String id) {
		int cut =0;
		if(Common.cnt==0) System.out.println("* 등록된 정보가 없습니다.");
		for(int i=0;i<Common.cnt;i++) {
			if((comArr[i].getName()).equals(id)) {
				cut=i;
				System.out.println("* "+comArr[i].getName()+"님의 정보가 삭제 되었습니다.\n* 구직자가 "+(Common.cnt-1)+"만큼 남았습니다.");
				if(cut<Common.cnt) {
					for(int j=cut;j<Common.cnt;j++) {
						comArr[i]=null;
						comArr[j]=comArr[j+1];
						comArr[Common.cnt]=null;
						Common.cnt-=1;
					}
				}
			}
		}
	}
	//구인회사 메뉴번호4. 특정 아이디 검색
	public void seachInfo(String id) {
		for(int i=0;i<Common.cnt;i++) {
			if((comArr[i].getId()).equals(id)) {
				System.out.println(((JobSeeker)comArr[i]).getSeekerInfo());
			}
		}
	}
	// 구인회사 5번. 채용공고하기
	public void guin(Company com, Scanner sc) {
		
		System.out.print("* 채용 성별[1.남자 2.여자] : ");
		String gender = sc.nextLine();
		System.out.print("* 채용 최소 나이 : ");
		String minage = sc.nextLine();
		System.out.print("* 채용 최대 나이 : ");
		String maxage = sc.nextLine();
		System.out.print("* 채용 학력[1.대졸이상 2.초대졸 3.고졸이상 4.고졸미만] : ");
		String school = sc.nextLine();
		
		if(Recruit.cnt==recruitArr.length){
			Recruit rcu = new Recruit();
			rcu.setCom(com);
			rcu.setGender(gender);
			rcu.setMinage(Integer.parseInt(minage));
			rcu.setMaxage(Integer.parseInt(maxage));
			rcu.setSchool(school);
			
			recruitArr[Recruit.cnt] = rcu;
			System.out.println("* 등록하신 채용 공고 결과화면");
			System.out.println(rcu.getRecruitInfo());
		}
		else System.out.println("* 채용공고 최대치를 초과하였습니다.");
	}
	public void showAllRecruit() {
		if(Recruit.cnt==0) System.out.println("* 채용 공고가 없습니다.");
		for(int i=0;i<Recruit.cnt;i++) {
			System.out.println(recruitArr[i].getCom().getCompanyInfo()+recruitArr[i].getRecruitInfo());
		}
	}
	public void searchCompany(String id) {
		for(int i=0; i<Common.cnt;i++) {
			if(comArr[i].getId().equals(id)) {
				System.out.println(((Company)comArr[i]).getCompanyInfo());
			}
		}
	}
	public void searchJobType(String type) {
		for(int i=0;i<Recruit.cnt;i++) {
			if(recruitArr[i].getCom().getJobtype().equals(type)){
				System.out.println(recruitArr[i].getRecruitInfo());
			}
		}
	}
	
	//메인 메소드
	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
		JobMain jobapp = new JobMain();
		
		String startMenuNo;
		
		do {
			menu();
			startMenuNo = scan.nextLine();
			
			switch(startMenuNo) {
			case "1": //구직자등록 
				jobapp.regist(startMenuNo,scan); //스캐너를 넘겨줄수 있다.
				break;
			case "2": //구인회사 로그인
				jobapp.regist(startMenuNo,scan);
				break;
			case "3": // 구직자 로그인
				JobSeeker loginseeker = jobapp.seekerLogin(scan);
				
				if(loginseeker!=null) {
					do {//구직자 메뉴 보여주기
						JobMain.jobSeekerMenu();
						String seekerMenuNo = scan.nextLine();
						boolean isBreak =false;
						
						switch(seekerMenuNo) {
						case "1": //내정보조회
							System.out.println("--------------------------------");
							System.out.println(loginseeker.getSeekerInfo());
							break;
						case "2":// 내정보변경
							jobapp.changeInfo(loginseeker,scan);
							break;
						case "3": //모든 채용공고 조회 
							jobapp.showAllRecruit();
							break;
						case "4": //구인회사 아이디검색
							System.out.println("* 구인회사 ID : ");
							String id = scan.nextLine();
							jobapp.searchCompany(id);
							break;
						case "5": //특정직업 채용공고
							System.out.println("* 직 종 : ");
							String type = scan.nextLine();
							jobapp.searchJobType(type);
							break;
						case "6": //로그아웃
							isBreak =true;
							loginseeker=null;
							break;
						case "7": //회원탈퇴
							jobapp.delInfo(loginseeker.getName());
							isBreak =true;
							break;
						default : break;
						}
						if(isBreak)
							break;
					} while (true);
					
				}
			case "4": //구인회사 로그인
				Company logincom = jobapp.companyLogin(scan);
				
				if(logincom!=null) {
					do {//구직자 메뉴 보여주기
						JobMain.CompanyMenu();
						String comMenuNo = scan.nextLine();
						boolean isBreak =false;
						
						switch(comMenuNo) {
						case "1": //우리회사 정보보기
							System.out.println("--------------------------------");
							System.out.println(logincom.getCompanyInfo());
							break;
						case "2": //우리회사 정보변경
							jobapp.changeInfo(logincom, scan);
							break;
						case "3": //구직자 정보 모두 보기
							jobapp.showAllInfo();
							break;
						case "4": //특정 구직자 검색하기
							System.out.println("* 구직자 ID : ");
							String id = scan.nextLine();
							jobapp.seachInfo(id);
							break;
						case "5": //채용공고하기
							jobapp.guin(logincom,scan);
							break;
						case "6": //로그아웃
							isBreak =true;
							loginseeker=null;
							break;
						case "7": //회원탈퇴
							jobapp.delInfo(logincom.getId());
							isBreak =true;
							break;
						default : break;
						}
						if(isBreak) break;
					} while (true);
					
				}
				break;
			case "5":
				String adminMenuNo="";
				do {
					System.out.println("- 관리자 로그인  ------------------");
					System.out.print("1. ID : ");
					String id = scan.nextLine();
					System.out.print("2. PW : ");
					String pw = scan.nextLine();
					if(!("admin".equals(id)&&"1234".equals(pw))) 
						System.out.println("* 로그인 실패!! ");
					else{
						do {
							JobMain.adminMenu();
							adminMenuNo=scan.nextLine();
							switch(adminMenuNo) {
							case "1":
								jobapp.showAllInfo();
								break;
							case "2": 
								jobapp.showAllComInfo();
								break;
							case "3": 
								System.out.print("* 삭제 할 구직자 이름 : ");
								String delName = scan.nextLine();
								jobapp.delInfo(delName);
								break;
							case "4": 
								System.out.print("* 삭제 할 회사 이름 : ");
								String delcom = scan.nextLine();
								jobapp.delInfo(delcom);
								break;
							case "5": 
								
								break;
							default: 
								System.out.println("* 1~5사이의 숫자로 입력해주세요. ");
								break;
							}
						} while (!("5".equals(adminMenuNo)));
					System.out.println("* 관리자 로그아웃 완료!!");
					}
				} while (!("5".equals(adminMenuNo)));
				break;
			case "15": //종료
				break;
			default: 
				break;
			}//end of switch -------------------------
		} while (!"15".equals(startMenuNo)); //15입력시 종료
		System.out.println("========= 프로그램 종료!! ==========");
		scan.close();
	}
}
