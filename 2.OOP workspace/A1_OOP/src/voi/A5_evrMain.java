package voi;

import java.util.Scanner;

import voi2.A5_evrMetho;


public class A5_evrMain {

	public static void main(String[] args) {
		 //20181011 ,1014 복습완료 ★★ 
		
		//문제. 처음 숫자와 끝 숫자를 입력받아 합계를 구하라
		//처음 숫자와 끝 숫자를 입력 받을 스캐너가 필요함
		Scanner scanner = new Scanner(System.in);
		A5_evrMetho f = new A5_evrMetho();
		
		System.out.print("시작점 숫자를 입력하세요 : ");
		int a = scanner.nextInt();
		System.out.print("마지막 숫자를 입력하세요 : ");
		int b = scanner.nextInt();
		
		
		
		//입력받은 숫자를 합해줄 메소드 만들기
		int k = f.sum(a, b);
		
		System.out.println("합은 "+ k +"입니다.");
		
		//입력된 숫자들의 평균을 구하라.
		
		double j = f.avr(a, b, k);
		
		System.out.println("평균은 "+ j + "입니다.");
		

	}

}
