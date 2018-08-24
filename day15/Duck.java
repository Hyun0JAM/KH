package my.day15;

public class Duck extends Animal{
	private int price;
	
	public Duck() {}
	public Duck(String name, int age, int price) {
		super(name, age);
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price<0) this.price=0;
		else this.price = price;
	}
	@Override
	public void bark() {
		System.out.println("꾸엑~꾸엑~");
	}
	public void printDuck() {
		String info="";
		info="* 강아지의 이름은 "+getName()+","+"\n"
				+"나이는 "+getAge()+"살,"+"\n"
				+"가격은 "+getPrice()+"원 입니다.";
		System.out.println(info+"\n");
	}
	
}
