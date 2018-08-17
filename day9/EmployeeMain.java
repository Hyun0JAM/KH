package my.day9;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		
		emp1.name = "한석규";
		emp1.salary = new int[]{100,200,300,400,500,600,700,800,900,1000,1100,1200};
					// {1,2,3,4,5,6,7,8,9,10,11,12}; 객체 내의 배열에 바로 이 방식으로 선언불가
		/* 1. 사원명 : 한석규
		 * 2. 급여합계 : 7,800만원
		 * 3. 평균급여 : 650.0만원
		 * */
		
		Employee emp2 = new Employee();
		emp2.name = "최현영";
		emp2.salary = new int[]{100,200,300,400,500,600};
		
		Employee emp3 = new Employee();
		emp3.name = "한재민";
		emp3.salary = new int[]{100,200,300,400};
		
		Employee[] empArr = {emp1, emp2, emp3};
		
		Employee emp = new Employee();
		emp.showEmployeeAllInfo(empArr);
		
		System.out.println("-----------------------");
		for(Employee e:empArr) {
			e.showEmployeeInfo();
			System.out.println("");
			}
		System.out.println("-----------------------");
		int[] sal = emp3.getSalary();
		System.out.println("* "+emp3.name+"님의 월급 내역  ");
		for(int i=0;i<sal.length;i++) {
			String str = (i<sal.length-1)?" / ":"";
			System.out.print(i+1+"월 : "+sal[i]+str);
		}
		System.out.println("\n-----------------------");
		int[] newsalary = {110,220,330,440};
		emp3.updateSalary(newsalary);
		int[] sal2 = emp3.getSalary();
		System.out.println("* "+emp3.name+"님의 월급 내역  ");
		for(int i=0;i<sal2.length;i++) {
			String str = (i<sal2.length-1)?" / ":"";
			System.out.print(i+1+"월 : "+sal2[i]+str);
		}
		
		
	}
}
