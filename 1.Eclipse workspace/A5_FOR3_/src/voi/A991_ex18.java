package voi;

import java.util.Scanner;

public class A991_ex18 {
	
	//㈜ 복습 기록 ★20181007 


	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력한 숫자 만큼 별이 출력됩니다 : __ ");
        int i = scanner.nextInt();
        
        
        int a = i;
        
        for(int k = 1; k <= a; k++){
        	
           for(int j = 1; j <= k; j++){
        	   
              if(j==1)
              {
                 System.out.print("*");
              }
              else if(k==j)
              {
                 System.out.print("*");
              }
              else if((k%2)==1){
            	  System.out.print("*");
              }
              else
              {
                 System.out.print(" ");
              }
              
           }
           System.out.println();
        }
        
        
        
	}

}
