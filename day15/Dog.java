//=== 메소드의 오버라이딩(재정의) ===
	// 조건이 부모클래스에 존재하는 메소드이어야 한다.
	// 또한 부모클래스에 존재하던 메소드의 내용물을 뺀 나머지(껍데기)는 똑같아야 한다.
	// 단, 접근지정자(접근제한자)은 부모클래스의 것과 동일하든지 아니면 
	// 부모클래스의 것보다는 제한범위가 더 큰쪽으로 해야한다.
	// 예를들어, 
	// - 부모클래스의 메소드 접근지정자가 public 이라면
	//   자식클래스에서 오버라이딩하는 메소드의 접근지정자는 public 만 가능하다.
	// - 부모클래스의 메소드 접근지정자가 protected 이라면
	//   자식클래스에서 오버라이딩하는 메소드의 접근지정자는 public 또는 protected 만 가능하다.
	// - 부모클래스의 메소드 접근지정자가 public 이라면
	//   자식클래스에서 오버라이딩하는 메소드의 접근지정자는 protected 는 불가하다.
package my.day15;

public class Dog extends Animal {
	private int weight;
	
	public Dog() {}
	public Dog(String name, int age, int weight) {
		super(name, age);
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		if(weight<0) this.weight=0;
		else this.weight = weight;
	}
	@Override
	public void bark() {
		System.out.println("멍~멍~");
	}
	public void printDog() {
		String info="";
		info="* 강아지의 이름은 "+getName()+","+"\n"
				+"나이는 "+getAge()+"살,"+"\n"
				+"무게는"+getWeight()+"입니다.";
		System.out.println(info+"\n");
	}
	@Override
	public String toString() {
		String result = "";
		result="\n* 강아지 "+getName()+"의 정보\n"
				+"1. 이름 : "+getName()+"\n"
				+"2. 나이 : "+getAge()+"\n"
				+"3. 체중 : "+getWeight()+"\n";
		return result;
	}
}
