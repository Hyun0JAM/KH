package my.day4;

public class OperatorTest {

	public static void main(String[] args) {
		System.out.println("====== 1. 산술연산자 + - * / % >> << >>> ---- ======");
		// x << n x*의 결과 값과 같다. x는 정수형만 가능하다.
		// x >> n x/의 결과 값과 같다. x는 정수형만 가능하다.
		// x >>> n 정수x를 32bit 형태의 2진수로 나타낸후 오른똑으로 n번 이동시키고 빈자리는 0으로 채운다.

		int n =10;
		System.out.println("n+3 = "+(n+3));
		System.out.println("n-3 = "+(n-3));
		System.out.println("n*3 = "+(n*3));
		System.out.println("n/3 = "+(n/3));
		System.out.println("n%3 = "+(n%3));

		System.out.println("n<<3 = "+(n<<3)); //10 * (2의 3승) = 80
		System.out.println("n>>3 = "+(n>>3)); //10/(2의 3승) = 1
		System.out.println("n>>>3 = "+(n>>>3));

		/*10을 32비트 형태의 2진수로 나타내면
		00000000 00000000 00000000 00001010
		1*2의3승 + 0*2의2승 + 1*2의1승 + 0*2의0승 = 8 + 0 + 2 + 0 = 10
		(3번 쉬프트>>>)00000000 00000000 00000000 00000001*/

		System.out.println("\n======== 2. 부호연산자 =============================");
		byte a =5;
		short b = -9;
		System.out.println("-b : "+(-b));
		System.out.println("+a : "+(+a));

		System.out.println("\n======== 3. 증감연산자 ++,-- =======================");
		int c=7;
		long d=3L;
		c++; // c = c+1; 매번 1증가한다.
		System.out.println("c : "+c);
		d--;
		System.out.println("d : "+d);
		++c; // 전위 증가  c++ 후위증가연산
		--d;
		System.out.println("c : "+c);
		System.out.println("d : "+d);
		//후위 증감연산자 'c++;' 다른연산을 다 마친 이후에 1을 증감한다.
		//전위 증감연산자 '++c;' 맨먼저 1을 증감을 마친 이루에 다른 연산을 한다.
		System.out.println("c : "+ c++); //9
		System.out.println("c : "+ c); //10
		System.out.println("c : "+ ++c); //11

		System.out.println("-------- 퀴즈 ------------------------------------");
		int x=10, y=10;
		int z=++x;
		System.out.println("z = "+z); //11
		System.out.println("x = "+x); //11
		z = y++;
		System.out.println("z = "+z); //10
		System.out.println("y = "+y); //11
		x=20;
		z=x++;
		System.out.println("z = "+z); //20
		System.out.println("x = "+x); //21

		System.out.println("\n======= 4. 비트별 not 연산자 : ~ ===================");
		// 주어진 정수 값을 32비트 형태의 2진수로 바꾸어서 나타내는데 0은 1로 1은 0으로 바꾸어 주는것이다.

		int m =42;
		System.out.println("~m : "+~ m); // 00000000 00000000 00000000 00101010
										// 11111111 11111111 11111111 11010100
		//첫번쨰 비투는 부호비트로 사용되어지는데 0은 +를 의미하고 1은 -를 의미한다 즉 음수를 뜻할 경우에는 아래와 같이 구현한다.
		// 똑같은 1이 나오는 것중에서 마지막 1만 취하고 여시에다가 그나머지를 끝까지 취한다.
		// 첫번째 값만 -를 붙이고 나머지 값은 +로 연산을 하면된다.

		System.out.println("\n======= 5. 논리 부정 연산자 =========================");
		boolean bool =false;
		System.out.println("bool : "+bool); //false
		System.out.println("bool : "+!bool); //true

		System.out.println("\n======= 6. 비트 연산자 : & | ^ ====================");
		/*
		 * & ( and연산자 ) 1&1=1,
		 * | ( or연산자 ) 1|0 =0, 1|1=1
		 * ^ ( xor연산자) 서로 달라야만 1
		 * 연산되어지는 계산이 정수일때만 가능하다.
		 */

		int x1 =3;
		int y1 =5;
		System.out.println("x1 & y1 : "+(x1&y1));
		System.out.println("x1 | y1 : "+(x1|y1));
		System.out.println("x1 ^ y1 : "+(x1^y1));
		/* & (and)
		 * 00000011 = 3
		 * 00000101 = 5
		 * --------
		 * 00000001 = 1
		 *
		 * | (or)
		 * 00000011 = 3
		 * 00000101 = 5
		 * --------
		 * 00000111 = 7
		 *
		 * ^ (xor)
		 * 00000011 = 3
		 * 00000101 = 5
		 * --------
		 * 00000110 = 6
		 * */

		System.out.println("\n======== 7. 논리 연산자 && || =====================");
		// 논리 연산자 & | && || 의 대상은 참, 거짓이다.
		int a1=50, b1=60;
		boolean bool2 = (a1 > b1) & (a1 > 0);
						// F     and     T      = false
		System.out.println("bool2 : "+bool2);

		bool2 = (a1 > b1) | (a1 > 0);
			    //   F    or    T      = true
		System.out.println("bool2 : "+bool2);

		bool2 = (a1 > b1) && (a1 > 0);
				//   F   and   skip      = false
		System.out.println("bool2 : "+bool2);

		bool2 = (a1 > b1) || (a1 > 0);
		//   F          = false
		System.out.println("bool2 : "+bool2);

		System.out.println("\n=================== 퀴즈  ========================");
		int i = 1;
		int j = i++;
		if((i>++j)&(i++ == j))  i=j+i;
		System.out.println("i = "+i);

		i = 1;
		j = i++;
		if((i>++j)&&(i++ == j))  i=j+i;
		System.out.println("i = "+i);

		int m1=0, n1=1;
		if((m1++ == 0)| (n1++ ==2))  m1=42;
		System.out.println("m1 =  "+m1+"  n1 = "+n1); //

		boolean k1 = false;
		boolean k2 = false;
		boolean k3 = ((k1==true)|(k2==true));
		System.out.println(k1+","+k2+","+k3);

		System.out.println("\n======= 8. 비교 연산자 == < > != <= >= =============");

		System.out.println("\n======= 8. 할당 연산자 ============================="); // 연산후 대입 연산
		int no = 1;
		no+=3;
		System.out.println("no : "+no);

		no=10;
		no-=3;
		System.out.println("no : "+no);

		no*=3;
		System.out.println("no : "+no);

		no%=2;
		System.out.println("no : "+no);

		no^=5; // 0001 ^ 0101 = 0010
		System.out.println("no : "+no);

		no<<=3; // 4*2의 3승
		System.out.println("no : "+no);

		System.out.println("\n====== 10. 삼항 연산자 (if, else 와 같음) =============");
		// 변수선언 = (조건식)?값1 : 값2; - 변수를 선언하고나서 값을 부여하고자 할때 사용되어지는데 조건식이 참이라면 변수에 값1이 들어가고 조건식이 거짓이라면 변수에 값2가 들어간다.
		int no1 =50, no2 =60;
		int result = (no1>no2)?no1:no2;
		System.out.println("result : "+result); // 거짓이므로 값2인 60이 된다.

		/* -- 연산자 우선순위 --
		 * 높음	단항연산자 : +(양수), -(음수), ~, (), ++, --
		 * 		산술연산자 : *, /, %, +, -, >>, <<, >>>
		 * 		비교연산자 : >, <, >=, <=, ==, !=
		 * 		논리연산자 : &, |, ^, &&, ||
		 * 		삼항연산자 : ? :
		 * 낮음	대입연산자 : =, +=, -=, *+, /=, %=, >>=, <<=, >>>= 		*/

		int num = 10;
		String str = (num >>> 3 >= 2) && (1>0)?"참입니다.":"거짓입니다.";
		System.out.println(str);

	}

}
