
package my.day19.sub5;

public class SyncBankBookMain {

	public static void main(String[] args) {
		SyncBankBook bank = new  SyncBankBook("443-5045-546052",10000);

		//입금 스레드 통장 1개에 가족 10명이 동시에 입금한다라고 가정
		UpMoneyRunnable[] upArr = new UpMoneyRunnable[10];
		Thread[] thrupArr = new Thread[10];
		for(int i=0;i<upArr.length;i++) {
			UpMoneyRunnable uprun = new UpMoneyRunnable(bank,1000); //bank에 1000원을 입금
			
			upArr[i] = uprun;
			thrupArr[i] = new Thread(upArr[i]);
		}
		
		//출금 스레드 통장 1개에 가족 10명이 동시에 입금한다라고 가정
		DownMoneyRunnable[] downArr = new DownMoneyRunnable[10];
		Thread[] thrdownArr = new Thread[10];
		for(int i=0;i<downArr.length;i++) {
			DownMoneyRunnable downrun = new DownMoneyRunnable(bank,1000); //bank에 1000원을 입금
			
			downArr[i] = downrun;
			thrdownArr[i] = new Thread(downArr[i]);
		}
		
		for(int i=0;i<thrupArr.length;i++) {
			thrupArr[i].start(); //10개의 입금스레드
			thrdownArr[i].start(); //10개의 입금스레드
			// !! 중요 !!
			// 아래의 join();_조인메소드가 있을 때에는 thrupArr.length(10번)을 수행하지만
			// join메소드가 없을때에는 main()스레드가 먼저 종료 될 수 도있으므로 thrupArr.length(10번)만큼 수행을 보장하지못한다.
			try {
				thrdownArr[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
