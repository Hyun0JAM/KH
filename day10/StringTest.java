package my.day10;

import java.util.StringTokenizer;

public class StringTest {

	public static void main(String[] args) {
		String str = "안녕하세요? 만나서 반갑습니다. Good Day 되세요~~^^";
		
		
		System.out.println("\n===1. char 문자열.cahrAt(int index) ");
		//char 문자열.charAt(int index)
		//-->인덱스 위치에 있는 문자(char)를 반환시켜주는 메소드
		for(int i=0;i<str.length();i++) System.out.print(str.charAt(i)+", ");
		
		
		System.out.println("\n===2. char[] 문자열.tochararray() ");
		//char[] 문자열.tochararray() --> 문자열을 char배열 타입으로 반환해준다.
		char[] charArr = str.toCharArray();
		for(int i=0;i<charArr.length;i++) System.out.print(charArr[i]+", ");
		
		
		System.out.println("\n===3. String 문자열.subString(int beginIndex,int endIndex) ");
		//String 문자열.subString(int beginIndex,int endIndex) 
		//-->어떤 문자열에서 일부분만 가져올때 쓴다. 문자열 beginIndex부터 endIndex앞(포함안됨_미만)까지 문자열 반환
		String st = str.substring(7, 12);
		System.out.println(st);
		
		st = str.substring(7); //endIdex없이 쓴다면 시작인덱스부터 끝까지 나온다.
		System.out.println(st);
		
		
		System.out.println("\n===4. String 문자열.split(구분자) ");
		//String 문자열.split("구분자") --> 문자열을 구분자로 잘라서 문자열배열타입으로 반환해준다.
		String food = "골뱅이, 치킨, 맥주, 과일, 닭발, 소주, 피자";
		String[] foodArr = food.split(", ");
		for(int i=0;i<foodArr.length;i++) System.out.print(foodArr[i]+"  ");
		
		System.out.println("\n------------------------------------------");
		food = "골뱅이	치킨	맥주	과일	닭발	소주	피자";
		foodArr = food.split("\t");
		for(int i=0;i<foodArr.length;i++) System.out.print(foodArr[i]+"  ");
		
		System.out.println("\n------------------------------------------");
		food = "골뱅이.치킨.맥주.과일.닭발.소주.피자";
		//foodArr = food.split("."); //점'.'은 인식안된다 --> 점은 아무글자 하나를 말한다.
		foodArr = food.split("\\."); //역 슬래시 두개로 점을 인식 시킬수 있다.
		for(int i=0;i<foodArr.length;i++) System.out.print(foodArr[i]+"  ");
		
		System.out.println("\n------------------------------------------");
		food = "골뱅이,치킨,맥주,과일,닭발,소주,피자";
		foodArr = food.split("\\,");// 콤마는 원래가능하지만 주로 역슬래시 두개를 찍어준다. -->정규표현식!
		for(int i=0;i<foodArr.length;i++) System.out.print(foodArr[i]+"  ");
		
		System.out.println("\n------------------------------------------");
		food = "골뱅이,치킨 맥주\t과일 닭발.소주/피자";
		foodArr = food.split("\\,|\\.|\\ |\\t|\\/");// 여러가지 구분자 사용을 위해 |(or)을 사용한다.
		for(int i=0;i<foodArr.length;i++) System.out.print(foodArr[i]+"  ");
		
		// StringTokenizer 클래스  ==> 문자열이 한 종류의 구분자로 연결되어 있을 경우, StringTokenizer 클래스를 사용하면 손쉽게 문자열(토큰:token)을 분리해낼 수 있다. 
		//                           StringTokenizer 객체를 생성할 때 첫 번째 매개값으로 전체 문자열을 주고, 두 번째 매개값으로 구분자를 주면 된다.
		//	                                            만약 구분자를 생략하면 공백(Space)이 기본 구분자가 된다.	(구분자가 한종류 일 경우)                          
		System.out.println("\n==== 6. StringTokenizer st = new StringTokenizer('문자열', '구분자') ==== ");
		String names = "일지매/이지매/삼지매/사지매/오지매";
		StringTokenizer st2 = new StringTokenizer(names, "/");
		/*
		     int        st1.countTokens()   ==>  꺼내지 않고 남아 있는 토큰의 수
		     boolean    st1.hasMoreTokens() ==>  남아 있는 토큰이 있는지 여부
		     String     st1.nextToken()     ==>  토큰을 하나씩 꺼내옴  
		     
		     nextToken() 메소드로 토큰을 하나 꺼내오면 StringTokenizer 객체에는 해당 토큰이 없어진다.
		         만약 StringTokenizer 객체에서 더 이상 가져올 토큰이 없다면 nextToken() 메소드는
		     java.util.NoSuchElementException 예외를 발생시킨다.
		         그래서 nextToken() 메소드를 사용하기 전에 hasMoreTokens() 메소드로 꺼내올 토큰이 있는지
		         조사한 후  nextToken() 메소드를 호출하는 것이 좋은 코딩이다. */
		
		while(st2.hasMoreTokens()) {
			String token = st2.nextToken();
			System.out.println(token);
		}
		System.out.println("");
		
		st2 = new StringTokenizer(names, "/");
		int length = st2.countTokens();
		for(int i=0;i<length;i++) {
			String token = st2.nextToken();
			System.out.println(token);
		}
		System.out.println("");
		//String.join(구분자,문자열 배열) :문자열 배열을 구분자로 합쳐서 하나의 문자열로 반환 
		System.out.println("\n==== 7. String.join(구분자,문자열 배열) ");
		String[] nameArr = {"한지민","두지민","세지민","네지민"};
		String name=String.join("-", nameArr);
		System.out.println(name);
		
		System.out.println("");
		
		//String 문자열.replaceFirst(변경대상 문자열, 새로이 변경 될 문자열) : 변경대상 문자열중 첫번째만 새로이 변경될 문자열로 반환
		System.out.println("\n==== 8. String 문자열.replaceFirst(변경대상 문자열, 새로이 변경 될 문자열) ");
		name = name.replaceFirst("지민", "JiMin");
		System.out.println(name);
		
		System.out.println("\n==== 9. String 문자열.replaceAll(변경대상 문자열, 새로이 변경 될 문자열) ");
		name = name.replaceAll("지민", "JiMin");
		System.out.println(name);
		
		System.out.println("");
		//주로 확장자같이 뒤에 붙는것에 사용된다.
		System.out.println("\n==== 10. boolean 문자열.endsWith(문자열) ");
		String[] fileNameArr = {"안녕.hwp","GoodMorning.txt","행복.txt","안녕하세요.xls"};
		for(int i=0;i<fileNameArr.length;i++) {
			//.txt로 끝나는 파일 찾기
			if(fileNameArr[i].endsWith(".txt")) System.out.println(fileNameArr[i]);}
		
		System.out.println("");
		//주로 확장자같이 뒤에 붙는것에 사용된다.
		System.out.println("\n==== 11. boolean 문자열.startsWith(문자열) ");
		for(int i=0;i<fileNameArr.length;i++) {
			//안녕으로 시작하는 파일 찾기
			if(fileNameArr[i].startsWith("안녕")) System.out.println(fileNameArr[i]);}
		System.out.println("");
		
		str = "My Name is Tom";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		//문자열 비교 (대소문자 구분함)or문자열비교(대소문자 구분하지않음)
		String str2 = "my name IS Tom";
		System.out.println(str.equals(str2)); //대소문자 구분함
		System.out.println(str.equalsIgnoreCase(str2)); //대소문자 구분하지 않음
		
	}
}
