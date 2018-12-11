/* [ 사용자 정의 예외(오류)절 만들기 ]
 * 1. Exception 클래스를 상속받는다.
 * 2. 생성자를 구성해서 예외 메세지를 등록해주면 끝난다.
 * 
 * */

package my.day17;

public class UserDefineExceptionID extends Exception {

	public UserDefineExceptionID() {
		super("* ID명은 최소 길이가 5글자 이상이어야 합니다.");
		
	}
	//파라미터가있는생성자
	public UserDefineExceptionID(String errorMsg) { //오류메세지를 매개변수로 전달해서 띄운다.
		super(errorMsg);
	}
}
