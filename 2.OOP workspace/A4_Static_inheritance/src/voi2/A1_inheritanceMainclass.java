package voi2;

public class A1_inheritanceMainclass {

	public static void main(String[] args) {
		//20181015 복습완료 ★
		
		// 상속클래스를 만드는 방법 - 상속받을 클래스가 있는 상태에서 상속받을 클래스를 만들때  - superclass에서 상속받을 클래스를 선택한다.
		
		A3_inheritanceChild child = new A3_inheritanceChild();
		System.out.print("아버님 성함 : ");
		child.getFather();
		System.out.print("어머님 성함 : ");
		child.getMother();

	}

}
