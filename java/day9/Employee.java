package my.day9;

import java.text.DecimalFormat;

public class Employee {
	String name;
	int[] salary;
	
	public void showEmployeeInfo() {
		DecimalFormat df = new DecimalFormat("#,###");
		
		System.out.println("1. 성명 : "+name);
		
		int sum =0;
		double avg =0;
		
		for(int i=0;i<salary.length;i++) sum +=salary[i];
		System.out.println("2. 급여 합계 : "+df.format(sum)+"만 원");
		avg=Math.round((double)((sum/salary.length)*10.0)/10.0);
		System.out.println("3. 평균 급여 : "+avg+"만 원");
	}
	public void showEmployeeAllInfo(Employee[] emparr) {
		for(int i=0;i<emparr.length;i++) {
			emparr[i].showEmployeeInfo();
			String str = (i<emparr.length-1)?"\n":"";
			System.out.println(str);
		}
	}
	public int[] getSalary() {
		return salary;
	}
	public void updateSalary(int[] newSalary) {
		salary = newSalary;	
	}
}
