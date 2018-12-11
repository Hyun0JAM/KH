package my.day15;

public class TestMain {

	public static void main(String[] args) {
		
		Animal[] aniArr = new Animal[10];
		
		Dog dog= new Dog("뽀삐", 5, 8);
		Cat cat= new Cat("톰", 3, "검정");
		Duck duck= new Duck("도널드", 4, 5000);
		
		aniArr[0] = dog;
		aniArr[1] = cat;
		aniArr[2] = duck;
		
		System.out.println("-----------------------------");
		for(int i=0;i<Animal.cnt;i++) {
			aniArr[i].bark();
		}
		System.out.println("-----------------------------");
		for(int i=0;i<Animal.cnt;i++) {
			if(aniArr[i] instanceof Dog)
				((Dog)aniArr[i]).printDog();
			else if(aniArr[i] instanceof Cat)
				((Cat)aniArr[i]).printCat();
			else if(aniArr[i] instanceof Duck)
				((Duck)aniArr[i]).printDuck();
		}
		System.out.println("-----------------------------");
		System.out.println("* dog.toString() : "+dog.toString());
		System.out.println("* cat.toString() : "+cat.toString());
		System.out.println("* duck.toString() : "+duck.toString());

		System.out.println("-----------------------------");
		System.out.println("* dog.hashCode() : "+dog.hashCode());
		System.out.println("* cat.hashCode() : "+cat.hashCode());
		System.out.println("* duck.hashCode() : "+duck.hashCode());
		/* dog.hashCode() : 865113938
		 * cat.hashCode() : 1442407170
		 * duck.hashCode() : 1028566121
		 */

		System.out.println("-----------------------------");
		System.out.println(Integer.toHexString(dog.hashCode())); //10진수를 16진수로 변경해서 문자열 형태로 보여주는 것이다.
	}
}
