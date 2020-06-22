package voi4;

public class A2_override2Shop1 extends A1_override2storeHQ {

	@Override
	public void orderKim() {
		System.out.println("김치찌개 : 4,500 원");
	}

	@Override
	public void orderBu() {
		System.out.println("김치찌개 : 4,500 원");
	}

	@Override
	public void orderBi() {
		System.out.println("김치찌개 : 4,500 원");
	}

	@Override
	public void orderSoon() {
		System.out.println("김치찌개 : 4,500 원");
	}

	@Override
	public void orderKong() {
		System.out.println("김치찌개 : 4,500 원");
	}

}
// 각 메소드만 생성한 후 상속하게 되면 자동으로 오버라이드 틀이 생긴다.