package voi;

import java.util.Scanner;

public class A96_ex14_completein15 {

	//㈜ 복습 기록 ★20181007 
	//*
	//**
	//*_*
	//*__*

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("입력한 숫자 만큼 별이 출력됩니다 : __ ");
        int i = scanner.nextInt();
        
        
        
        for(int a = 1 ; a <= 7; a++ ) {
        
			for(int b = 0; b <= a+1; b++) {
				if((a)==i) {
				
				System.out.print("*");
				
				}
				if((a)!=i) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
        
	}

}
