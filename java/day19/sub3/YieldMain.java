package my.day19.sub3;

public class YieldMain {

	public static void main(String[] args) {
		// Runnable 객체 생성하기
		Yield[] yiArr = new Yield[5];

		yiArr[0] = new Yield("leess","qewr1234!");
		yiArr[1] = new Yield("guest","qewr1234!");
		yiArr[2] = new Yield("eom","qewr1234!");
		yiArr[3] = new Yield("silverwo","qewr1234!");
		
		//Thread 객체 생성하기
		Thread[] thrArr = new Thread[5]; 
		thrArr[0] = new Thread(yiArr[0]);
		thrArr[1] = new Thread(yiArr[1]);
		thrArr[2] = new Thread(yiArr[2]);
		thrArr[3] = new Thread(yiArr[3]);
		
		for(int i=0;i<4;i++) {
			System.out.println("* 스레드 우선순위 : "+thrArr[i].getPriority());
			thrArr[i].run();
		}
	}

}
