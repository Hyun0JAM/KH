package my.day12;
/* 
 	=== 다형성 (PolymorphsimMain)===
 	---> 자식 클래스로 생성된 개체는 부모클래스나 인터페이스(interface)의 타입으로 받을 수 있다.
 		이것을 다형성 (PolymorphsimMain)이라한다.
 		
  */
public class PolymorphsimMain {

	public static void main(String[] args) {
		Human[] humanArr = new Human[5];
		Human hm1 = new Human("인간1",171.2F,63);
		
		Man man1= new Man("남자군", 180.4f, 81, "2018-11-20") ;
		Woman woman1 = new Woman("여자양", 167.4f, 52, "2018-10-25");
		
		Human hm2 = new Man("남운도", 189.4f, 71, "2018-12-09") ;
		Human hm3 = new Woman("여수지", 157.4F, 52, "2018-11-25");
		
		humanArr[0] = hm1;
		humanArr[1] = man1;
		humanArr[2] = woman1;
		humanArr[3] = hm2;
		humanArr[4] = hm3;
		// 자식 클래스의 객체를 부모 클래스 배열에 넣을 수 있다.
		if(humanArr[0] instanceof Man) {
			//객체 instanceof 클래스명 : 객체가 클래스의 instance 입니까-> 참 ,거짓
			//-> 거짓
			//hm1 -> new Human, humanArr[0]은 Man으로 받을 수 있습니까?
			
			System.out.println("humanArr[0]은 Man 클래스로 생성된 객체이군요.");
		}
		else System.out.println("humanArr[0]은 Man 클래스로 생성된 객체가 아니군요.");
		
		
		if(humanArr[1] instanceof Man) {
			//객체 instanceof 클래스명 : 객체가 클래스의 instance 입니까-> 참 ,거짓
			//-> 참
			///humanArr[1] -> man1-> new Man, humanArr[1]은 Man으로 받을 수 있습니까
			System.out.println("humanArr[1]은 Man 클래스로 생성된 객체이군요.");
		}
		else System.out.println("humanArr[1]은 Man 클래스로 생성된 객체가 아니군요.");
		
		System.out.println("");
		
////////////////////////////===다형성===///////////////////////////////////////////
		
		//1.1_1) Human 클래스 
		for(int i=0;i<humanArr.length;i++) {
			if(humanArr[i] instanceof Human) {
				humanArr[i].showInfo();//휴먼 클래스의 객체를 모두 가져올 수 있다.
			}
	 	 }
	
						/*
						===================
						1.성명 : 인간1
						2.신장 : 171.2cm
						3.체중 : 63kg
						===================
						1.성명 : 남자군
						2.신장 : 180.4cm
						3.체중 : 81kg
						4. 입대일자 : 2018-11-20
						===================
						===================
						1.성명 : 여자양
						2.신장 : 167.4cm
						3.체중 : 52kg
						4. 출산일정 : 2018-10-25
						===================
						1.성명 : 남운도
						2.신장 : 189.4cm
						3.체중 : 71kg
						4. 입대일자 : 2018-12-09
						===================
						===================
						1.성명 : 여수지
						2.신장 : 157.4cm
						3.체중 : 52kg
						4. 출산일정 : 2018-11-25
				//1.1_2) Man 클래스  
		 	 for(int i=0;i<humanArr.length;i++) {
				if(humanArr[i] instanceof Man) {
				((Man)humanArr[i]).showInfo();//->Man Class로 강제 변환. Man클래스로 저장되어진 객체만 가져올 수 있다.
						===================
						1.성명 : 남자군
						2.신장 : 180.4cm
						3.체중 : 81kg
						4. 입대일자 : 2018-11-20
						===================
						===================
						1.성명 : 남운도
						2.신장 : 189.4cm
						3.체중 : 71kg
						4. 입대일자 : 2018-12-09
						===================
			//1.1_3) Woman 클래스 
		 for(int i=0;i<humanArr.length;i++) {
		 	if(humanArr[i] instanceof Woman) {
				((Woman)humanArr[i]).showInfo();//-> Wonman Class로 강제 변화. Woman 클래스로 저장되어지 객체만 가져올 수 있다.
						===================
						1.성명 : 여자양
						2.신장 : 167.4cm
						3.체중 : 52kg
						4. 출산일정 : 2018-10-25
						===================
						1.성명 : 여수지
						2.신장 : 157.4cm
						3.체중 : 52kg
						4. 출산일정 : 2018-11-25
		

				
			}*/
		}		
}

