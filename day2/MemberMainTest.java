//import Member1; 동일한 폴더에 있을시엔 import를 안해도 된다.

public class MemberMainTest 
{
	public static void main(String[] args) 
	{
		Member1 me = new Member1();
		me.id="choihyunyoung";
		me.pw="qwer1234";
		me.name="최현영";
		me.age=25;
		me.adress="강북구 수유동";
		
		me.showInfo();
	}
}
