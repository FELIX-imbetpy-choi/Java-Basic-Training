package voi;

public class A4_staticSecondSon {
	
	public A4_staticSecondSon() {
		
	}
	
	public void takeChoco() {
		
		A2_staticMamaBag.choco = A2_staticMamaBag.choco-1;
		if(A2_staticMamaBag.choco < 0) {
			System.out.println("둘째는 초코파이가 먹고싶어요!");
			
		}
		else {
			System.out.println("둘째는 맛있게 먹었어요");
		}
		
		
	}

}
