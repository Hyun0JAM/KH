/* ===== 캡슐화(은닉화) =====
 * 
 * 접근제한자(접근지정자, accessmodifier) 자기 자신의 클래스, 내부 동일패키지에있는 다른클래스, 다른패키지에있는 하위(자식)클래스, 그외의영역
 * ----------------------------------------------------------------------------------------------
 * public								0					0							0				0
 * protected							0					0							0				X
 * default	(ex. String s;)				0					0							X				X
 * private								0					X							X				X
 * 
 * */

package my.day12;

public class AcessModifierTest {

	public String userid="superman";
	protected String passwd ="qwer1234!";
	String name="이순신"; //default
	private String adress="서울시 종로구";

}
