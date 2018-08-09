package my.day3;

public class Customer {
	String userid;
	String pw;
	String name;
	int age;
	String addr;

	public static void main(String[] args) {

	}
	public void showInfo() {
		System.out.println("\n-------- Infomation --------\n");
		System.out.println("ID : "+userid);
		System.out.println("PW : "+pw);
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Adress : "+addr);
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

}
