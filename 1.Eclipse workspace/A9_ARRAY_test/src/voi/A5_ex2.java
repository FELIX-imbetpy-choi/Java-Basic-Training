package voi;

import java.util.Arrays;
import java.util.Scanner;

public class A5_ex2 {

	public static void main(String[] args) {
		
	      
		  Scanner scanner = new Scanner(System.in);
	      
	      System.out.println("입력할 숫자의 갯수? :");
	      int input = scanner.nextInt();
	      System.out.println(input+"개의 숫자를 입력하세요!");
	      
	      int [] num = new int[input];
	      int max = 0;
	      int maxLoc= 0;
	      
	      for(int i = 0; i<num.length; i++)
	      {
	         int a = scanner.nextInt();
	         num[i] = a;
	      }
	      
	      for(int k=0; k<num.length; k++)
	      {
	         if(max<num[k])
	         {
	            max = num[k];
	            maxLoc = k+1;
	         }
	      }
	      
	      System.out.println(" 최대값은      :"+max);
	      System.out.println(" 최대값의 위치는   :"+maxLoc);
	      System.out.println(" 입력한숫자중 최대값은  "+max+"이고 "+maxLoc+" 번째 값입니다.");
		 
	}

}

//스캐너가 돌아가는 방식을 모르니 자유롭게 값을 가져다 쓸 수 없음

