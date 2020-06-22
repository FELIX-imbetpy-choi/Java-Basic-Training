package voi;

import java.util.Scanner;

public class A95_ex13 {
	
	//㈜ 복습 기록 ★20181007 

	public static void main(String[] args) {
		
		// 문제. 사용자가 입력한 값만큼 별이 1개부터 늘어가며 찍히도록 하라.!
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력한 숫자 만큼 별이 출력됩니다 : __ ");
        int i = scanner.nextInt();
        
        
        
        for(int a = 1 ; a <= i; a++ ) {
			for(int b = 2; b <= a+1; b++) {
				System.out.print("★");
			}
			System.out.println();
		}
        
	}

}
