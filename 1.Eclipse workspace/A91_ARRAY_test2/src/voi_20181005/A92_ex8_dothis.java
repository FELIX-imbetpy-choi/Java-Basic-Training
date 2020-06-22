package voi_20181005;

import java.util.Scanner;

public class A92_ex8_dothis {

	public static void main(String[] args) {
		
		//사용자가 입력할 숫자의 갯수를 파악하고 숫자를 입력받는다. 그중 삭제하고자 하는 위치를 지정하고 삭제 후 출력한다.
		

		//자료형 선언
				Scanner scanner = new Scanner(System.in);
				int jcount = 0;				//입력할 숫자 갯수
				int [] num = new int [100]; //배열
				int loc = 0;				//숫자삽입 위치
				int del = 0;
				
				
				// 입력할 숫자의 갯수는?
				System.out.println("입력할 숫자의 갯수는? : ");
				jcount = scanner.nextInt();
				
				System.out.println(jcount+" 개의 숫자를 입력하세요.");
				
				for(int i = 0; i < jcount; i++) {
					System.out.print((i+1)+"의 숫자");
				    num [i] = scanner.nextInt(); // 배열을 사용해서 값을 지정
					
				}
				
				// 숫자 삽입 위치 및 숫자
				System.out.print("숫자를 삭제 하고자 하는 위치는? : ");
				loc = scanner.nextInt();
				
				num[loc-1] = 0;
				System.out.println("삭제됨?" + num[loc-1]);
				
				// 배열 위치 조정
				for(int i = jcount-2; i >= loc-2; i--) {
					num[i] = num[i+1];
				}
				
				//출력
				
				for(int i = 0; i <= jcount-2; i++) {
					System.out.println(String.format("%3d", num[i] ));
				}
				
				
	}

}
//
//자료형 선언
//Scanner scanner = new Scanner(System.in);
//int jcount = 0;            //입력할 숫자 갯수
//int [] num = new int [100]; //배열
//int loc = 0;            //숫자삽입 위치
//int ins = 0;
//
//
// 입력할 숫자의 갯수는?
//System.out.println("입력할 숫자의 갯수는? : ");
//jcount = scanner.nextInt();
//
//System.out.println(jcount+" 개의 숫자를 입력하세요.");
//
//for(int i = 0; i < jcount; i++) {
//   System.out.print((i+1)+"의 숫자");
//    num [i] = scanner.nextInt(); // 배열을 사용해서 값을 지정
//   
//}
//
// 숫자 삽입 위치 및 숫자(삽입문제 코드)
//System.out.print("숫자를 삽입하고자 하는 위치는? : ");
//loc = scanner.nextInt();
//
//삭제문제
//System.out.print("삭제하고자 하는 위치는 ? : ");
//loc = scanner.nextInt();
//
//
// 배열 위치 조정 (삽입문제 코드)
//for(int i = jcount-1; i >= loc-1; i--) {
//   num[i+1] = num[i];
//}
//
//num [loc - 1] = ins;
//
//삭제문제 코드
//if(loc >= loc+1) {
//   System.out.println("삭제불가!");
//}else {
//for(int i = loc - 1; i < jcount -1; i++) {
//   num[i] = num[i+1];
//   }   
//System.out.println("---------결과----------");
//for(int i = 0; i < jcount-1; i++) {
//   System.out.println(String.format("%3d", num[i] ));
//}
//}
//출력
//
//System.out.println("---------결과----------");
//for(int i = 0; i <= jcount; i++) {
//   System.out.println(String.format("%3d", num[i] ));
//}   
