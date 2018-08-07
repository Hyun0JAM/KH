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
import java.util.Date;
import java.lang.*;

public class Hello //클래스명의 첫글자는 대문자로 해야한다.
                   //또한 저장시 파일명도 class명과 똑같아야하며 확장자는 '.java'이다.

{   //클래스의 본체 class body는 '{'로 시작해서 '}'로 끝난다.
    //main() 메소드 : 콘솔 프로그램의 시작점이자 끝점이다. java라는 명령어를 실행시키면 가장먼저 해당 main () 메소드를 찾아서 실행시킨다.
	public static void main(String[] args){
		System.out.println("Hello java~~"); 
		System.out.println("안녕하세요? 반갑습니다.");
		System.out.println("Hi java!!"); 
		System.out.println("자바를 열심히 배워봅시다.");
		//'system.out'은 콘솔화면(모니터)를 뜻한다.

		System.out.print("오늘은 좋은 날입니다.");
		System.out.print("\n오늘은 좋은 날입니다.\n");
		System.out.println("\n ==== 특수문자 ==== \n");
		/*
			Escape 문자 ==> 제어문자
			--- 인쇄 할 수 없거나 키보드로 표현할 수 없는 특별한 문자를 가르키며
			역슬래쉬(\)와 한개의 문자를 결합하여 작성한다.

			\n : 개행(줄바꿈). 스크린(화면) 커서의 위치를 다음줄의 처음으로 옮긴다.
			\t : 수평탭. 스크린(화면) 커서를 다음 탭으로 옮긴다.
			\r : 캐리지 리턴. 스크린(화면) 커서의 위치를 현재 줄의 처음으로 옮긴다. 
				(개행하지 않고 이 기호 다음에 오는 문자를 덮어 씌운다.)
			\\ : 역슬래쉬를 출력 할 때 사용한다.
			\" : 큰 따옴표를 출력 할 때 사용한다.
		*/
		System.out.println("국어\t영어\t수학");
		System.out.println("99\t88\t77");

		System.out.println("");
		System.out.println("이번엔 캐리지 리턴을 써볼까요? \r두");
		System.out.println("이번엔 캐리지 리턴을 써볼까요? \rA");

		System.out.println("");
		System.out.println("\"c:\\myjava\\day\\Hello.java\"");
		System.out.println(" === 퀴즈 === ");
		/*
			김소월 님의 '진달래'
			나보기가 "역겨워 가실때"에는
			c:\진달래.hwp
		*/
		System.out.println("김소월 님의 \'진달래\'");
		System.out.println("나보기가 \"역겨워 가실때\"에는");
		System.out.println("c:\\진달래.hwp");

		/*
			※ 자바 컴파일러 : javac.exe 자바소스코드를 바이트코드로 컴파일한다.
							 실행하면 .class파일이 생성된다.
			   ex) javac Hello.java

			※ 자바 인터프리터 : java.exe 컴파일러가 생성하는 바이트코드를 해석하고 실행한다.
			※ 바이트 코드 : JVM(Java Virtual Machine)이 이해 할 수 있는 기계어.
						   자바가상머신은 바이트코드를 다시 해당 운영체제(OS)의 기계어로 변환하여 운영체제로 전달한다.
		*/

		System.out.println("\n=== 오늘의 날짜 ===\n");
		System.out.println(new Date());
		//new date()은 시스템(컴퓨터)의 날짜를 알려주는 것이다.
	}
}
