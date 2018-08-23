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

public class CapsulationPersonMain {

	public static void main(String[] args) {
		 CapsulationPerson person = new  CapsulationPerson();
		 person.setName("홍길동");
		 person.setAge(26);
		 person.setHeight(178.9);
		 person.showInfoPerson();	
		 System.out.println("* "+person.getName()+"님의 나이는 "+person.getAge()+"세 키는 "+person.getHeight()+"cm 입니다.");
		 //홍길동님의 나이는 26세 키는 178.9cm 입니다.
		 
	}
}
