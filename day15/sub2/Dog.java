package my.day15.sub2;

public class Dog extends Animal {
	
	private int weight;
	
	public Dog() {}
	public Dog(String name, int age, int weight) {
		super(name,age);
		this.weight = weight;
	}
	public Dog(String name, int weight) {
		this(name, 1, weight); //나이는 무조건 한살
		//생성자의 오버로딩
	}
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public void bark() {
		System.out.println("멍멍~~");
		// TODO Auto-generated method stub
		
	}
	@Override
	public String run() {
		String result="* 강아지 "+getName()+"(이)가 네발로 달린다. ";
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
