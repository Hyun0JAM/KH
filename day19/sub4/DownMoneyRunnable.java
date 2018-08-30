package my.day19.sub4;

public class DownMoneyRunnable implements Runnable {
	private NosyncBankBook bankbook;
	private long downmoney;
	
	public DownMoneyRunnable() {}
	public DownMoneyRunnable(NosyncBankBook bankbook,long downmoney) {
		super();
		this.bankbook = bankbook;
		this.downmoney = downmoney;
	}
	
	public NosyncBankBook getBankbook() {
		return bankbook;
	}
	public void setBankbook(NosyncBankBook bankbook) {
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
