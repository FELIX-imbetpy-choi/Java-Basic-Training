package voi;

import java.util.Scanner;

public class A993_ex20 {
	
	//㈜ 복습 기록 ★20181007 


	public static void main(String[] args) {
		
		// 사용자가 입력한 값의 구구단을 거꾸로 출력하세요!
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 넣으세요: __ ");
        int i = scanner.nextInt();
        
        for(int a = 9; a >= 1; a--) {
        	System.out.println(i+"X"+a+"="+(a*i));
        }
        
        
	}

}
