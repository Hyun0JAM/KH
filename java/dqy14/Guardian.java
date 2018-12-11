package my.dqy14;

public class Guardian extends Common{
	private String jobtyoe; //직업군
	private String of_tel; //근무지 연락처
	
	public Guardian() {cnt++;}
	public Guardian(String id, String pw, String name, String email,String jobtyoe, String of_tel) {
		super(id,pw,name,email);
		this.jobtyoe = jobtyoe;
		this.of_tel = of_tel;
		//super이 Common의 생성자를 호출하므로 카운트를 증가시킬 필요가 없다.
	}
	public String getJobtyoe() {
		return jobtyoe;
	}
	public void setJobtyoe(String jobtyoe) {
		this.jobtyoe = jobtyoe;
	}
	public String getOf_tel() {
		return of_tel;
	}
	public void setOf_tel(String of_tel) {
		this.of_tel = of_tel;
	}
	//메소드의 오버라이딩(재정의) - 다형성에 포함된다.
	@Override
	public void showInfo() {
		System.out.println("* 학부모 "+getName()+"님의 정보 -------------");
		System.out.println("1. 성명 : "+getName());
		System.out.println("2. 이메일 : "+getEmail());
		System.out.println("3. 직업 : "+getJobtyoe());
		System.out.println("4. 회사번호 : "+of_tel);
		System.out.println("");
	}
}
