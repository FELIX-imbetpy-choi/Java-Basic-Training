package voi;

import java.util.Scanner;

public class A7_ex6 {
	
	//㈜ 복습 기록 ★20181007 

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요   :");
        int i = scanner.nextInt();
        
        if(i>0) {
        	System.out.println("입력하신 숫자는 "+i+" 입니다 받으실 숫자는"+(-i)+"입니다");
        }else if(i<0) {
        	System.out.println("입력하신 숫자는 변경할 수 없습니다");
        }
		
	}

}

