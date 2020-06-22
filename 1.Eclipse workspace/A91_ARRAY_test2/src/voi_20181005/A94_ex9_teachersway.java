package voi_20181005;

import java.util.Scanner;

public class A94_ex9_teachersway {

	public static void main(String[] args) {
		
		//자료형 선언
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		int cn = 0;
		int don = 0;
		int [] customer = {0,0,0,0,0};
		
		
		
		while(choice!=4) {
			
			//메뉴구성
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("3. 현황");
			System.out.println("4. 종료");
			System.out.println("번호를 선택하세요 : ");
			choice = scanner.nextInt();
			
		    
			
			//입금
			if(choice==1) {
				
				System.out.print("고객번호 : ");
				cn = scanner.nextInt();
				System.out.println("금액");
				don = scanner.nextInt();
						customer[cn-1] += don;
				System.out.println("고객번호" + cn + ":" + customer[cn -1]);
				System.out.println("-----------------------------------");
						
			}
			
			//출금
			if(choice==2)
			
			//현황
			if(choice==3)
			
			//종료
			if(choice == 4) {
				System.out.println(">>>>>>>Thank you<<<<<<");
					}
			
		}
		
		

	}

}
