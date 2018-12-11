package my.day19.sub5;

public class UpMoneyRunnable implements Runnable {
	private SyncBankBook bankbook;
	private long upmoney;
	
	public UpMoneyRunnable() {}
	public UpMoneyRunnable(SyncBankBook bankbook, long upmoney) {
		super();
		this.bankbook = bankbook;
		this.upmoney = upmoney;
	}
	
	public SyncBankBook getBankbook() {
		return bankbook;
	}
	public void setBankbook(SyncBankBook bankbook) {
		this.bankbook = bankbook;
	}
	public long getUpmoney() {
		return upmoney;
	}
	public void setUpmoney(long upmoney) {
		this.upmoney = upmoney;
	}
	@Override
	public void run() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
			return; // 오류 발생시 종료
		}
		bankbook.deposit(upmoney);
	} // end of run-------------------
}
