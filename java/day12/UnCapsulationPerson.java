package my.day12;

public class UnCapsulationPerson {
	String name;
	int age;
	double height;
	
	//UnCapsulationPerson 객체의 속성 저보값을 출력해주는 메소드 생성

	public void showInfoPerson() {
		System.out.println("1. 성명 : "+name);
		System.out.println("2. 나이 :  "+age);
		System.out.println("3. 신장 : "+height+"cm");
	
	}
}
