/* [ 배열(Array)과 자료구조(collection)의 차이점 ]
 * 
 * 1. 배열은 오로지 동일한 데이터 타입만 들어가는 저장소이다.
 *  - 배열은 그 크기가 한번 정해지면 크기를 변경 할 수 없다.
 *  
 * 2. 자료구조(collection)은 동일한 타입의 객체가 아니더라도 객체타입 이기만 하면 모두 들어가는 저장소이다.
 *  - collection은 저장되는 크기가 자동적으로 증가되어진다.
 *  
 *  >> 웹에서 가장 많이 사용하는 Collection 타입은 List와 Map이다.(Interface)
 *  ----------------------------------------------------------------
 *  			web에서 주로 사용			게임프로그래밍에서 주로사용
 *  			(single thred방식)		(Multi thred 방식)
 *  ----------------------------------------------------------------
 *     > List : ArrayList(가장많이사용), 	vactor
 *     > Map : 	HashMap, 				Hashtable
 *     
 *     		vector및 HashTable이 멀티 스레드 지원하므로 메모리를 많이 사용.
 *     		ArrayList및 HashMap은 단일 스레드 지원하므로 메모리를 적게 쓴다.(웹에서 쓰는 이유)
 *     		- 멀티 스레드를 지원하느냐 안하느냐의 차이만 있을 뿐 그 나머지는 모두 동일하다.
 *  ----------------------------------------------------------------
 *  
 * */
/*
    JDK 1.5 부터 제네릭(Generic)타입이 새로 추가되었는데, 제네릭(Generic)을 이용함으로써 잘못된 타입이
       사용될 수 있는 문제를 컴파일 과정에서 제거할 수 있게 되었다. 
       프로그램 실행시 타입 에러가 발생하여 작동이 멈추는 것보다는 컴파일시에 타입에러가 발생하도록 하여 
       프로그램 실행시 에러를 발생하지 않도록 사전에 방지하는 것이 좋기 때문이다.
       
         ▷ 제네릭(Generic)은 컬렉션(자료구조) 즉, 쉽게 말해서 객체들을 저장(수집)하는 구조적인 성격을 보강하기 위해 제공하는 것이다.
         ▷ 간단히 예를 들자면 컵이라는 특정 객체가 있다고 하자. 
          이 컵은 물만 담을 수 있는 물컵 , 또는 이 컵은 쥬스만 담을 수 있는 쥬스 컵. 이렇게 지정해주도록 하는 것이  제네릭(Generic) 이다.    
    
         ▷  JDK 1.5 부터 제네릭(Generic)타입이 새로 추가되면서, 특정 컬렉션(자료구조)에 저장되어질 특정한 객체 타입을 명시하여
         실행하기전 컴파일 단계에서 특정한 객체 타입이 아니면 에러를 발생토록 하여 저장이 불가능하도록 만들었다.
         즉, 특정 컬렉션(자료구조)에 저장되어질 객체의 타입을 제한하도록 만든 것이다.
    
        ▷   제네릭(Generic)타입을 사용하기 이전에는  컬렉션(자료구조)에 저장되어진 객체들을 하나씩 검출하여 객체 타입을 확인할 수 밖에 없었다.
      Object 로 부터 상속받은 객체는 모두 저장이 가능했던 이전의 버전들과는 달리 보다 체계적이라 할 수 있다.
      
        ▷ 제네릭(Generic)타입을 사용함으로써 별도의 형 변환(Casting)이 필요없이 <> 사이에 선언하였던 객체자료형으로 검출되어 편리하다.       
    
        ▷ 제네릭(Generic)타입에 있어서 1개 글자로 된 영문대문자는 영문대문자 아무것이나 사용해도 무관하다.
     -- 그런데 관습상 객체가 제네릭(Generic)타입으로 사용될때 자료형(Type)이라고 나타내고 싶을때는 <T>라고 쓰고,
               어떠한 요소(Element)이라고 나타내고 싶을때는 <E>라고 쓰고, 
        key값이라고 나타내고 싶을때는 <K>라고 쓰고, Value값이라고 나타내고 싶을때는 <V>라고 쓴다.      
        
 */
