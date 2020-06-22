package voi;

public class A1_staticMainclass {

	public static void main(String[] args) {
		//20181015 복습완료 ★
		
		// mama bag의 초콜릿 변수를 다 함께 사용함으로
		// 첫째와 둘째의 메소드가 다른 클래스에 있어도 함께 값을 공유하며 논리를 구성할 수 있음
		
		// 첫째가 초콜릿을 가져가는 메소드
		A3_staticFirstSon firstSon = new A3_staticFirstSon();
		firstSon.takeChoco();
		
		//둘째가 초콜릿을 가져가는 메소드
		A4_staticSecondSon secondSon = new A4_staticSecondSon();
		secondSon.takeChoco();
		
		

	}

}
