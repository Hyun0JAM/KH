package my.day12;

public class Woman extends Human{//Human으로 부터 상속을 받는다.
	//다중 상속 불가.-> public class Woman extends Human,Saram : X
	//자바에서는 상속 받을 클래스는 1개만 가능하다. 즉, 2개 이상의 클래스로부터 상속 (= 다중상속) 은 불가하다.
	//참고로 C++언어는 다중상속이 가능하다.
	//자바에서는 인터페이스(interface)로 다중 구현으로 처리한다.
	
		String childBirthDay;//출산 예정일
	

	public Woman() {
		//super();//부모 클래스인 Human 의 기본생성자를 호출한다.
		//super();은 생략되어져 있을 뿐 작동을 한다
		System.out.println("=== Woman Class 의 기본 생성자 호풀함 !!===");
	}


	public Woman(String name, float height, int weight, String childBirthDay) {
		
		super(name,height,weight);
		
		this.childBirthDay = childBirthDay;
	}
	public void showChildBirthDay() {
		System.out.println(">>> "+super.name+"님의 출산일 자 : "+childBirthDay);
	}


	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println("4. 출산일정 : "+childBirthDay);
	}
	
}
