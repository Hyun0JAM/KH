public class Member2{
  String id;//아이디 (문자열)
	String pw;//암호 (문자열)
	String name;//성명 (문자열)
	int age;//나이 (정수형)
  String adress;//주소 (문자열)

		public Member2(){}; //기본생성자 생략
		/*
			기본생성자는 파라미터가 있는 생성자가 없을 경우 자동으로 등록되어지지만
			파라미터가 있는 생성자가 있을 경우 자동으로 등록이 안되어진다.
			그러므로 파라미터가 있는 생성자가 있을 경우에는 반드시 기본생성자를 생성해주어야 한다!!
		*/
    public Member2(String id,String pw,String name,int age,String adress){
		this.id=id; //멤버변수의 이름과 지역변수의 이름은 동일하다. 지역변수의 이름이 우선한다.
		this.pw=pw; //this 생성되어지는 객체를 말한다.
		this.name=name; //그래서 멤버변수명과 지역변수명이 동일할 경우 구분짓기 위한 방법이
		this.age=age;  //this.멤버변수명 으로 구분짓는다
		this.adress=adress;
    }

    public void showInfo(){
		System.out.println("==========================");
		System.out.println(" 1. 이름 : "+this.id);
		System.out.println(" 2. 암호 : "+this.pw);
		System.out.println(" 3. 이름 : "+this.name);
		System.out.println(" 4. 나이 : "+this.age);
		System.out.println(" 5. 주소 : "+this.adress);
		System.out.println("==========================");
    }
}
