package voi;

import java.util.Scanner;

public class A3_ex2 {
	
	//㈜ 복습 기록 ★20181007 

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		System.out.print("구구단으로 사용할 숫자를 입력하세요: ");
        int i = scanner.nextInt();
        
        for(int k=1; k<10; k++) {
        	if(k==1) {
        	System.out.println("입력하신 값은_"+i+"입니다.");
        	System.out.println("구구단 출력");
        	System.out.println("----------------------");
        	}
        	System.out.println(i+" X "+k+" = "+i*k);
        }
        
        //반복문 안에 반복문 만들 수 있음
        
       
	}

}
