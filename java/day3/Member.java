package my;

public class Member {
	String userid;
	String pwd;
	String name;
	int age;

	static int count=0; //Member클래스로 생성되어진 객체의 갯수를 누적시키는 용도로 써본다.

	public Member() {
		count++;
	}

	public Member(String userid,String name, String pwd, int age) {
		this.userid= userid;
		this.pwd = pwd;
		this.name = name;
		this.age= age;

		count++;
	}

	//리턴 반환 타입 없는 메소드 생성하기
	public void showInfo() { //static에서는 static변수만 사용가능하다.
		System.out.println("\n==============="+ name +"님의 정보===============");
		System.out.println(" 1. 아이디 : "+userid);
		System.out.println(" 2. 비밀번호 : "+pwd);
		System.out.println(" 3. 이름 : "+name);
		System.out.println(" 4. 나이 : "+age);
		System.out.println(" 5. 생성된 객체수 : "+count);
	}

	public String returnShowInfo() {
		String info = "\n >>> "+name+"님의 정보\n 1. 아이디 : "+userid+"\n 2. 비밀번호 : "+pwd+"\n 3. 나이 : "+age;
		return info;
	}

	public void changeVal(String pwd, int age) {
		this.pwd = pwd;
		this.age = age;
	}
	public String returnChangeVal(String pwd, int age) {
		this.pwd = pwd;
		this.age = age;
		//String info = "\n ********** "+name+"님의 정보\n 1. 아이디 : "+userid+"\n 2. 비밀번호 : "+pwd+"\n 3. 나이 : "+age;
		//String info = returnShowInfo();
		return returnShowInfo();
	}

	//static메소드 생성하기
	public static void showCount() {
		System.out.println(" -----지금까지 생성된 객체수  : "+count);
	}
}
