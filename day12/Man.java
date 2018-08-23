package my.day12;

public class Man extends Human{
	//다중 상속 불가.-> public class Man extends Human,Saram : X
	//자바에서는 상속 받을 클래스는 1개만 가능하다. 즉, 2개 이상의 클래스로부터 상속 (= 다중상속) 은 불가하다.
	//참고로 C++언어는 다중상속이 가능하다.
	//자바에서는 인터페이스(interface)로 다중 구현으로 처리한다.
	
	String goArmyDay;//입대일자 
	
	
	
	public Man() {
		super();
		
	}
	

	public Man(String name, float height, int weight,String goArmyDay) {
		super(name,height,weight);
		this.goArmyDay = goArmyDay;
	}

	
	public void showGoArmyDay() {
		System.out.println(name+">>>입대 일자 "+goArmyDay);
	}

	//source -> override Methods -> 메소드 재정의, 부모 클래스의 메소드의 정보를 추가할때.
	@Override
	public void showInfo() {
		super.showInfo();//일단 부모의 메소드 사용, 공통된 메소드는 사요한다.-> Man에서 추가한다.
		System.out.println("4. 입대일자 : "+goArmyDay);
		System.out.println("===================");
	}
	
}
