package io.day4;

import java.util.*;

public class MainTest {

	public static void main(String[] args) {
		Student st1 = new Student("한석규",21,"서울시 강동구");
		Student st2 = new Student("두석규",22,"서울시 강서구");
		Student st3 = new Student("세석규",23,"서울시 강남구");
		Student st4 = new Student("네석규",24,"서울시 강북구");
		
		List<Student> stList = new ArrayList<Student>();

		stList.add(st1);
		stList.add(st2);
		stList.add(st3);
		stList.add(st4);
		
		SerializableTest serial = new SerializableTest();
		serial.objextToFileSave(stList,"C:\\IOTestData\\serializable\\student.dat");//직렬화 시켜주는 메소드호출
		
		Object obj = serial.getObjectFormFile("C:\\IOTestData\\serializable\\student.dat");//역직렬화 시켜주는 메소드 호출
		if(obj!=null) {
			@SuppressWarnings("unchecked")
			List<Student> resultList = (List<Student>)obj;
			System.out.println(">> 파일에 저장된 객체 정보 출력하기 <<");
			for(Student st: resultList) {
				System.out.println(st.toString());
			}
		}
		else System.out.println("파일에 저장된 객체정보가 없습니다.");
	}
}
/*
 * >> 메뉴 <<
 * 1. 회원가입(Member)
 * 2. 로그인
 * 3. 모든회원출력
 * 4. 특정 ID검색하기
 * */
