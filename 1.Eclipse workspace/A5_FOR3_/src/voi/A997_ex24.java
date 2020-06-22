package voi;

import java.util.Scanner;

public class A997_ex24 {
	
	//㈜ 복습 기록 ★20181007 


	public static void main(String[] args) {
		
		// 문제. 사용자가 더하고자 하는 수들의 갯수를 입력 받고, 그 값들도 입력 받아 합을 구하라!
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("input your decimal no.: __ ");
        int i = scanner.nextInt();
        
		int tot = 0;
	
		for(int a = 1; a<=i; a++) {
			
			Scanner scanner1 = new Scanner(System.in);
			System.out.print("숫자를 입력하세요 : __ ");
	        int k = scanner1.nextInt();
	        
	        tot = tot + k;
	
		}
		System.out.println("입력한 숫자의 합은"+tot);
	}
}
