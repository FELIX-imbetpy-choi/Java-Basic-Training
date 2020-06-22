package voi;

import java.util.Scanner;

public class A98_ex16 {

	public static void main(String[] args) {
		
		//㈜ 복습 기록 ★20181007 
		
		//문제. 아래와 같은 모양의 별찍힘을 만들라!!!짜시가
		//*
		//**
		//* *
		//*  *
		//*****
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력한 숫자 만큼 별이 출력됩니다 : __ ");
        int i = scanner.nextInt();
        
        
        int a = i;
        
        for(i=1; i<=a; i++)
        {
           for(int j=1; j<=i; j++)
           {
              if(j==1)
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
