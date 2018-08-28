package my.day17;

import my.util.MyUtil;

public class Member {
	private String id;
	private String pw;
	private String name;
	
	public Member() {}
	public Member(String id, String pw, String name) throws UserDefineExceptionID, UserDefineExceptionPW {
		super();
		setId(id);
		setPw(pw);
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) throws UserDefineExceptionID {
		if(id==null||id.length()<5)
			throw new UserDefineExceptionID();
		else if("admin".equals(id)||"superman".equals(id)) 
			throw new UserDefineExceptionID("* id로 admin,superman은 사용불가한 아이디입니다.");
		else this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) throws UserDefineExceptionPW{
		if(!MyUtil.checkPassword(pw)) throw new UserDefineExceptionPW();
		else this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
