package voi;

import java.util.Random;

public class A91_randomCoin_ex1 {

	public static void main(String[] args) {
		
		// 동전던지기의 확률은 앞면 50 뒷면 50 이라는데 이것을 Random 으로 이용하여 증명하라
		// 몇번이상을 던져야 50%와 비슷한 수치가 나오는지 프로그램으로 증명
		
		// 과정이 필요한가?
		// 랜덤을 돌릴 반복문
		Random random = new Random();
		
		int i = 0; //1이 나올때 증가되는 변수
		int j = 0; //0이 나올때 증가되는 변수
		double evr0 = 0;
		double evr1 = 0;
		
		for(int a = 1; a <= 100000000; a++) {
			// 랜덤으로 0과 1이 출력되는 Random
			int z = random.nextInt(2);
			
			if(z==1) {
				i = i + 1;
			}
			else if(z==0) {
				j = j + 1;
			}
			
		}
		
		evr0 = (double)j/(i+j)*100;
		evr1 = (double)i/(i+j)*100;
		
		System.out.println("전체 던진 횟누는 : " + (i+j));
		System.out.println("1이 나온 횟수는 : " + i);
		System.out.println("1이 나올 확률은 : " + evr1);
		System.out.println("0이 나온 횟수는 : " + j);
		System.out.println("0이 나올 확률은 : " + evr0);
		// 0과 1 이 카운트 되는 변수 만들기
		
		
		

	}

}
