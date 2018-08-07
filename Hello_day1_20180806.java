//1줄 주석

/*여러줄 주석*/

/**
    문서화주석
    >>javadoc를 이용해서 api문서를 만들때 사용한다. 
*/

 /* ====== *** class의 구조 *** ======
    - 어떠한 어플리케이션 제작시 필요한 부품의 설계도면이라고 생각하자.

    1. 패키지 선언문 : 패키지란 클래스가 저장되어진 디렉토리 경로라고 보면 된다. 
        ex) package 패키지명; (패키지명은 반드시 소문자로 시작)
    2. import 문  
        ex) import 패키지명.클래스명;
            import java.lang.String;
            import java.lang.System;
            import java.lang.*;
    3. 클래스 선언문
    4. 컴파일
    5. 실행
*/
public class Hello //클래스명의 첫글자는 대문자로 해야한다.
                   //또한 저장시 파일명도 class명과 똑같아야하며 확장자는 '.java'이다.
{   //클래스의 본체 class body는 '{'로 시작해서 '}'로 끝난다.
    //main() 메소드 : 콘솔 프로그램의 시작점이자 끝점이다. java라는 명령어를 실행시키면 가장먼저 해당 main () 메소드를 찾아서 실행시킨다.
	public static void main(String[] args) //암기!
	{
		System.out.println("Hello java~~"); //'system.out'은 콘솔화면(모니터)를 뜻한다.
		System.out.println("안녕하세요? 반갑습니다.");
		System.out.println("Hi java!!"); 
		System.out.println("자바를 열심히 배워봅시다.");
	}
}

/*
20180806)서영학강사님 - OT진행과 자바의 기본

자바설치(+환경변수설정)

 < 자바기본 >
  
   - 데이터 타입(ex.아이디 = 문자열String, 날짜 = Date, 숫자 = int 등 ...)

   - Class : 자바의 설계도면(객체를 만드는 틀) >> 인스턴스화(객체화) >> Object(만들어진 객체)

   - Instance 변수(Non Static 변수) : 객체의 변수  

   - Class변수(Static변수) : 클래스 내에서 사용하는 변수

   [day1/Hello.java 예제]

	- javac : 자바 컴파일 (클래스파일 생성됨)
	    ex) javac Hello.java - 컴파일
	        java Hello - 실행 
*/