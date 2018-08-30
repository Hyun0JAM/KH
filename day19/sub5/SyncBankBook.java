//항상 입금이 먼저시작되고 그다음에 출금 .. 항상이런식으로 입-출-입-출 이렇게 되도록한다.
package my.day19.sub5;

public class SyncBankBook {
	private String account;
	private long balance;
	
	private boolean boolDeposit =true; 
	//입금을 먼저하기위해 초기치를true로 줌 
	//boolDeposit 값이 true이어야만 입금메소드 deposit(long money)가 작동 되도록한다
	
	private boolean boolWithdraw =false; 
	//출금은 먼저 입금된 이후에 하기위해 초기치를false로 줌 
	//boolWithdraw 값이 true이어야만 입금메소드 withdraw(long money)가 작동 되도록한다
	
	public SyncBankBook() {}
	public SyncBankBook(String account, long balance) {
		super();
		this.account = account;
		this.balance = balance;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	//동기화처리를한 입금메소드
	public synchronized void deposit(long money) {
		while(boolDeposit==false) 
	    { // boolDeposit 의 값이 true 이어야만 입금메소드 deposit(long money)이 정상작동 하도록 한다.
	      // boolDeposit 의 값이 false 이면 입금메소드 deposit(long money)는 계속해서 wait() 상태로 빠지게 만든다. 	
		   try{
		     	 wait(); // void java.lang.Object.wait() throws InterruptedException
			     /* wait()가 호출되면 스레드는 수행 권한을 포기한다.
			          이때 모니터 락을 반납한다. 그런 뒤 대기상태(waiting Pool)로 들어가는데 
			          다른 스레드가 notify(); 해줄때까지 대기상태(waiting Pool)로 들어간다. */
		      }catch(InterruptedException e){}
	    }// end of while----------------------------------

		System.out.println("---------------------------");
		balance+=money;
		System.out.println("* 계좌번호 : "+account+"\n* 입금액 : "+money+"\n* 입금 후 잔액 : "+balance);
		boolDeposit = false;
		boolWithdraw = true;//출금 허락
		notify();
		/* 대기실(waiting Pool)에 대기(wait)하고 있는 스레드  아무나 하나를 골라서 깨운다.
		 * 이어서 깨운 스레드를 Runnable한 상태로 전환 시켜준다.
		 */
	}
	//동기화처리를한 출금메소드
	public synchronized void withdraw(long money) {
		while(boolWithdraw==false) 
	    { // boolWithdraw 의 값이 true 이어야만 출금메소드 withdraw(long money)이 정상작동 하도록 한다.
	      // boolWithdraw 의 값이 false 이면 출금메소드 withdraw(long money)는 계속해서 wait() 상태로 빠지게 만든다. 	
		   try{
		     	 wait(); // void java.lang.Object.wait() throws InterruptedException
			     /* wait()가 호출되면 스레드는 수행 권한을 포기한다.
			          이때 모니터 락을 반납한다. 그런 뒤 대기상태(waiting Pool)로 들어가는데 
			          다른 스레드가 notify(); 해줄때까지 대기상태(waiting Pool)로 들어간다. */
		      }catch(InterruptedException e){}
	    }// end of while----------------------------------
		System.out.println("---------------------------");
		if(balance-money<0) {
			System.out.println("* 계좌번호 : "+account+"\n* 잔액부족!!\n* 현재잔액 : "+balance+"\n* 출금요청액 : "+money);
			boolWithdraw = false;
			boolDeposit = true;
			notify();
			return;
		}
		balance-= money;
		System.out.println("* 계좌번호 : "+account+"\n* 출금액 : "+money+"\n* 출금 후 잔액 : "+balance);
		boolWithdraw = false;
		boolDeposit = true;
		notify();
	}
}
