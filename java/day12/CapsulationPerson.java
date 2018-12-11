package my.day12;

public class CapsulationPerson {
	
	//접근 제한다.
	private String name;//private = 다른 클래스에서는 볼 수 없다.
	private int age;
	private double height;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.trim().isEmpty()) System.out.println("* 성명은 공백만으로 생성이 불가합니다.");
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<0) System.out.println("* 나이는 0보다 커야합니다.");
		else this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if(height<0) System.out.println("* 키는 0보다 커야합니다.");
		else this.height = height;
	}
	
	//CapsulationPerson 객체의 속성 저보값을 출력해주는 메소드 생성
	
	public void showInfoPerson() {
		System.out.println("1. 성명 : "+name);
		System.out.println("2. 나이 : "+age);
		System.out.println("3. 신장 : "+height+"cm");
	
	}
}
