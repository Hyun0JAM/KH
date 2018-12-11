package my.day15;

public class Cat extends Animal{
	private String color;
	
	public Cat() {}
	public Cat(String name, int age, String color) {
		super(name, age);
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
		System.out.println("야옹~야옹~");
	}
	public void printCat() {
		String info="";
		info="* 강아지의 이름은 "+getName()+","+"\n"
				+"나이는 "+getAge()+"살,"+"\n"
				+"색은 "+getColor()+"색 입니다.";
		System.out.println(info+"\n");
	}
}
