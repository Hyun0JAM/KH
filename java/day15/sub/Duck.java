package my.day15.sub;

public class Duck implements InterAnimal{
	private String name;
	private int age;
	private int price;
	
	public Duck() {}
	public Duck(String name, int age, int price) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public void bark() {
		System.out.println("꽥꽥~~");
		// TODO Auto-generated method stub
		
	}
	@Override
	public String run() {
		String result="* 오리 "+name+"(이)가 두발로 헤엄쳐서 건너가기도하고 두발로 걷기도 합니다. ";
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
