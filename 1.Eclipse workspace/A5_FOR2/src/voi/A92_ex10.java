package voi;

public class A92_ex10 {
	
	//㈜ 복습 기록 ★20181007 

	public static void main(String[] args) {
		
    // 문제. 별(★)이 하나씩 줄어들며 출력되게 하라.!
		
		for(int a = 1; a <= 10; a++ ) {
			for(int b = 9; b >= a+1; b--) {
				System.out.print("★");
			}
			System.out.println();
		}
	}

}
