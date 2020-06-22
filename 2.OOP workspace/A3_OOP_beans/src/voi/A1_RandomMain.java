package voi;

import java.util.Random;

public class A1_RandomMain {

	public static void main(String[] args) {
		//20181014 복습완료 ★
		
// 		Random number 출력
//		double d = Math.random();
//		int di =(int) (d * 100) ;
//		System.out.println(di);
//		이렇게도 사용할 수 있다. 옛날방식이다.
		
		Random random = new Random();
		int i = random.nextInt(10); //0부터 입력값-1 까지 랜덤으로 출력해줌
		System.out.println(i);

	}

}
