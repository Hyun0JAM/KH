package my.day3;

public class ReferenceTypeTest {

	public static void main(String[] args) {
		/*참조형 타입(ReferenceType)*/

		Customer me = new Customer();
		me.userid = "suji";
		me.pw = "qwer1234";
		me.name = "수지";
		me.age=25;
		me.addr="서울시 강남구";
		System.out.println("me : "+me); //me : my.Customer@7852e922

		Customer you = new Customer();
		you.userid = "suji";
		you.pw = "qwer1234";
		you.name = "수지";
		you.age=25;
		you.addr="서울시 강남구";
		System.out.println("you : "+you); //you : my.Customer@4e25154f 메모리상의 주소

		System.out.println("\n======= 데이터 변경전 =======\n");
		//me=you;
		boolean bool = (me==you);
		System.out.println("bool : "+bool);
		me.showInfo();
		you.showInfo();

		System.out.println("\n======= 데이터 변경후 =======\n");
		me.setUserid("choi");
		me.setPw("qwer1234");
		me.setName("최현영");
		me.setAge(22);
		me.setAddr("강북구 수유동");
		me.showInfo();

		you.setUserid("leess");
		you.setPw("asd456");
		you.setName("누구");
		you.setAge(33);
		you.setAddr("서울시 성북구");
		you.showInfo();
	}

}
