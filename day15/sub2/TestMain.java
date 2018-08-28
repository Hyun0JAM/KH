package my.day15.sub2;

public class TestMain  {

	public static void main(String[] args) {
		InterAnimal[] intAniArr = new InterAnimal[3];
		
		Dog dog= new Dog("뽀삐", 5, 8);
		Cat cat= new Cat("톰", 3, "검정");
		Duck duck= new Duck("도널드", 4, 5000);
		
		intAniArr[0] = dog;
		intAniArr[1] = cat;
		intAniArr[2] = duck;
		
		for(int i=0;i<3;i++) {
			if(intAniArr[i] instanceof Dog) {
				System.out.println("-----------------------------");
				System.out.println("1. 성명 : "+((Dog)intAniArr[i]).getName());
				System.out.println("2. 나이 : "+((Dog)intAniArr[i]).getAge());
				System.out.println("3. 무게 : "+((Dog)intAniArr[i]).getWeight());
			}
			else if(intAniArr[i] instanceof Cat) {
				System.out.println("-----------------------------");
				System.out.println("1. 성명 : "+((Cat)intAniArr[i]).getName());
				System.out.println("2. 나이 : "+((Cat)intAniArr[i]).getAge());
				System.out.println("3. 무게 : "+((Cat)intAniArr[i]).getColor());
			}
			else if(intAniArr[i] instanceof Duck) {
				System.out.println("-----------------------------");
				System.out.println("1. 성명 : "+((Duck)intAniArr[i]).getName());
				System.out.println("2. 나이 : "+((Duck)intAniArr[i]).getAge());
				System.out.println("3. 무게 : "+((Duck)intAniArr[i]).getPrice());
			}
			System.out.print(intAniArr[i].run());
			intAniArr[i].bark();
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
		System.out.println("* 16진수 : "+Integer.toHexString(dog.hashCode())); //10진수를 16진수로 변경해서 문자열 형태로 보여주는 것이다.
	}

}
