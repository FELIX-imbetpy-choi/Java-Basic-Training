package voi;

import java.util.Random;



public class A92_randomDice_ex2 {

	public static void main(String[] args) {

		//문제 주사위의 확률은 각 6분의 1이라는데 이것을 랜덤을 이용해서 몇번을 던져야 비슷하게
		//나오는지 알아보라
		Random random = new Random();
		int a = 0; //1의 횟수
		int b = 0; //2의 횟수
		int c = 0; //3의 횟수
		int d = 0; //4의 횟수
		int e = 0; //5의 횟수
		int f = 0; //6의 횟수
		
		
		// 랜덤을 반복해줄 반복문
		for(int k = 1; k <= 100; k++) {
			// 반복문 안에 랜덤 설정
			int s = random.nextInt(7);
			
			switch (s) {
			case 1:
				a = a + 1;
				break;
				
			case 2:
				b = b + 1;
				break;
				
			case 3:
				c = c + 1;
				break;
			case 4:
				d = d + 1;
				break;
				
			case 5:
				e = e + 1;
				break;
				
			case 6:
				f = f + 1;
				break;
				
			
			}
			
		}
		
		System.out.println("1이 나온 횟수는 : " + a);
		System.out.println("2가 나온 횟수는 : " + b);
		System.out.println("3이 나온 횟수는 : " + c);
		System.out.println("4가 나온 횟수는 : " + d);
		System.out.println("5가 나온 횟수는 : " + e);
		System.out.println("6이 나온 횟수는 : " + f);
		
		
		// 각 숫자가 나올때 카운트 되는 변수와 논리 설정
		
	
	}

}
