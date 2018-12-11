/*  인터페이스란?
 *  : 모든메소드는 추상메소드로 되어있고 모든 멤버변수들은 상수변수(Final)로 되어있는것
 *  
 *  클래스의 상속은 다중상속은 불가하지만 인터페이스는 다중 구현 가능하다.
 * 
 */

package my.day15.sub;

public interface InterAnimal {
	public abstract void bark(); //추상화 클래스는 '{}'를 쓰지않고 바로 세미콜론';'을 찍는다. 
	//abstract의 위치는 접근제한자 앞뒤 모두 괜찮다. 반드시 자식클래스가 재정의 해야한다 (강제적)
	//인터페이스에서 메소드를 선언할때 접근제한자는 생략한다.
	//동물이 되려면 우는 기능을 구현해야 한다.
	String run();
	//동물이 되려면 현재 나이를 알려주어야 한다.
	//동물이 되려면 가중치를 문자열("A","B","C","D")로_등급 입력받아 각 동물별 등급 문자열("최우수","우수","보통","저급")으로 알려주어야한다.
	int showAge();
	String grade(String level);
}