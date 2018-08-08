package my;

import my.util.myutil;

public class MethodTest {

	public static void main(String[] args) {
		Member.showCount();

		Member me = new Member();
		me.userid = "choihyunyoung";
		me.pwd = "qwer1234";
		me.name = "최현영";
		me.age = 25;

		Member you = new Member("irin","아이린","asdf4567",28);

		//1. 리턴타입이 없는 메소드 호출하기
		me.showInfo();
		you.showInfo();

		//2. 리턴타입이 있는 메소드 호출하기
		String info = me.returnShowInfo();
		System.out.println(info);

		info = you.returnShowInfo();
		System.out.println(info);

		//3. 리턴 타입은 없고 매개변수(인자, 파라미터)가 있는 메소드 호출
		me.changeVal("abcd1234!",35);
		info = me.returnShowInfo();
		System.out.println(info);

		//4. 리턴타입도 있고 매개변수도 있는 메소드 호출
		info = me.returnChangeVal("poiu123~",22);
		System.out.println(info);

		//******************************************************
		Member he = new Member();
		he.userid = "jeny";
		he.pwd = "jjj321@";
		he.name = "제니";
		he.age = 23;

		Member she = new Member("jam","한재민","787rty",23);

		//1. 리턴타입이 없는 메소드 호출하기
		he.showInfo();
		she.showInfo();

		//2. 리턴타입이 있는 메소드 호출하기
		info = he.returnShowInfo();
		System.out.println(info);

		info = she.returnShowInfo();
		System.out.println(info);

		//3. 리턴 타입은 없고 매개변수(인자, 파라미터)가 있는 메소드 호출
		he.changeVal("abcd1234!",35);
		info = he.returnShowInfo();
		System.out.println(info);

		//4. 리턴타입도 있고 매개변수도 있는 메소드 호출
		info = she.returnChangeVal("poiu123~",22);
		System.out.println(info);

		Member.showCount();

		myutil.currentTime();

		System.out.println("\n=== Quiz ===");
		int i = myutil.calcuration(2,5,8);
		System.out.println("계산 결과 = "+i);
	}
}