package my.day18;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListTest {

	public static void main(String[] args) {
		Vector vt =new Vector(5,3);
		
		System.out.println("* vt의 용량 : "+vt.capacity()); //5
		System.out.println("* vt에 저장된 현재 크기 : "+vt.size()); //0
		
		String[] strArr = {"일순신","이순신","삼순신","사순신","오순신"};
		Member[] memArr = {new Member("hongkd","qwer1234!","홍길동"),
							new Member("leekd","asdf1234!","두길동"),
							new Member("kimkd","rtyu1234!","세길동"),
							new Member("choikd","zxcv1234!","네길동")
							};

		for(int i=0;i<strArr.length;i++) {
			vt.add(strArr[i]);
		}
		for(int i=0;i<memArr.length;i++) {
			vt.add(memArr[i]);
		}
		System.out.println("* vt의 용량 : "+vt.capacity()); //5
		System.out.println("* vt에 저장된 현재 크기 : "+vt.size()); //0

		System.out.println("-------------------------------------------");
		
		//ArrayList list = new ArrayList<>();
		List list = new ArrayList(); // ==ArrayList

		System.out.println("* 현재 ArrayList의 크기 : "+list.size());
		for(int i=0;i<strArr.length;i++) {
			list.add(strArr[i]);
		}
		System.out.println("* 현재 ArrayList의 크기 : "+list.size());
		for(int i=0;i<memArr.length;i++) {
			list.add(memArr);
		}
		System.out.println("* 현재 ArrayList의 크기 : "+list.size());
		int[] intArr = {new Integer(100),new Integer(200),new Integer(300)};
		for(int i=0;i<intArr.length;i++) {
			list.add(intArr);
		}
		System.out.println("* 현재 ArrayList의 크기 : "+list.size());
		System.out.println("-------------------------------------------");
		List<String> nameList = new ArrayList<String>(); 
		// = String 타입의 객체만 저장하는 리스트
		// <String>을 Generic이라고 부른다. JDK 1.5버전 이후부터 사용되었다.
		// <E>의 E는 element를 뜻하는 것으로 클래스명이 들어온다.
		// nameList에 저장되는 객체는 <E>에 들어오는 클래스만 가능하다
		nameList.add(0, "ASD");
		nameList.add(1, "123");
		nameList.add(2, "최현영");
		nameList.add(3, "DOG");
		nameList.add(4, "String");
		
		
		List<Member> memlist = new ArrayList<Member>();
		for(int i=0;i<memArr.length;i++) {
			memlist.add(memArr[i]);
		}
		System.out.println("* 현재 ArrayList의 크기 : "+memlist.size());
		
		List<Integer> intlist = new ArrayList<Integer>();
		//자바가 int 타입인 정수를 > new Integer(정수)로 '오토박싱(auto boxing)'해준다.
		intlist.add(0,100);
		intlist.add(1,200);
		intlist.add(2,300);
		intlist.add(3,400);
		
		for(int i=0; i<memArr.length;i++) {
			list.add(memArr[i]);
		}
		list.addAll(intlist);
		
		for(int i=0;i<intlist.size();i++) {
			System.out.println("* "+(i+1)+"번 : "+intlist.get(i));	
		}
		for(int i=0;i<nameList.size();i++) {
			if(list.get(i) instanceof String)
				System.out.println((String)list.get(i));
			else if(list.get(i) instanceof Member)
				System.out.println(((Member)list.get(i)).toString());
		}
		
		System.out.println("* 현재 ArrayList의 크기 : "+intlist.size());
		
		for(Member mem :memlist) {
			System.out.println(mem);
		}
		for(Integer inte : intlist) {
			System.out.println(inte);
		}
		for(int i : intlist) { //'auto unboxing' : intlist에 저장된 integer객체타입을 자동적으로 int 타입으로 변경해주는것
								// 즉 wrapper클래스에 객체타입으로 되어진 것을 자동으로 원시형타입으로 변경해주는것
			System.out.println(i);
		}
	}
}
