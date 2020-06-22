package voi;

import java.util.Scanner;

public class A2_mainclass {
	
	//㈜ 복습 기록 ★20181007 
	
	
	public static void main4(String[] args) {
		
		// 2차원 배열 0 1 2 번째 배열 안에 또다른 0 1 번째 배열이 존재.
		// 2차원은 알기만 하고 쓰지 말기 굳이 쓰지 않아도 문제들이 해결된다. 복잡해지기만 할뿐
		
		int[][] num = {{1,2},{3,4},{5,6}};
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; i <2; j++) {
				System.out.println(num[i][j]);                                     
			}
		
	}
}

	
	
	
	
	
	public static void main3(String[] args2) {
		
		   //------------------------------------
	      //사용자로 부터 숫자 5개를 입력 받아 합계를 구한다.
	      //------------------------------------
	      
	      
	      
	      //scanner 정의와 배열 정의
	      Scanner scanner = new Scanner(System.in);
	      int[] arr = new int[5];
	      int tot = 0;
	      
	      //scanner를 통해 5개의 값을 배열에 저장
	      for(int i = 0; i < arr.length; i++) {
	         System.out.print((i + 1) + "번의 숫자를 입력하세요 : ");
	         arr[i] = scanner.nextInt();
	      }
	      
	      
	      //합계 구하기
	      for(int i = 0; i < arr.length; i++) {
	         tot = tot + arr[i];
	      }
	      
	      
	      //배열로 저장된 5개의 값을 보여주고 합계를 보여준다
	      for(int i = 0; i < arr.length; i++) {
	         System.out.println(i + "번째의 값은 : " + arr[i]);
	      }
	      
	      System.out.println("합계 : " + tot);
	      System.out.println("평균 : " + (double)tot/arr.length);
					
		}
		

	
	
	
	
	
	public static void main2(String[] args) {
		
		int[] arr1 = {10,20,30,40,50};
		
		for( int i = 0; i < arr1.length; i++)
		System.out.println(i+1+"번째 값은 :" + arr1[i]);
		
	}

	public static void main1(String[] args) {

		int[] arr1 = new int[100];
	       for(int i = 0; i < arr1.length; i++) {
	    	   arr1[i] = i + 1;
	       }
	       for(int i = 0; i < arr1.length; i++) {
	    	   System.out.println((i+1)+"번의 값은 "+ arr1[i]);
	       }
	       System.out.println("10번의 값은 :" + arr1[9]);

	}

}
