/* [객체지향 프로그래밍(Object Oriented Programming)이란?]
 * 
 * 	※OOP의 특징 4가지(!!!필수암기!!!)
 *  1. 상속성
 *  2. 추상화
 *  3. 캡슐화
 *  4. 다형성
 * 
 * 
 * 구인구직 어플리케이션 프로그래밍 제작시 필요한 요소
 * 구직자, 구인회사, 채용 등등등...
 * 이러한 요소들이 객체인데 이 객체를 만드는 설계도면이 클래스이다.
 * 
 * 위와 같이 현실세계에 존재하는 다양한 객체들을 하나하나 추상화 시켜서 클래스로 옮기는 것을 객체지향 프로그래밍이라고 한다.
 * 
 * 여기서 추상화(Abstraction)란?
 *  - 일반적인 의미의 추상화란 어떤 물체에서 주된 특징을 부각시켜 표현하고 , 나머지 부분은 과감하게 생략하는것을 말한다.
 *    추상화의 반대는 아주 시시콜콜 한것(세세한것)까지 전부 몽땅 다묘사하는 것을 말하는데 이것을 정밀화 라고 말한다.
 * 	   객체지향 프로그래밍(OOP)에서 사용ㄷ괴는 추상화도 이와 비슷하다
 *    어떤하나의 물체를 대표하는 속성(명사, 인스턴스 멤버변수)과 기능(동사, 메소드)을 추출해내는것을 
 *    객체지향프로그래밍에서 추상화라고 한다.
 *    
 *    >>에를들어, 구인구직 어플리케이션 제작시 필요한 요소중 하나인 "구직자"에 대해서 알아보자
 *    "구직자"가 가지고 있는 속성(명사, 멤버변수)과 행동양식(기능, 동사, 메소드)을 뽑아보자.
 *    1)속성(Property, attributr, field)은 멤버변수가 되고, 
 *    2)행동양식(기능)은 메소드가 되는 것읻다.
 *    
 *    JobSeeker(클래스)
 *    	|
 *    	|-- 속성 : ID,PW,Name,PhoneNumber,Email,학력,희망구직직종,희망연봉...
 *    	|-- 행동양식(메소드) : 구직자로 로그인하는 기능, 구직자 정보조회기능, 구직자 정보변경기능, 
 *    
 */

package my.day11;

import java.text.DecimalFormat;
import java.util.Calendar;

public class JobSeeker {
	//*** 클래스 속성 정하기(추상화 작업)
	String userid; //아이디
	String pw; //비밀번호
	String name; //이름
	String birth; //(예: 19941116) 
	int	   gender; //성별 "남"=1,"여"=2 "똘똘이" 유효성 검사 -- 유츄할수 있는 데이터 값은 반드시 코드화
	String adress; //주소
	String school; //학력 "대졸이상"=1,"초대졸"=2,"고졸"=3,"고졸미만"=4
	String mobile; // 휴대폰번호
	String hopejob; //직종("사무직"=1,"생산직"=2,"일용직"=3)
	int    hopemoney;
	
	static int cnt =0; // 생성된 객체 갯수
	
	public JobSeeker() {cnt++;}
	
	public JobSeeker(String userid, String pw, String name, String birth, int gender, String adress, String school,
			String mobile, String hopejob, int hopemoney) {
		this.userid = userid;
		this.pw = pw;
		this.name = name;
		this.birth = birth;
		this.gender = gender;
		this.adress = adress;
		this.school = school;
		this.mobile = mobile;
		this.hopejob = hopejob;
		this.hopemoney = hopemoney;
		cnt++;
	}
	//구직자가 로그인 할수 있는 기능
	public boolean login(String userid, String pw) { //static을 써버리면 인스턴스변수와 비교불가
		if(userid.equals(this.userid)&&pw.equals(this.pw)) return true;
		else return false;
	}
	//구직자의 현재 나이 조회
	public int getAge() {
		Calendar currentdate = Calendar.getInstance(); // 현재날짜와 시간을 얻어온다.
		int year = currentdate.get(Calendar.YEAR);
		int age = (year-(Integer.parseInt(birth.substring(0, 4))))+1;
		return age;
	}
	//성별 반환
	public String getGender(int gender) {
		String str="";
		switch(gender) {
		case 1: str+="남자"; break;
		case 2: str+="여자"; break;
		}
		return str;
	}
	//학력 반환
	public String getSchool(String school) {
		String str="";
		switch(school) {
		case "1": str+="대졸이상"; break;
		case "2": str+="초대졸"; break;
		case "3": str+="고졸이상"; break;
		case "4": str+="고졸미만"; break;
		}
		return str;
	}
	//희망급여를 알아오는 기능
	public String getHopeMoney(int hopemoney) {
		DecimalFormat df= new DecimalFormat("#.###");
		String str=df.format(hopemoney);
		return str+"만 원";
	}
	//구직자의 정보조회
	public String getInfo() {
		String info = "* "+name+"님의 프로필 \n"
				+ "1. 아이디 : "+userid +"\n"
				+ "2. 암   호 : "+pw +"\n"
				+ "3. 이   름 : "+name +"\n"
				+ "4. 나   이 : "+getAge() +"\n"
				+ "5. 성   별 : "+getGender(gender) +"\n"
				+ "6. 주   소 : "+adress +"\n"
				+ "7. 학   력 : "+getSchool(school) +"\n"
				+ "8. 연락처 : "+mobile +"\n"
				+ "9. 희망직종 : "+hopejob +"\n"
				+ "10. 희망연봉 : "+getHopeMoney(hopemoney) +"\n";
		return info;
	}
}
