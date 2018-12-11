/*
    === Map 계열 ===
    1. HashMap 과 Hashtable 이 있다.
    2. Map 계열은 List 계열(Vector, ArrayList)처럼 index 가 사용되어 저장되는 것이 아니라, 
       Map 계열은 key값과 value값을 쌍으로 사용하여 저장하는데  
             데이터 저장시 사용되는 메소드는 put(String key, Object value)메소드를 사용한다.
             이때 key값은 반드시 고유한 값을 가져야 하고, value값은 중복된 값이 와도 괜찮다.
    3. Map 계열에 저장된 key값들은 순서와는 상관없이 저장된다.  
    4. Map 계열에 저장된 value값을 추출하려면 key를 이용해서 가져오는데 
       value 값의 추출은 get(String key) 메소드를 사용한다.
 */
package my.day18;

/*import java.util.HashMap;
import java.util.Set;*/
import java.util.*;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String,Member> memberMap = new HashMap<String,Member>();

		memberMap.put("youjs", new Member("youjs","qwer1234$","유재석"));
		memberMap.put("eom", new Member("eom","qwer1234$","엄정화"));
		memberMap.put("kanghd", new Member("kanghd","qwer1234$","강호동"));
		memberMap.put("leess", new Member("leess","qwer1234$","이순신"));
		memberMap.put("kimth", new Member("kimth","qwer1234$","김태희"));
		memberMap.put("leess", new Member("leess","qwer1234$","Leesunsin"));
		memberMap.put("kangkc", new Member("kangkc","qwer1234$","강감찬"));
		//Value값은 중복허용되지만 키값은 중복허용안함

		Member mem = memberMap.get("eom");
		mem.showInfo(); 

		System.out.println("\n[Quiz] memberMap에 저장되어진 회원 중 ID가  Kimth를 출력하세요");
		memberMap.get("kimth").showInfo(); //특정 개체 하나 출력시 Arraylist에 비해 아주 효율적이지만 보두 출력할 시에는 ArrayList가 더 효율적
		System.out.println("\n[Quiz] memberMap에 저장되어진 모든 회원을 출력하세요");
		Set<String> keysets =  memberMap.keySet(); //Set도 저장소 중 하나 Collection , 중복허용안함
		System.out.println(keysets);
		//memberMap에 저장된 모든 키값을 안다면 출력가능하지만 모르므로
		//모든키값을 알려주는 메소드 KeySet()을 사용
		System.out.println("키셋 메소드를 사용하여 memberMap에 저장된 모든 Member정보 출력");
		
		Collection<Member> collect =memberMap.values();
		//hashMap객체에 저장된 value값만 뽑아주는 메소드이다.
		for(Member member : collect) {
			member.showInfo();
		}
		System.out.println("---------------------------------");
		Iterator<Member> itmem = collect.iterator();
		while(itmem.hasNext()) { 
		/*
			itmem.hasNext()은 저장소 itmem에 저장되어진 Member를 하나하나씩 조사해서 존재하면 true를 리턴해주는 메소드
			itmem.next()는 저장소 itmem에서 저장되어진 member(객체)를 꺼내어 오는 메소드이다.
		*/
			itmem.next().showInfo(); //반환 타입 멤버
		}
	}
}
