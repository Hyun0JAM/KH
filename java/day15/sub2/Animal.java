package my.day15.sub2;

public abstract class Animal implements InterAnimal {
	
	public static int cnt;
	
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
	
	@Override
	public void bark() {
		// TODO Auto-generated method stub

	}

	@Override
	public String run() {
		// TODO Auto-generated method stub
		return null;
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
