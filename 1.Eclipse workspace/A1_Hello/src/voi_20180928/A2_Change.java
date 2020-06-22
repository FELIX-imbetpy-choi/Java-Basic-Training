package voi_20180928;

public class A2_Change {

	public static void main(String[] args) {
		
		//묵시적 형변환
		int a1 = 10;
		double b1 = a1;
		System.out.println(b1);
		
		
		//명시적 형변환
		double c2 = 10.3;
		int d2 = (int)c2;
		System.out.println(d2);
		
		//산술연산자
		int e = 20;
		int f = 3;
		System.out.println(e+f);
		System.out.println(e-f);
		System.out.println(e*f);
		System.out.println((double)e/f);
		System.out.println(e%f);
		
		// 자동 증감 연산자
		int g = 1;
		System.out.println(g++);  //다음 줄에 1이 증가 한 갑이 표시됨
		System.out.println(g++);
		System.out.println(g++);
		System.out.println(g+=10);  // 다음줄에 10씩 증가시킴
		System.out.println(g--);
		System.out.println(g--); //다음줄에 -1이 적용되어 있음을 볼 수 있다.
		System.out.println(g);
		
		//동등비교, 관계 연산자
		int h = 10;
		int i = 5;
		System.out.println(h==i);
		System.out.println(h!=i); //같지 않다!
		System.out.println(h>i);
		System.out.println(h<i);
		System.out.println(h>=i);
		System.out.println(h<=i);

		

		
	}

}
