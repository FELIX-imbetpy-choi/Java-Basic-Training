package voi;

import java.util.Scanner;

import voi2.A3_BankMetho;

public class A3_bankMain {
	 //20181011 ,1014 복습완료 ★★ 

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		A3_BankMetho bank = new A3_BankMetho();
		
		double i = 0; //선택번호
		int j = 0; //고객번호
		int k = 0; //금액
		
		
		while(i!=4) {
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("3. 현황");
			System.out.println("4. 종료");
			
			System.out.println(" 번호를 선택 : ");
			i = scanner.nextInt();
			if((i/2)<=1) {
			System.out.println("고객번호");
			j = scanner.nextInt();
			System.out.println("금액 : ");
			k = scanner.nextInt();
			}
			
			
			if(i==1) {
				bank.input(j, k);
			}
			if(i==2) {
				bank.minu(j, k);
			}
			if(i==3) {
				bank.gold();
			}
			if(i==4) {
				bank.kkt();
			}
			if(i>4) {
				System.out.println("제대로 된 번호를 선택하세요!");
				System.out.println("-------------------");
			}
		}
		
		
		
	}

	

}
