package my.day19.sub2;

public class Sleep2 implements Runnable,InterSleep{
	private String name;
	private String email;
	
	public Sleep2() {}
	public Sleep2(String name, String email) {
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
		try {
			Thread.sleep(2000);
			//Thread.sleep(밀리초)
			//500밀리초(0.5)초 동안만 자신의 스레드가 block하도록 한다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		showInfo();
	}
	@Override
	public void showInfo() {
		System.out.println("- Sleep2 --------------");
		System.out.println("* Name : "+name+"\n* Email : "+email+"\n");
		
	}
}
