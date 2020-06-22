package voi;

import java.util.Scanner;

public class A9992_ex27_ing {
	
	//미제

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			System.out.print("배수 숫자를 입력하세요: __ ");
			int k = scanner.nextInt();
		
		
			 	int  tot = 0;
			 	double a = 0;
			 	int line = 1;
			 	
		      
		        for(int i =1; i<=100;i++)
		         
		        	if(i%k==0)
		        	{
		        		
		            tot=tot+i;
		            System.out.print(String.format("%5d", i));
		           
		            if(i%(k*k)==0){
		               System.out.println();
		               line++;
		               
		            if(line%2==0)
		                  System.out.print("  ");
		             }
		            a++;
		         }
		        	
		      		System.out.println("\t\t합계\t"+String.format("%5d", tot));
		      		System.out.println("\t\t평균\t"+String.format("%5.2f", tot/a));
		      

	}

}

//String.format 이 돌아가는 방식 이해하기
//다른 방식으로 접근해보자
// if 안에는 중첩으로 else if 사용할 수 없다.
