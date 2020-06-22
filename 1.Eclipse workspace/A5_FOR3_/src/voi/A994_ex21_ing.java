package voi;

import java.util.Scanner;

public class A994_ex21_ing {

	public static void main(String[] args) {
		
		///입력값 5
		//*
		//**
		//***
		//****
		//*****
		//****
		//***
		//**
		//*
		
		//문제 사용자가 입력한 숫자만큼 *이 늘어나면서 찍히다가 다시 1이 될때까지 줄어들며 찍히는 구조 만들기
		// 사용자의 입력값을 입력받는 스캐너
		Scanner scanner = new Scanner(System.in);
		System.out.println("사용자가 입력한 만큼 별이 늘었다 줄 것 입니다 : ");
		int i = scanner.nextInt();
		
		int jo = 0;
		
		// 반복해서 *을 찍어줄 For문 조건값의 구조파악
		for(int a = 1; a <= (2*i-1); a++) {
			
			if(i>=a) {
				for(int b = 1; b <= a; b++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			// 사용자 입력값 기준에서 별을 줄어들게 만드는 키!
			if(i<a) {
				jo = jo + 1;
			}
			
			if(i<a) {
				for(int c = i-jo; c >= 1; c--) {
					System.out.print("*");
				}
				System.out.println();
			}
	      }
      }
}//---------------------------------------------
// if문 사용하지 않고 for문으로만 만들어보기.???
