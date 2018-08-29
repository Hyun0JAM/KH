
package my.day18;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// 1. Member클래스의 객체를 저장할 수 있는
		//    ArratList객체 memberlist 생성
		ArrayList<Member> memberlist = new ArrayList<Member>();
		
		// 2. Member클래스의 객체 6개를 생성하여 멤버리스트에 저장하십시오
		memberlist.add(new Member("youjs","qwer1234!","유재석"));
		memberlist.add(new Member("eom","1234qwer.","이오엠"));
		memberlist.add(new Member("kanghd","lkjh2354!!","강호동"));
		memberlist.add(new Member("kimth","daiuni2","김태희"));
		memberlist.add(new Member("leess","qwer1234$","이순신"));
		memberlist.add(new Member("kangkc","bogas1212!","강감찬"));
		
		// 3. 여기에 저장되어진 모든 정보를 출력하시오
		for(Member mem : memberlist) mem.showInfo();
		System.out.println("\n[Quiz] 성이 \"강\"씨 인 회원만 삭제");
		for(int i=0;i<memberlist.size();i++) {
			if(memberlist.get(i).getName().startsWith("강"))
				memberlist.remove(i);
		}
		for(Member mem : memberlist) mem.showInfo();
		System.out.println("\n[Quiz] memberlist에 저장되어진 회원 중 ID가  Kimth를 출력하세요");
		for(int i=0;i<memberlist.size();i++) {
			if("kimth".equals(memberlist.get(i).getId()))
				memberlist.get(i).showInfo();		
		}
		System.out.println("\n[Quiz] memberlist에 저장되어진 회원 중 성이 \"강\"씨인 사람만 출력하세요");
		for(Member mem : memberlist) {
			//if("강".equals((mem.getName().substring(0,1))))
			if(mem.getName().startsWith("강"))
				mem.showInfo();
		}	
		// MemberList에 새로운 멤버 추가하기-----------------
		memberlist.add(new Member("sulhy","bogas1212!","설현"));
		// MemberList의 특정 인덱스에 새로운 멤버 추가하기-----------------
		memberlist.add(3, new Member("irin","irin94167","아이린"));
		
		System.out.println("\n- 회원 추가후 -------------------");
		for(Member mem : memberlist) mem.showInfo();
		
		System.out.println("\n- 특정 개체 삭제하기 --------------");
		memberlist.remove(3); //특정 위치(3)에 저장된 객체 삭제하기
		for(Member mem : memberlist) mem.showInfo();
		
		System.out.println("\n- 특정 인덱스 위치에 있던 객체를 삭제하고 새로운 객체로 대체하기 --------------");
		memberlist.set(3, new Member("suji","1234","수지"));
		for(Member mem : memberlist) mem.showInfo();
		memberlist.clear(); // 모든객체 삭제하기
		for(Member mem : memberlist) mem.showInfo();
	}
}
