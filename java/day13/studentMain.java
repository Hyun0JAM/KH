package my.day13;

public class studentMain {
	public static void main(String[] args) {
		Student st1 = new Student();

		st1.setSno("01");
		st1.setName(" 최현영 ");
		st1.setNum("0103546861");

		System.out.println(st1.getSno());
		System.out.println(st1.getName());
		System.out.println(st1.getNum());
		
		System.out.println("---------------------------------");
		
		Student st2 = new Student();
		st2.setSno("0011");
		st2.setName("  ");
		st2.setNum("01035468617");

		System.out.println(st2.getSno());
		System.out.println(st2.getName());
		System.out.println(st2.getNum());
	}
}
