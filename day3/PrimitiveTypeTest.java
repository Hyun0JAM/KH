/*
     === *** 자료형 *** ===

            ※ 자료형의 종류
     1. 원시형 타입(primitive Type)
       1.1 정수형(byte, short, int, long)
          -- byte(8bit == 1byte) : -2^7 ~ 2^7 - 1
                                   -128 ~ 127

          -- short(16bit == 2byte) : -2^15 ~ 2^15 - 1
                                     -32,768 ~ 32,767

          -- int(32bit == 4byte) : -2^31 ~ 2^31 - 1
                        기본은 int 이다.        -2,147,483,648 ~ 2,147,483,647

          -- long(64bit == 8byte) : -2^63 ~ 2^63 - 1
                                   -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807

       1.2 실수형(float, double)
          1. float : 4byte  단정밀도. 소수점이하 7자리 까지 표현.
          2. double : 8byte 배정밀도. 소수점이하 15~16자리 까지 표현.
             자바에서 실수의 기본타입은 double 이다.


       1.3 문자형(char)
       char : 자바는 유니코드 체계를 사용하므로
                         문자형 타입인 char 은 2byte 이며, 범위는 0~65535 이다.

       UNICODE 표 참조
       http://www.tamasoft.co.jp/en/general-info/unicode.html


       1.4  참(true) 또는 거짓(false)을 담아주는 타입인 boolean
       -- boolean 타입은 true, false 를 가진다.
                  자바의 논리형인 boolean 은 1, 0 으로 호환되지 않으며
                  형변환도 할 수 없다.
 */
package my;

public class PrimitiveTypeTest {
	public PrimitiveTypeTest() {	}

	public static void main(String[] args) {
		byte bt1 =10; //byte -128~127
		//byte bt2 =200; 표현가능한 범위를 넘었으므로 오류

		short st=20000; //short -32,768 ~32,767
		//short st2=40000;

		int i=500000000; // int -2,147,483,648 ~ 2,147,483,647
		//int i2=10000000000;

		long ln = 10000000000L; // long 타입은 끝에 L을 붙여야 long type으로 인식된다.

		////////////////////////////////////

		int a =9; //10진수 (0~9)
		System.out.println("10진수 9 = "+a);

		a=011; //8진수(0~7) 정수 맨앞에 접두사로 0 을 붙이면 8진수로 인식한다.
		System.out.println("8진수 011 = "+a); //8진수 011 = 9

		a=0x11; //16진수(0~9,a~f) 정수 맨앞에 접두사로 0x응 붙이면 16진수로 인식한다.
		System.out.println("16진수 0x11 = "+a); // 16진수 0x11 = 17


		System.out.println("\n-------- printf알아보기 -------\n");
		int b =30;
		System.out.printf("10진수 %d / 8진수 %o / 16진수 %x",b,b,b);

		System.out.println("\n----------------------------\n");
		a=5; b=2;
		System.out.println("a/b = "+ (a/b)); // 정수/정수=정수(몫)

		double c=5.0;
		System.out.println("c/b = "+(c/b));
		//정수/실수=실수
		//실수/실수=실수
		//실수/정수=실수 -- 실수가 하나라도 포함된다면 실수값

		System.out.println("a%b = "+(a%b));
		//정수 1을 정수 2로 나눈 나머지값

		System.out.println("\n----------- 실수형 -----------\n");
		double db1=32.123456789;
		System.out.println("db1 = "+db1);

		float ft1=32.1234F; //기본적으로 double로 인식되기 때문에 F를 붙여 float으로 인식 시킨다.
		System.out.println("ft1 = "+ft1);

		ft1=32.123456789F;
		System.out.println("ft1 = "+ft1);

		//자바는 실수의 기본타입이 double이므로 float형태로 나타내기 위해서는 숫자 뒤에 F나f를 붙여야 한다.

		System.out.println("\n=========== 문자형 ===========\n");

		char ch = '\u0041';
		System.out.println("ch : "+ch);

		ch = '\u0061';
		System.out.println("ch : "+ch);

		ch = '\u314A';
		System.out.println("ch : "+ch);

		System.out.println("\n-----------------------------\n");
		ch = 65;

		/*
		 * 기억합시다.
		 * int 아래크기인 byte,short,char타입이 사칙연산 +-/*울 만나는 순간 자동적으로 int 타입으로 자동영변환이 일어난다.
		 * */

		ch='a';
		System.out.println("ch : "+ch);
		for(int x=0;x<10;x++) {
			ch++;
			System.out.println("ch : "+ch);
		}
		// 'A' = 65 'a' = 97 / 대문자 +32 = 소문자 / ex)'A'+32=a

		System.out.println("\n===========퀴즈==========\n");
		System.out.println((char)('A'+0));
		//65 / (char) A
		System.out.println((char)('0'+0));
		//48 / (char) 0
		System.out.println((char)('A'+32));
		//97 / (char) a

		//'(자료형_dataType)값_value' 값을 표현 하고자 하는 데이터 형으로 변환해라라는 뜻이다.
		//여기서 ()는 캐스팅(casting) 연산자라고 부른다


		System.out.println("\n--------퀴즈---------\n");
		char ch1 = 'B';
		System.out.println("ch1('B') +32 = "+(char)(ch1+32));


		PrimitiveTypeTest obj1 = new PrimitiveTypeTest();
		ch1 = obj1.changeToLowerCase('D');
		System.out.println("ch1 : " + ch1);// d

		PrimitiveTypeTest obj2 = new PrimitiveTypeTest();
		ch1 = obj2.changeToUpperCase('d');
		System.out.println("ch1 : " + ch1);// D

	}// ------------------end of main ---------------------------

	public char changeToLowerCase(char a) {
		//char result = (char)(a+32);
		return (char)(a+32);
	}
	public char changeToUpperCase(char a) {
		return (char)(a-32);
	}

}
