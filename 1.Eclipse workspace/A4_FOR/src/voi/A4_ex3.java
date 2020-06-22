package voi;

import java.util.Scanner;

public class A4_ex3 {
	
	//㈜ 복습 기록 ★20181007 

	public static void main(String[] args) {
		
//// 사용자 입력값 : 3 일때 -------> 3X1 = 3  4X1 = 4  5X1 = 5 으로 출력되게 하라. 
		Scanner scanner = new Scanner(System.in);
		System.out.println("구구단으로 사용할 숫자를 입력하세요: ");
        int i = scanner.nextInt();
        
        
        for(int j = 1; j<10; j++) {
        	for(int k = i; k < i+3; k++) {
        		System.out.print(k+"X"+j+"="+(k*j)+"\t");
        	}
        	System.out.println();
        }
        
	}

}
