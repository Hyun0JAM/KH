package my.day19.sub5;

public class DownMoneyRunnable implements Runnable {
	private SyncBankBook bankbook;
	private long downmoney;
	
	public DownMoneyRunnable() {}
	public DownMoneyRunnable(SyncBankBook bankbook,long downmoney) {
		super();
		this.bankbook = bankbook;
		this.downmoney = downmoney;
	}
	
	public SyncBankBook getBankbook() {
		return bankbook;
	}
	public void setBankbook(SyncBankBook bankbook) {
		this.bankbook = bankbook;
	}
	public long getDownmoney() {
		return downmoney;
	}
	public void setDownmoney(long downmoney) {
		this.downmoney = downmoney;
	}
	@Override
	public void run() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
			return;
		}
		bankbook.withdraw(downmoney);
		// bankbook(공유하는 특정계좌)에 돈을 입금한다.
	}// end of run-------------------
}
