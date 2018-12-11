/*  인터페이스란?
 *  : 모든메소드는 추상메소드로 되어있고 모든 멤버변수들은 상수변수(Final)로 되어있는것
 *  
 *  클래스의 상속은 다중상속은 불가하지만 인터페이스는 다중 구현 가능하다.
 * 
 */

package my.day15.sub2;

public interface InterAnimal {
	// 인터페이스에서 선언되어진 변수는 
	// 항상 public final static 이 생략된 상수 변수이다.
	float PI = 3.14F;
	//	public final static float PI = 3.14F; 와 같다.!!!
	
	public abstract void bark(); //추상화 클래스는 '{}'를 쓰지않고 바로 세미콜론';'을 찍는다. 
	//abstract의 위치는 접근제한자 앞뒤 모두 괜찮다. 반드시 자식클래스가 재정의 해야한다 (강제적)

	// 인터페이스에서 메소드를 선언할때 접근제한자는 생략한다.
	// 접근제한자를 생략하면 자동적으로 public 이 붙으며, 또한 abstract 가 붙는다. 
	// 즉, 메소드명 앞에 public abstract 가 생략된 것이다.
	
	String run();
	//동물이 되려면 현재 나이를 알려주어야 한다.
	//동물이 되려면 가중치를 문자열("A","B","C","D")로_등급 입력받아 각 동물별 등급 문자열("최우수","우수","보통","저급")으로 알려주어야한다.
	int showAge();
	String grade(String level);
}
