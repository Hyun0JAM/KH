package my.dqy14;

public class Common {
	static int cnt=0;
	
	private String id;
	private String pw;
	private String name;
	private String email;
	
	public Common() {cnt++;}
	public Common(String id, String pw, String name, String email) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		cnt++;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Common login(String id, String pw) {
		if(this.id!=null&&this.pw!=null) {
			if(this.id.equals(id)&&this.pw.equals(pw)){
				System.out.println("* "+name+"님 환영합니다.");
				return this;
			}
			else{
				System.out.println("* 로그인 실패!!");
				return null;
			}
		}
		else{
			System.out.println("* 회원가입 먼저 진행해 주세요.");
			return null;
		}
	}
	public void showInfo() {
		System.out.println("*** 공통 "+getName()+"님의 정보 ------------");
		System.out.println("1. ID : "+getId());
		System.out.println("2. PW : "+getPw());
		System.out.println("3. 이름 : "+getName());
		System.out.println("3. 이메일 "+getEmail());
		System.out.println("");
	}
}
