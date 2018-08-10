package my.day5;

public class StringEqualsTest {
	public static void main(String[] arg) {
		String name1 = new String("이순신"); //주소값을 기억
		String name2 = new String("이순신");
		
		String name3 = "강감찬",name4 = "강감찬";
		
		if(name1 == name2) System.out.println("name1과 name2의 값은 같습니다."); // 같지 않다 _ String객체끼리 비교하면 주소가 비교됨
		else System.out.println("name1과 name2의 값은 같지 않습니다.");					
		
		System.out.println("\n------------------------------");
		if(name3 == name4) System.out.println("name1과 name2의 값은 같습니다.");
		else System.out.println("name1과 name2의 값은 같지않습니다.");

		if(name1.equals(name2)) System.out.println("name1과 name2의 값은 같습니다."); //equals함수를 통해 문자 비교 가능
		else System.out.println("name1과 name2의 값은 같지않습니다.");					
		//name1.equals(name2)은 String name1의 값"이순신"과 String name2의 값"이순신"을 비교해서 값이 동일하면 true, 아니면 false를 반환.
		
	} //end of main ------------------------------- 
}
