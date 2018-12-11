
package my.day19.sub4;

public class NosyncBankBookMain {

	public static void main(String[] args) {
		NosyncBankBook bank = new  NosyncBankBook("443-5045-546052",10000);

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
		}
	}
}
