package voi;

public class A3_staticFirstSon {
	
	public A3_staticFirstSon() {
		
	}
	
	public void takeChoco() {
		
		// 음. choco 변수를 처음줄에서 -1 하면 if문에서 모두 0이 되지 않나?
		// if문 안에 -1을 넣으면 첫째 둘째 모두 먹는다 왜일까?
	    A2_staticMamaBag.choco = A2_staticMamaBag.choco - 1;
		if(A2_staticMamaBag.choco < 0) {
			System.out.println("첫째는 초코파이가 먹고싶어요!");
		}
		else {
			System.out.println("첫째는 맛있게 먹었어요");
		}
	}

}
