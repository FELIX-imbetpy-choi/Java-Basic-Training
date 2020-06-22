package voi;

import java.util.Scanner;

public class A998_ex25 {

	public static void main(String[] args) {
		
		//문제. 사용자가 입력한 만큼 1부터 피라미드 형식으로 값이 출력되게 하라.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("몇 단계의 피라미드로 구성할까?:  ");
        int i = scanner.nextInt();
        
        
        int tot = 1;
        
        
        for(int a = 0; a<i; a++) {
        	
             for(int b=0; b<=a; b++){
            
              System.out.print("\t"+tot);
              
              tot= tot+1;            
                                     }
           
           System.out.println();
           
        		                 }
	  }
	

	}

//for(int a =1; a<=scanner; a++){
//   for(int b = 1; b<=a; b++){
//        sysout.print(String.format(("%3d"),number));
//  	dispnum++
//   	}
//     sysout.println("")
//   }



