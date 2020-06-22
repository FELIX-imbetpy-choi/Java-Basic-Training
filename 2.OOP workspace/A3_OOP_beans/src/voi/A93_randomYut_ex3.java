package voi;

import java.util.Random;

public class A93_randomYut_ex3 {

	public static void main(String[] args) {

		// 랜덤을 이용한 윷놀이 말 던지기
		// 1차시도 2차시도 3차시도 ---- 10번 던지면 우선순위는 _ > _ > _ > 순으로 
		// 어떤 도구가 필요한가?
		Random random = new Random();
		// 도 개 걸 윷 모  들어가는 배열
		String [] Yut = {"도","개","걸","윷","모"};
	    int k = 0;
	    int a = 0;//도
	    int b = 0;//개
	    int c = 0;//걸
	    int d = 0;//윷
	    int e = 0;//모
		
		// 랜덤을 반복할 반복문
		for(int i = 0; i <= 100; i++) {
			k = random.nextInt(5);
			
			switch (k) {
			case 0:
				a = a + 1;
				break;
			case 1:
				b = b + 1;
				break;
			case 2:
				c = c + 1;
				break;
			case 3:
				d = d + 1;
				break;
			case 4:
				e = e + 1;
				break;

			}
			
		}
		
		//우선순위별로 나열되는 논리 필요
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
	}

}
