package my.day19.sub;

public class Join1 implements Runnable, InterJoin {
	private String id;
	private String pw;
	
	public Join1() {}
	public Join1(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
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
	@Override
	public void run() {
		showInfo();
	}
	@Override
	public void showInfo() {
		System.out.println("- Join1 --------------");
		System.out.println("* ID : "+id+"\n* PW : "+pw+"\n");
	}
}
