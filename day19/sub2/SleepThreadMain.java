package my.day19.sub2;

public class SleepThreadMain {
	public static void main(String[] args) {
		Sleep1 sleep1 = new Sleep1();
		sleep1.setId("leess");
		sleep1.setPw("qwer1234!");
		Sleep2 sleep2 = new Sleep2();
		sleep2.setName("이순신");
		sleep2.setEmail("leess@gmail.com");

		Thread thr1 = new Thread(sleep1);
		Thread thr2 = new Thread(sleep2);
		
		System.out.println("* 스레드1의 우선순위 : "+thr1.getPriority()); 
		System.out.println("* 스레드2의 우선순위 : "+thr2.getPriority()); 

		thr1.setPriority(3);
		thr2.setPriority(7);
		System.out.println("-------------------------------");
		System.out.println("* 스레드1의 우선순위 : "+thr1.getPriority()); 
		System.out.println("* 스레드2의 우선순위 : "+thr2.getPriority()); 
		thr1.start();	
		thr2.start();
	}
}
