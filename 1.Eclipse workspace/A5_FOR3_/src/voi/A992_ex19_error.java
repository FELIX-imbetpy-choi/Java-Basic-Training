package voi;

import java.util.Scanner;

public class A992_ex19_error {

	public static void main(String[] args) {
		
		// 문제 의도를 알 수 없음!!
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 넣으세요: __ ");
        int i = scanner.nextInt();
        
        for(int j = 9; j >= 1; j--) {
        	for(int k = 9; k >= 1; k--) {
        		System.out.print(j+"X"+k+" = "+(j*k)+"\t");
        	}
        	System.out.println();
        }
	}
}
