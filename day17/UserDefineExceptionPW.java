package my.day17;

public class UserDefineExceptionPW extends Exception{
	
	public UserDefineExceptionPW() {
		super("* PW(암호)는 최소 8글자 이상 영문자,숫자,특수기호가 혼합되어야 합니다.");
		
	}
	//파라미터가있는생성자
	public UserDefineExceptionPW(String errorMsg) { //오류메세지를 매개변수로 전달해서 띄운다.
		super(errorMsg);
	}
}
