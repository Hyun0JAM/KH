/*
	=== ������ ���� ===

	1.�������(member����)
		a. Ŭ��������(= static)
		b. �ν��Ͻ�����(= non static)

		--��������� ���Ǿ����� ������ �ش� Ŭ���� ������ ��𼭳� ��밡���ϴ�.
		--��������� ����Ǿ����� ��ġ�� �Ϲ������� �ش� Ŭ������ �ٷ� �Ʒ��� �����Ѵ�.
		--���� ������ ���� �ο�(= ������ �ʱ�ȭ)���� �ʴ��� ��������� �ڵ������� �ڹٰ���ӽ��� �⺻���� �ο��� �ش�.

		������(byte, short, int, long)Ÿ���� �⺻���� 0���� �ʱ�ȭ�ǰ�
		�Ǽ���(double,float)Ÿ���� �⺻���� 0.0���� �ʱ�ȭ�ȴ�.
		������(char)Ÿ���� �⺻���� ����(space)' ' ���� �ʱ�ȭ �ǰ�
		Object Ÿ���� �⺻���� null(�������� �ʴ°� = ����)�� �ʱ�ȭ�ȴ�.

		Ŭ��������(Static����)�� �����ϱ� ���ؼ��� ��ü(Object)�� �������� �ʰ� �ٷ� 'Ŭ������.Ŭ��������'�� �����Ѵ�. 
		Ŭ���������� �ش� Ŭ������ �����Ǿ��� ��ü���� �����ؼ� ����Ѵ�.

		�ν��Ͻ�����(non Static����)�� ������ �ϱ� ���ؼ��� �ݵ�� ��ü�� �������� '��ü��.�ν��Ͻ�' ������ �����Ѵ�.
		�ν��Ͻ� ������ �ش簴ü������ ����ϴ°��̴�.

		Ŭ���������� Ŭ������ ����Ǿ����� �����Ǿ�����, �ν��Ͻ������� ��ü�� ����� �����Ǿ�����.

		�ش� ���α׷��� ����Ǹ� Ŭ���������� �ν��Ͻ������� ���̻� ������� �����Ⱑ �ǹǷ� 
		�ڹٰ���ӽ��� garbege collecter�� �۵��Ͽ� �ڵ������� �޸𸮿��� �Ҹ�����ش�

	2. ��������(Local ����) : ���Ǿ����� ������ ���������� ������ '{ ... }'�������� ��밡���ϴ�.
		���������� ����Ǿ��� ��ȣ���� ����� �ڵ������� �Ҹ��Ѵ�.
		���������� Ư�� �޼ҵ忡���� ������(instructor)������ ����Ǿ����� ���̴�.
		���������� �ݵ�� �ʱ�ȭ ���־�߸� �Ѵ�.
*/
//import java.lang.*;

public class Day2  
{
	int a=10; //���⼭ '='�� ���ٰ� �ƴ϶� � ���� �����Ѵٴ� ���̴�.(���Կ�����)/������ʱ�ȭ
	int b;
	static int c;
	String adress;
	String name;
	String userid;
	String password;

	public static void main(String[] args) 
	{
		Day2 myobj = new Day2();
		//myobj�� Ŭ���� Day2�� ��ü����(�ν��Ͻ�_instance)��� �θ���.
		//'new Day2'�� ��ü�����̶�� �ϰ� �ν��Ͻ�ȭ �Ѵٰ� �Ѵ�.

		System.out.println("a : " + myobj.a);
		//a : 10
		//"���ڿ�" + ������ ������ ���ϱⰡ �ƴ϶� ���ڿ� ������ ���Ѵ�.
		//"���ڿ�" + 10 �� "���ڿ� 10"���� ���´�. 
		System.out.println("b : " + myobj.b); 

		System.out.println("name : " + myobj.name);

		System.out.println("-----------------�������---------------");

		Day2 me= new Day2();
		Day2 you= new Day2();
	
		me.name="������";
		me.userid="daiunii";
		me.password="qwer1234";
		me.adress="���ϱ� ������"; //��� ���� ���º��� static���� ������ �� ���� �����

		you.name="������";
		you.userid="yourid";
		you.password="adsf0070";
		
		System.out.println("\n========= ��ü 'me'�� ���� =========\n");
		System.out.println("�̸� : " + me.name);
		System.out.println("ID : " + me.userid);
		System.out.println("PW : " + me.password);

		System.out.println("\n========= ��ü 'you'�� ���� ========\n");
		System.out.println("�̸� : " + you.name);
		System.out.println("ID : " + you.userid);
		System.out.println("PW : " + you.password);

		System.out.println("c : " +c);  //����
		System.out.println("c : " +myobj.c);  //����
		System.out.println("c : " +Day2.c);  //����

		//System.out.println("adress : " +adress);
		//System.out.println("adress : " +Day2.adress); //����

		me.password="1234";

		System.out.println("\n========= ��ü 'me'�� ���� =========\n");
		System.out.println("�̸� : " + me.name);
		System.out.println("ID : " + me.userid);
		System.out.println("PW : " + me.password);
		System.out.println("PW : " + me.adress);
		System.out.println("\n========= ��ü 'you'�� ���� ========\n");
		System.out.println("�̸� : " + you.name);
		System.out.println("ID : " + you.userid);
		System.out.println("PW : " + you.password);
		System.out.println("PW : " + you.adress);

		System.out.println(" -----------------��������---------------");

		int d;
		d = 0;

		int e=0;

		System.out.println("d : " + d); //�ݵ�� �ʱ�ȭ�� ���־�� �Ѵ�.
		System.out.println("e : " + e); 

	}
	
	/*d=10;
	e=50;    ���������� �ش� ��ȣ�� ����� �ڵ����� �Ҹ�Ǿ����Ƿ� ����!!*/
}
