package my.day15.sub2;

public class Cat extends Animal {
	private String color;
	
	public Cat() {}
	public Cat(String name, int age, String color) {
		super(name,age);
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public void bark() {
		System.out.println("야옹~~");
		// TODO Auto-generated method stub
		
	}
	@Override
	public String run() {
		String result="* 고양이 "+getName()+"(이)가 점프를 해서 착지 합니다. ";
		// TODO Auto-generated method stub
		return result;
	}

	@Override
	public int showAge() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String grade(String level) {
		// TODO Auto-generated method stub
		return null;
	}
}
