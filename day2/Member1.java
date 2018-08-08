public class Member1
{
	String id;//아이디 (문자열)
	String pw;//암호 (문자열)
	String name;//성명 (문자열)
	int age;//나이 (정수형)
	String adress;//주소 (문자열)

	/*
	# java에서 '()'는 2가지만 존재한다.
		1.메소드(method)
		2.생성자(contributor)

	# 생성자란?
		- 객체를 생성( 클래스명 객체변수명 = new 클래스명(); )할 때 마다
		  자동적으로 호출되어져 실행되어지는 어떠한 행위를 기술한 것이라고 생각하면 된다.

	# 생성자(constructor)의 지켜야할 규칙
		1.생성자의 이름은 반드시 클래스명과 같아야된다.
		2.생성자는 반환타입(return)을 기술하면 안된다.
		3.생성자의 주된 역할은 일반적으로 멤버변수(인스턴스변수,클래스변수_static)의 초기화를 하고자 하는데 있다.

	*/
	public Member1(){  //클래스명으로 생성된것은 생성자, 다른이름으로 생성된것은 함수(메소드)로 구분된다.
		System.out.println("Member1()의 생성자를 호출했습니다.\n");
	}
	public Member1(String id,String pw,String name,int age,String adress){
		id=this.id; //멤버변수의 이름과 지역변수의 이름은 동일하다. 지역변수의 이름이 우선한다.
		pw=this.pw; //this 생성되어지는 객체를 말한다.
		name=this.name; //그래서 멤버변수명과 지역변수명이 동일할 경우 구분짓기 위한 방법이
		age=this.age;  //this.멤버변수명 으로 구분짓는다
		adress=this.adress;
	}
	public void showInfo(){
		System.out.println("==========================");
		System.out.println(" 1. 이름 : "+this.id);
		System.out.println(" 2. 암호 : "+this.pw);
		System.out.println(" 3. 이름 : "+this.name);
		System.out.println(" 4. 나이 : "+this.age);
		System.out.println(" 5. 주소 : "+this.adress);
		System.out.println("==========================");
	}
}
