package my.day18;

import java.util.*;

public class Employeemain implements InterEmployee {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Employeemain empmain = new Employeemain();
		
		/*	조회할 부서번호 : 10
		 * 	10번 부서에 근무하는 사원들만 출력
		 * */
		Map<String, List<Employee>> map =new HashMap<String,List<Employee>>();
		List<Employee> emp10 = new ArrayList<Employee>();
		emp10.add(new Employee("10","E001","최현영","부장"));
		emp10.add(new Employee("10","E002","한재민","과장"));
		emp10.add(new Employee("10","E003","금시은","차장"));
		map.put("10", emp10);
		
		List<Employee> emp20 = new ArrayList<Employee>();
		emp20.add(new Employee("20","E004","이상원","부장"));
		emp20.add(new Employee("20","E005","이하원","과장"));
		emp20.add(new Employee("20","E006","이중원","차장"));
		emp20.add(new Employee("20","E007","이상투","차장"));
		map.put("20", emp20);
		
		List<Employee> emp30 = new ArrayList<Employee>();
		emp30.add(new Employee("30","E008","박남정","부장"));
		emp30.add(new Employee("30","E009","박여정","과장"));
		map.put("30", emp30);
		
		System.out.print("* 조회 할 부서번호 : ");
		int deptno = Integer.parseInt(scan.nextLine());
		System.out.println(empmain.showDeptInfo(deptno, map));
		
		System.out.println("-------------------------");
		System.out.print("* 직급을 변경하려는 부서번호 입력 : ");
		deptno = Integer.parseInt(scan.nextLine());
		System.out.print("* 변경할 직급명 : ");
		String change = scan.nextLine();
		empmain.changeJik(deptno, change, map);
		System.out.println(empmain.showDeptInfo(deptno, map));
		
		scan.close();
	}
	public void menu() {
		System.out.println("-------------------------");
		System.out.println("1. 부서 조회하기 ");
		System.out.println("2. 부서전체 직급변경 ");
		System.out.println("3. 직원 직급변경 ");
		System.out.println("-------------------------");
		System.out.print(">> 번호 선택 : ");
		
	}
	@Override
	public String showDeptInfo(int deptno,Map<String,List<Employee>> map) {
		StringBuilder builder = new StringBuilder();
		String info="";
		List<Employee> emplist = map.get(deptno);
		if(emplist!=null) {
			for(Employee emp : emplist) {
				builder.append(emp.getEmployee());
			}
			info = builder.toString();
		}
		else System.out.println("* 검색하시려는 부서번호 "+deptno+"은 존재하지 않습니다.");
		return info;
	}
	@Override
	public void changeJik(int deptno ,String change,Map<String,List<Employee>> map) {
		List<Employee> emplist = map.get(deptno);
		if(emplist!=null) {
			List<Employee> empchangelist =map.get(deptno);
			for(Employee emp : empchangelist) {
				emp.setJik(change);
			}
		}
		else System.out.println("* 변경할 데이터가 없습니다.");
	}
	@Override
	public void changeSalary(Map<String, List<Employee>> map, String deptno, double percent) {
		// TODO Auto-generated method stub
		
	}
}
