/*
	=== 변수의 종류 ===
	1.멤버변수(member변수)
		a. 클래스변수(= static)
		b. 인스턴스변수(= non static)
		
		--멤버변수가 사용되어지는 범위는 해당 클래스 내에서 어디서나 사용가능하다.
		--멤버변수가 선언되어지는 위치는 일반적으로 해당 클래스명 바로 아래에 선언한다.
		--변수 선언후 값을 부여(= 변수의 초기화)하지 않더라도 멤버변수는 자동적으로 자바가상머신이 기본값을 부여해 준다.
		
		정수형(byte, short, int, long)타입은 기본값이 0으로 초기화되고
		실수형(double,float)타입은 기본값이 0.0으로 초기화된다.
		문자형(char)타입은 기본값이 공백(space)' ' 으로 초기화 되고
		Object 타입은 기본값이 null(존재하지 않는것 = 없다)로 초기화된다.
		
		클래스변수(Static변수)에 접근하기 위해서는 객체(Object)를 생성하지 않고도 바로 '클래스명.클래스변수'로 접근한다. 
		클래스변수는 해당 클래스로 생성되어진 객체들이 공유해서 사용한다.
		
		인스턴스변수(non Static변수)에 접근을 하기 위해서는 반드시 객체를 생성한후 '객체명.인스턴스' 변수로 접근한다.
		인스턴스 변수는 해당객체에서만 사용하는것이다.
		
		클래스변수는 클래스가 실행되어질때 생성되어지고, 인스턴스변수는 객체를 만들대 생성되어진다.
		
		해당 프로그램이 종료되면 클래스변수와 인스턴스변수는 더이상 쓸모없는 쓰래기가 되므로 
		자바가상머신의 garbege collecter가 작동하여 자동적으로 메모리에서 소멸시켜준다
	
		2. 지역변수(Local 변수) : 사용되어지는 범위는 지역변수가 생성된 '{ ... }'내에서만 사용가능하다.
		지역변수는 선언되어진 괄호안을 벗어나면 자동적으로 소멸한다.
		지연변수는 특정 메소드에서나 생성자(instructor)내에서 선언되어지는 것이다.
		지역변수는 반드시 초기화 해주어야만 한다.
*/
//import java.lang.*;

public class Variable  
{
	int a=10; //여기서 '='는 같다가 아니라 어떤 값을 대입한다는 뜻이다.(대입연산자)/명시적초기화
	int b;
	static int c;
	String adress;
	String name;
	String userid;
	String password;

	public static void main(String[] args) 
	{
		Variable myobj = new Variable();
		//myobj를 클래스 Variable의 객체변수(인스턴스_instance)라고 부른다.
		//'new Variable'를 객체생성이라고 하고 인스턴스화 한다고 한다.

		System.out.println("a : " + myobj.a);
		//a : 10
		//"문자열" + 변수명 에서는 더하기가 아니라 문자열 결합을 뜻한다.
		//"문자열" + 10 은 "문자열 10"으로 나온다. 
		System.out.println("b : " + myobj.b); 

		System.out.println("name : " + myobj.name);

		System.out.println("-----------------멤버변수---------------");

		Variable me= new Variable();
		Variable you= new Variable();
	
		me.name="최현영";
		me.userid="daiunii";
		me.password="qwer1234";
		me.adress="강북구 수유동"; //모두 같이 쓰는변수 static선언 했을시 다 같이 변경됨

		you.name="서영학";
		you.userid="yourid";
		you.password="adsf0070";
		
		System.out.println("\n========= 객체 'me'의 정보 =========\n");
		System.out.println("이름 : " + me.name);
		System.out.println("ID : " + me.userid);
		System.out.println("PW : " + me.password);

		System.out.println("\n========= 객체 'you'의 정보 ========\n");
		System.out.println("이름 : " + you.name);
		System.out.println("ID : " + you.userid);
		System.out.println("PW : " + you.password);

		System.out.println("c : " +c);  //비추
		//System.out.println("c : " +myobj.c);  //비추
		System.out.println("c : " +Variable.c);  //권장

		//System.out.println("adress : " +adress);
		//System.out.println("adress : " +Variable.adress); //권장

		me.password="1234";

		System.out.println("\n========= 객체 'me'의 정보 =========\n");
		System.out.println("이름 : " + me.name);
		System.out.println("ID : " + me.userid);
		System.out.println("PW : " + me.password);
		System.out.println("PW : " + me.adress);
		System.out.println("\n========= 객체 'you'의 정보 ========\n");
		System.out.println("이름 : " + you.name);
		System.out.println("ID : " + you.userid);
		System.out.println("PW : " + you.password);
		System.out.println("PW : " + you.adress);

		System.out.println(" -----------------지역변수---------------");

		int d;
		d = 0;

		int e=0;

		System.out.println("d : " + d); //반드시 초기화를 해주어야 한다.
		System.out.println("e : " + e); 

	}
	
	/*d=10;
	e=50;    지역변수는 해당 괄호를 벗어나면 자동으로 소멸되어지므로 오류!!*/
}
