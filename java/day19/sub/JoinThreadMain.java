package my.day19.sub;

public class JoinThreadMain {

	public static void main(String[] args) {
		Join1 join1 = new Join1();
		join1.setId("daiunii");
		join1.setPw("qwer1234!");
		Join2 join2 = new Join2();
		join2.setName("이순신");
		join2.setEmail("leess@gmail.com");
		Join3 join3 = new Join3();
		join3.setTel("010-345-6789");
		join3.setAddr("서울시 종로구");
		
		Thread thr1 = new Thread(join1);
		Thread thr2 = new Thread(join2);
		Thread thr3 = new Thread(join3);

		/* 먼저 아래의 것을 해보면 순서가 뒤죽박죽 나온다.
		 * 뒤죽박죽 결과를 확인한 후 주석문 처리를 한다.
		   thr2.start();
		   thr1.start();
		   thr3.start();*/
		/*- Join1 --------------
		  - Join2 --------------
		  - Join3 --------------
		  * Name : 이순신
		  * Email : leess@gmail.com

		  * ID : daiunii
		  * PW : qwer1234!

		  * Tel : 010-345-6789
		  * Addr : 서울시 종로구*/
		
		try {
			thr2.start();
			thr2.join(); // 스레드 thr2가 종료 될때 까지 다은 스레드들은 block이 되어진다.
					     // 종료되는 순간 다른 스레드들은 다시 동작하게 된다.
			thr1.start();
			thr1.join();
			
			thr3.start();
			thr3.join();
		} catch (InterruptedException e) { //만약 스레드가 시스템 내부적으로 join하지 못하는 오류가 발생할 경우에 일어나는 익셉션이다.
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
