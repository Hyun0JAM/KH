/* [ Thread.yield() 메소드 ]
 *  - 스레드의 우선순위가 동등한 다른 스레드에게 실행기회를 넘기는 것이다.
 * 
 */
package my.day19.sub3;

public class Yield implements Runnable{
	private String id;
	private String pw;
	
	public Yield() {}
	public Yield(String id, String pw) {
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
		if("guest".equals(this.id)) {
			Thread.yield(); 
			//id가 게스트 이라면 현재 실행중인 스레드가 잠시 block되고 우선순위가 동등한 다른스레드에게 실행기회를 넘긴다.
			//Thread.yield();의 작동은 운영체제에따라 windows에서는 잘 작동되지 않을수도 있다고한다.
		}
		showInfo();
	}
	//@Override
	public void showInfo() {
		System.out.println("- Yield1 --------------");
		System.out.println("* ID : "+id+"\n* PW : "+pw+"\n");
	}
}
