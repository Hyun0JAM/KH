package my.dqy14;

public class Student extends Common{
	private String sno;
	private String guardemail; //학부모 이메일
	private String awards;
	public String getSno() {
		return sno;
	}
	public Student() {cnt++;/*super();이 생략되어있음*/}
	public Student(String id, String pw, String name, String email,String sno, String guardemail, String awards) {
		super(id,pw,name,email);
		this.sno = sno;
		this.guardemail = guardemail;
		this.awards = awards;
		//super이 Common의 생성자를 호출하므로 카운트를 증가시킬 필요가 없다.
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getGuardemail() {
		return guardemail;
	}
	public void setGuardemail(String guardemail) {
		this.guardemail = guardemail;
	}
	public String getAwards() {
		return awards;
	}
	public void setAwards(String awards) {
		this.awards = awards;
	}
	public void showInfo() {
		System.out.println("* 학생 "+getName()+"님의 정보 --------------");
		System.out.println("1. 학번 : "+getSno());
		System.out.println("2. 성명 : "+getName());
		System.out.println("3. 이메일 "+getEmail());
		System.out.println("4. 수상경력 : "+getAwards());
		System.out.println("");
	}
	
	@Override //오버라이딩은 접근제한자도 일치시켜주어야한다. 부모랑 같거나 부모보다 접근제한자 수용범위가 더 커야한다
	public Common login(String id, String pw) {
		if(getId()!=null&&getPw()!=null) {
			if(getId().equals(id)&&getPw().equals(pw)){
				System.out.println("* 학생 "+getName()+"님 환영합니다.");
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
}
