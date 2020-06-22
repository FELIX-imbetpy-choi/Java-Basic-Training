package voi;

import java.util.Scanner;

public class A996_ex23 {
	
	//㈜ 복습 기록 ★20181007 


	public static void main(String[] args) {
			
			//문제. 사용자 입력값의 팩토리알을 구하라!
			//input your decimal no. : __
			//4' factorial value = 24
			//4x3x2x1
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("input your decimal no.: __ ");
        int i = scanner.nextInt();
        
		int tot = 1;
	
		for(int a = i; a>=1; a--) {
			
			tot = tot * a;
			
	
		}
		
		System.out.println(tot);

	}

}

		//Scanner scanner = new Scanner(System.in);
		//int result = 1;
		//System.out.print("Input your decimal no. : " );
		//
		//int intputValue = scanner.nextInt();
		//   for(int i = 1; i <= intputValue; i++) {
		//   result = result * i;
		//}
		//System.out.println("Result : " + result);


