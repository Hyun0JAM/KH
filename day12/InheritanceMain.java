package my.day12;

public class InheritanceMain {

	public static void main(String[] args) {
		
		Man man1 = new Man();
		man1.name = "이순신";
		man1.height =182.5F;
		man1.weight = 75;
		man1.goArmyDay = "2018-10-20";
		
		Woman woman1 = new Woman();
		woman1.name = "박보영";
		woman1.height = 165.4f;
		woman1.weight = 59;
		woman1.childBirthDay = "2018-10-20";
		
		
		Man man2 = new Man("슈펴맨", 198.5F, 97,"2018-10-20");
		Woman woman2 = new Woman("원더우먼",175.7F,54,"2018-12-15");
		
		System.out.println("===================================");
		man1.showGoArmyDay();//이순신 입대일자
		man2.showGoArmyDay();//슈퍼맨의 입대일자 
		System.out.println("");
		woman1.showChildBirthDay();//박보영
		woman2.showChildBirthDay();//원더우먼
	
		System.out.println("===================================");
		man1.showInfo();//Human 매소드
		/* 1.성명 : 이순신
			2.신장 : 182.5cm
			3.체중 : 75kg
		*/
		woman1.showInfo();
		/*	1.성명 : 박보영
			2.신장 : 165.4cm
			3.체중 : 59kg
			*/
		///////////////////////////////////////////////////////
		//override 후 매소드 재정의 시 부모의 매소드가 아닌 자기 자신의 매소드를 사용한다.
		
		man1.showInfo();//Man 매소드
		/*
			1.성명 : 이순신
			2.신장 : 182.5cm
			3.체중 : 75kg
			4. 입대일자 : 2018-10-20 
		 */
		
		
	}

}
