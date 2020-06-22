package voi;

public class A93_ex11 {
	
	//㈜ 복습 기록 ★20181007 

	public static void main(String[] args) {
		
		// 문제. 홀수에는 별(★)이 짝수에는 빈별(☆)가 찍히도록 반복문을 작성하라.!
		
		for(int a = 1; a <= 10; a++ ) {
			if((a%2)==1) {
				for(int b = 1; b <= a; b++)    //a = 1; a<=10; a++
					System.out.print("★");
			} 
			if ((a%2)==0) {
				for(int b = 1; b <= a; b++) {
					System.out.print("☆");
			}
				
		
			}
			System.out.println();
		}
	
	
}
}

