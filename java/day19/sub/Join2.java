package my.day19.sub;

public class Join2 implements Runnable, InterJoin {
	private String name;
	private String email;
	
	public Join2() {}
	public Join2(String name, String email) {
		super();
		this.name = name;
		this.email = email;
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
	@Override
	public void run() {
		showInfo();
	}
	@Override
	public void showInfo() {
		System.out.println("- Join2 --------------");
		System.out.println("* Name : "+name+"\n* Email : "+email+"\n");
		
	}
}
