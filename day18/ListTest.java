/* [ 배열(Array)과 자료구조(collection)의 차이점 ]
 * 
 * 1. 배열은 오로지 동일한 데이터 타입만 들어가는 저장소이다.
 *  - 배열은 그 크기가 한번 정해지면 크기를 변경 할 수 없다.
 *  
 * 2. 자료구조(collection)은 동일한 타입의 객체가 아니더라도 객체타입 이기만 하면 모두 들어가는 저장소이다.
 *  - collection은 저장되는 크기가 자동적으로 증가되어진다.
 *  
 * */
package my.day18;

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
							new Member("choikd","zxcv1234!","네길동")};
	}
}
