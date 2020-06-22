package voi;

import java.util.Scanner;

public class A9995_ex28_otherway {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
      
	   
      System.out.print("첫번째 숫자(정수)를 입력하시요 : ");
      double i = scanner.nextInt();
      System.out.print("두번째 숫자(정수)를 입력하시요 : ");
      double j = scanner.nextInt();
      
      
      double k = i / j;
      double a = i % j;
      
      System.out.println("실수           : " + k);
      
      
      
      if(a > (j/2)) {
         
         k = (int)k;
      System.out.println("반올림 결과 : " + (k+1) );
      
      }else {
         k = (int)k;
         System.out.println("반올림 결과 : " + k);
      }
      
      System.out.println();
		
	}

}
