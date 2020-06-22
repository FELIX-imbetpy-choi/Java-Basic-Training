package voi3;

public class A3_overrideChildsMenu extends A2_overrideParentsmenu {
	
	public A3_overrideChildsMenu() { //이대로 쓰면 바로 상속 받은 것만
		
	}
	
	public void makeBeefChung() {
		System.out.println("소고기청국장");
	}
	
	public void makeBeefHotDeon() {
		System.out.println("얼큰된장국");
	}
	
	public void makeKongNa() {
		System.out.println("콩나물국");
	}
	
	@Override 
	// 어노테이션 - 바꾸어 쓰는것을 표시하는 것
	// 오버로딩은 같은 이름의 생성자에 다른 값을 주어서 쓰는 것을 말한다.
	public void makeChung() { //상속받은 것과 겹치는  업데이트된 걸로 나온다
		
		System.out.println("냄새없는 청국장");
		super.makeChung(); // 상속 전의 parents menu 에서 불러들여 다시 표기할 수 있음
	}

}
