package my.day13.sub;

public class Recruit {
	//Recruit 클래스의 추상화 작업하기
	
	private Company com;//구인회사
	private String gender;//채용성별[1.남 / 2.여 / 3. 성별무관]
	private int minage;//채용최소나이
	private int maxage;//채용 최대나이
	private String school;//채용학력[1.대졸이상 / 2.초대졸 / 3.고졸 / 4.학력무관]
	
	static int cnt=0;
	
	public Recruit() {cnt++;}
	public Recruit(Company com, String gender, int minage, int maxage, String school) {
		this.com = com;
		this.gender = gender;
		this.minage = minage;
		this.maxage = maxage;
		this.school = school;
		cnt++;
	}
	public Company getCom() {
		return com;
	}
	public void setCom(Company com) {
		this.com = com;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getMinage() {
		return minage;
	}
	public void setMinage(int minage) {
		this.minage = minage;
	}
	public int getMaxage() {
		return maxage;
	}
	public void setMaxage(int maxage) {
		this.maxage = maxage;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		String strSchool = "";
		switch(school) {
			case "1": 
				strSchool="대졸이상"; 
				break; 
			case "2":
				strSchool="초대졸"; 
				break;
			case "3":
				strSchool="고졸이상"; 
				break;
			case "4":
				strSchool="학력무관"; 
				break;
			default: break;
		}
		this.school = strSchool;
	}
	//채용 공고를 보여주는 기능의 메소드
	public String getRecruitInfo() {
		String info ="";
		info = "* "+com.getName()+"의 채용 공고 ======="+"\n"
				+"* 회사명 : "+com.getName()+"\n"
				+"* CEO : "+com.getName()+"\n"
				+"* 자본금 : "+com.getSeedmoney()+"\n"
				+"* 업종 : "+com.getJobtype()+"\n"
				+"* 주소 : "+com.getAdress()+"\n"
				+"* 연락처 : "+com.getTel()+"\n"
				+"* 채용성별 : "+gender+"\n"
				+"* 채용 연령대 : "+minage+"세~"+maxage+"세 \n"
				+"* 채용학력 : "+school+"\n";
				
		return info;
	}
}
