/* try{}블럭하나에 catch절은 여러개 올 수 있다. 그러나 이때 catch순서에 주의해야한다.
 * 먼저 자식Exception을 기술하고, 부모 Exception을 나중에 기술해야한다.
 * 
 * */

package my.day17;

public class ExceptionTest8 {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40};
		String str="abcd";
		
		for(int i=0;i<arr.length;i++){
			try {
				int result = arr[i] = arr[i]/(3-i)*Integer.parseInt(str);
				System.out.println("* result : arr[i]/(3-"+i+") = "+result);
			} 
			
			catch(ArithmeticException e) {
				System.out.println("* 분모는 0으로 할수 없습니다.");
			}
			catch(Exception e) { //모든 오류가 여기에 포함된다 (최상위 부모객체) 가장 아랫쪽에 위치시킨다.
				System.out.println("* 기타오류발생!!");
				System.out.println(e.getMessage());
			}
			finally { //try문 부분 실행에 있어서 오류(Exception)가 발생 하든지 안하든지 관계없이 try부분의 실행이 끝나고 나서 무조건 실행되어지는 부분이다.
				if(i==arr.length) System.out.println("* 프로그램 종료합니다.");
			}
		}
		System.out.println("* 프로그램 종료합니다.");
	}
}
