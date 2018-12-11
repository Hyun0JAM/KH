package my.day18;

public class Member {
	private String id;
	private String pw;
	private String name;
	
	public Member() {}
	public Member(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
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
	public String toString() {
		return "\n1. ID : "+id+"\n2. PW : "+pw+"\n3. Name : "+name;
	}
	public void showInfo() {
		System.out.println("\n1. ID   : "+id+"\n2. PW   : "+pw+"\n3. Name : "+name);
	}
}
