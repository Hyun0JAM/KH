package my.day13.sub;

import java.text.DecimalFormat;

public class Company extends Common {

	private String ceo; //회사대표
	private long seedmoney; //자본금
	private String jobtype; //직종
	
	public Company() {super.cnt++;} //this.cnt++도 가능

	public Company(String ceo, long seedmoney, String jobtype) {
		super(); //부모클래스의 생성자가 가장첫줄
		this.ceo = ceo;
		this.seedmoney = seedmoney;
		this.jobtype = jobtype;
		super.cnt++;
	}
	public Company(String id,String pw,String name,String adress,String tel,String ceo, long seedmoney, String jobtype) {
		super(id,pw,name,adress,tel); 
		this.ceo = ceo;
		this.seedmoney = seedmoney;
		this.jobtype = jobtype;
		super.cnt++;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getSeedmoney() {
		DecimalFormat df = new DecimalFormat("#,###");
		String str=df.format(seedmoney)+"만 원";
		return str;
	}

	public void setSeedmoney(long seedmoney) {
		this.seedmoney = seedmoney;
	}

	public String getJobtype() {
		return jobtype;
	}

	public void setJobtype(String jobtype) {
		this.jobtype = jobtype;
	}
	
	//구인회사의 정보조회
	public String getCompanyInfo() {
		String info = "* "+getName()+" 회사의 정보 \n"
				+commonInfo().replaceAll("아이디 : ","회사명 : ")
				+"* 대표자명 : "+ceo +"\n"
				+"* 자본금 : "+getSeedmoney()+"\n"
				+"* 업  종 : "+jobtype;
		return info;
	}
}
