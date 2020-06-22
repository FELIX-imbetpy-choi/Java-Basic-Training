package voi_20181005;

import java.util.Scanner;

public class A93_ex9 {

	public static void main(String[] args) {
		
		// 고객의 입금 출금 및 현황을 관리하는  Program 을 작성하라 , 단 고객은 1,2,3,4,5 이다.
		// 고객의 번호와 값이 들어가는 배열을 생성
		
		int [] cl = {0,0,0,0,0};
		int count = 0;
		
		// 입금 출금 현황 종료 를 선택받는 스캐너 생성
		Scanner scanner = new Scanner(System.in);
		
		
		// 각 동작을 식별하는 조건문 생성
		// 동작에 따른 실행문 작성
		while(count!=4) {
			
			int num = 0;
			int sel = 0;
			int don = 0;
			
			System.out.println("------------------------------------------");
			System.out.println("이용하실 서비스를 입력하세요 : 1.입금 2.출금 3.현황 4.종료");
			sel = scanner.nextInt();
					
			if(sel<3) {
				System.out.println("고객 번호를 입력하세요 : ");
			    num = scanner.nextInt();
			}
			
			if(sel<3) {
				System.out.println("금액을 입력하세요 : ");
				don = scanner.nextInt();
			}
			
		
			switch (sel) {
			
			case  1:
				
				cl[num-1] = cl[num-1] + don;
				System.out.println("입금 금액  : " + don + "\t"+"고객번호 : "+num+ "\t"+"잔액 : "+cl[num-1]);
				System.out.println();
			break;
			
			case  2:
				
				if(cl[num-1]>=don) {
					cl[num-1] = cl[num-1] - don;
					System.out.println("출금 금액  : " + don + "\t"+"고객번호 : "+num+ "\t"+"잔액 : "+cl[num-1]);
				}
				else {
				System.out.println("잔액이 부족합니다.");
				}
				System.out.println();
			break;
			
			case  3:
				System.out.println("고객명" + "\t" + "잔액");
				System.out.println("1번 고객         " + cl[0]);
				System.out.println("2번 고객         " + cl[1]);
				System.out.println("3번 고객         " + cl[2]);
				System.out.println("4번 고객         " + cl[3]);
				System.out.println("5번 고객         " + cl[4]);
				System.out.println();
			break;

			
		default:
			System.out.println(">>>>>>Thank you<<<<<<");
			System.out.println();
			count = 4;
			break;
			
			
		}
		
		}

	}

}
