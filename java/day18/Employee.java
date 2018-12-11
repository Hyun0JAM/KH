package my.day18;

public class Employee{
	private String deptno;//부서번호
	private String eno; //사원 코드번호
	private String name;//사원명
	private String jik;//직급
	
	public Employee() {}
	public Employee(String drptno, String eno, String name, String jik) {
		super();
		this.deptno = drptno;
		this.eno = eno;
		this.name = name;
		this.jik = jik;
	}
	public String getDrptno() {
		return deptno;
	}
	public void setDrptno(String drptno) {
		this.deptno = drptno;
	}
	public String getEno() {
		return eno;
	}
	public void setEno(String eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJik() {
		return jik;
	}
	public void setJik(String jik) {
		this.jik = jik;
	}
	public String getEmployee() {
		String info="";
		info="-----------------------"
				+"\n1. 부서번호 : "+deptno
				+"\n2. 사원코드번호 : "+eno
				+"\n3. 사원명 : "+name
				+"\n4. 직급 : "+jik+"\n";
		return info;
	}
	@Override
	public String toString() {
		String info="";
		info="-----------------------"
				+"\n1. 부서번호 : "+deptno
				+"\n2. 사원코드번호 : "+eno
				+"\n3. 사원명 : "+name
				+"\n4. 직급 : "+jik+"\n";
		return info;
	}
}
