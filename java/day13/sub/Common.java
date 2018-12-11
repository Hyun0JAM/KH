package my.day13.sub;

//공통 클래스 추상화 작업
public class Common{ //가장 상위클래스 Object클래스는 기본적으로 제공된다.
	
	private String userid; //아이디
	private String pw; //비밀번호
	private String name; //구직자명 또는 회사명
	private String adress;
	private String tel; // 휴대폰번호
	
	static int cnt =0; // 생성된 객체 갯수
	
	public Common() {}
	
	public Common(String userid, String pw, String name, String adress, String tel) {
		super();
		this.userid = userid;
		this.pw = pw;
		this.name = name;
		this.adress = adress;
		this.tel = tel;
		
		setPw(this.pw);
	}
	public String getId() {
		return userid;
	}

	public void setId(String userid) {
		this.userid = userid;
	}

	public String getPw() {
		if(pw!=null) return pw.substring(0, 4)+"***"+pw.substring(7);
		return pw;
	}

	public void setPw(String pw) { //qwer1234!로 입력 >> 간단하게 위치를 바꿔 암호화 시킴(나중에 따로 메소드사용)
		if(pw!=null&&!pw.trim().isEmpty()) {
			this.pw = pw.substring(pw.length()-1,pw.length())+pw.substring(1,pw.length()-1)+pw.substring(0, 1);
		}	
		else { 
			System.out.println("사용할 수 없는 암호입니다.");
			this.pw="";
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	//휴대폰 번호에 하이픈'-'을 붙여서 반환
	public String getTel() {
		String str;
		if(tel.length()==11)
			str = tel.substring(0, 3)+"-"+tel.substring(3, 7)+"-"+tel.substring(7);
		else str = tel.substring(0, 3)+"-"+tel.substring(3, 6)+"-"+tel.substring(6);
		return str;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	//구직자 또는 구인회사가 로그인 할 수 있는 기능
	public Common login(String userid, String pw) { //static을 써버리면 인스턴스변수와 비교불가
		if(userid.equals(this.userid)&&pw.equals(this.pw)) { //반환타입을 jobseeker로
			System.out.println("* 로그인 성공!!");
			return this;
		}
		else {
			System.out.println("* 로그인 실패..");
			return null;
		}
	}
	//구직자나 구인회사의 기본정보를 알려주는 메소드 생성하기
	public String commonInfo() {
		String info="";
		info= "* 아이디 : "+userid+"\n"+
			"* 암 호 : "+getPw()+"\n"+
			"* 이 름 : "+name+"\n"+
			"* 주 소 : "+adress+"\n"+
			"* 연락처 : "+getTel()+"\n";
		return info;
	}
	
}
