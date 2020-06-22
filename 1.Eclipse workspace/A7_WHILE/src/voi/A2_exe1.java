package voi;

import java.util.Scanner;

public class A2_exe1 {
	
	//정수를 입력했을 때 자릿수의 값들을 모두 더하여라.

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요 모든 자릿수를 더해드립니다.:  ");
		
        int i = scanner.nextInt();
		
	    int tot = 0;
	    int kal = 0;
		
		while(i>=1) {
			kal = kal / 10;
			tot = tot % 10;
			
		}
		System.out.println(kal);
		System.out.println(tot);

	}

}




	//Scanner scanner = new Scanner(System.in);
	//System.out.print("정수를 입력하세요 모든 자릿수를 더해드립니다.:  ");
	//
	//int i = scanner.nextInt();
	//	
	//int tot = 0;
	//int kal = 0;	
	//
	//while(i>=1) {
	//	kal = kal / 10;
	//	tot = tot % 10;
	//	
	//}
	//System.out.println(kal);
	//System.out.println(tot);






//-------------------------------------------------------------------



//long tot = 1;
//
//for(int a = 0; a <= 10; a++) {
//  
//      System.out.println("10^"+"  "+a+" = "+String.format("%13d", tot));
//      tot=tot*10;
//}