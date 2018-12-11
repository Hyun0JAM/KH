package my.day17;

public class ExceptionTest1 {

	public static void main(String[] args) {
		String[] subArr= {"Java","Oracle","JSP"};
		try {
			for(int i=0;i<subArr.length+1;i++) {
				System.out.println(subArr[i]);
			}
		} catch (Exception e) {
			
		}
	}
}
