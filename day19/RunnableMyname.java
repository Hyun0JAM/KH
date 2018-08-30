package my.day19;

public class RunnableMyname extends Parent implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println("당신은 누구세요?");
			super.goodmorning();
		}
	}
}
