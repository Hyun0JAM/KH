/* 미완성클래스(추상클래스)
 *  : 객체로 생성할수 없는 클래스로서 주로 일반클래스의 부모클래스로 사용된다.
 * 	    클래스 앞에 abstract라는 키워드를 붙이면 추상클래스가 된다.
 * 
 * 미완성클래스  : (=미완성메소드) 미완성 메소드를 가지고있는 클래스를 말한다.
 * 마완성 메소드를 두는 이유는 자식클래스에서 메소드의 override(재정의)를 하기 떄문이다.
 */

package my.day15;

public abstract class Animal {
	static int cnt;
	private String name;
	private int age;
	
	public Animal() {cnt++;}
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		cnt++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public abstract void bark(); //추상화 클래스는 '{}'를 쓰지않고 바로 세미콜론';'을 찍는다. 
	//abstract의 위치는 접근제한자 앞뒤 모두 괜찮다. 반드시 자식클래스가 재정의 해야한다 (강제적)
	//동물이 되려면 우는 기능을 구현해야 한다.
}
