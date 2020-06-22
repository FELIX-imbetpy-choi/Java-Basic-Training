package voi;

import java.util.Scanner;

public class A99_ex17 {

	public static void main(String[] args) {
		
		//㈜ 복습 기록 ★20181007 
		
		//*
		//**
		//* *
		//*  *
		//*****

		
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력한 숫자 만큼 별이 출력됩니다 : __ ");
        int i = scanner.nextInt();
        
        
        int a = i;
        
        for(i=0; i<=a; i++)
        {
           for(int j=0; j<=i; j++)
           {
              if(j==0)
              {
                 System.out.print("*");
              }
              else if(i==j)
              {
                 System.out.print("*");
              }
              else if(i==a) {
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
