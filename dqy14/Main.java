package my.dqy14;

public class Main {
	Common[] comArr = new Common[10];
	Guardian[] guard = new Guardian[5];
	public static void main(String[] args) {
		
		Main main = new Main();
		
		main.comArr[0] = new Common("daiunii","asdf1234.","최현영","cpql@lycos.co.kr");
		main.comArr[1] = new Student("stu01","qwer1234","김상원","kimsw@gmail.com","S001","kim@namver.com","수상경력 아주 많음");
		main.comArr[2] = new Guardian("G001","qwer1234!","최현영","daiunii@naver.com","회사원","02-345-4567");
		
		for(int i=0;i<Common.cnt;i++) {
			if(main.comArr[i] instanceof Student) {
				((Student)main.comArr[i]).showInfo();
			}
			else if(main.comArr[i] instanceof Guardian) {
				((Guardian)main.comArr[i]).showInfo();
			}
		}
		System.out.println("-------------------------------");
		for(int i=0;i<Common.cnt;i++) {
			main.comArr[i].showInfo();
		}
		String userid="stu01";
		String password="qwer1234";
		for(int i=0;i<Common.cnt;i++) {
			if(main.comArr[i] instanceof Student) { //if(main.comArr[i].getId().equals(userid)) 
				Common com = ((Student)main.comArr[i]).login(userid, password);
				com.showInfo();
			}
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(int i=0;i<Common.cnt;i++) {
			if(main.comArr[i] instanceof Student)
				main.comArr[i].login(userid, password);
		}
	}
}
