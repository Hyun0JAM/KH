package my.day18;

import java.util.*;

public interface InterEmployee {
	String showDeptInfo(int deptno,Map<String,List<Employee>> map); 
	void changeJik(int deptno, String change,Map<String,List<Employee>> map);
	void changeSalary(Map<String, List<Employee>> map, String deptno, double percent); // 13
}
