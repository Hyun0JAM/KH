/*
     == HashSet == 
     1. 출력시 저장된 순서가 유지되지 않는다.
     2. 중복된 데이터를 저장할 수 없다.
               그러므로 Collection 내의 중복된 요소들을 저장하지 않고자 할때 많이 사용된다.
               
     == LinkedHashSet ==
     1. 출력시 저장된 순서가 유지된다.
     2. 중복된 데이터를 저장할 수 없다.
               그러므로 Collection 내의 중복된 요소들을 저장하지 않고자 할때 많이 사용된다.        
 */
package my.day18;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		System.out.println("\n- HashSet ----------------------\n");
		// 1. Member클래스의 객체를 저장할 수 있는
		//    HashSet객체 memberSet1 생성
		Set<Member> memberHash = new HashSet<Member>();
		// 2. Member클래스의 객체 6개를 생성하여 멤버리스트에 저장하십시오
		memberHash.add(new Member("youjs","qwer1234!","유재석"));
		memberHash.add(new Member("eom","1234qwer.","이오엠"));
		memberHash.add(new Member("kanghd","lkjh2354!!","강호동"));
		memberHash.add(new Member("kimth","daiuni2","김태희"));
		memberHash.add(new Member("leess","qwer1234$","이순신"));
		memberHash.add(new Member("kangkc","bogas1212!","강감찬"));
		memberHash.add(new Member("leess","qwer1234$","이순신"));
		
		Member mem1 = new Member("suji","akjseh123","수지");
		Member mem2 = new Member("suji","akjseh123","수지");

		memberHash.add(mem1);
		memberHash.add(mem2);
		
		Member mem3 = new Member("suji","akjseh123","차은우");
		Member mem4 = new Member("suji","akjseh123","차금우");		
		
		mem4 = mem3;
		
		memberHash.add(mem3);
		memberHash.add(mem4);
		
		Iterator<Member> it = memberHash.iterator();
		while(it.hasNext()) {
			Member member = it.next();
			member.showInfo();
		}
		
		System.out.println("\n- Linked HashSet ---------------\n");
		
		System.out.println("\n[Quiz] memberlist에 저장되어진 회원 중 ID가  Kimth를 출력하세요");
		for(Member mem : memberHash) {
			if("kimth".equals(mem.getId()))
				mem.showInfo();
		}
		System.out.println("\n[Quiz] memberMap에 저장되어진 lssee 객체를 삭제하세요.");
		memberHash.remove("leess");
		System.out.println("- 삭제후 전체조회 ---------------------");
		Iterator<Member> it2 = memberHash.iterator();
		while(it2.hasNext()) {
			Member member = it2.next();
			member.showInfo();
		}
		
	}
}
