package voi_20181005;

import java.util.Scanner;

public class A91_ex7 {

	public static void main(String[] args) {
		//자료형 선언
		Scanner scanner = new Scanner(System.in);
		int jcount = 0;				//입력할 숫자 갯수
		int [] num = new int [100]; //배열
		int loc = 0;				//숫자삽입 위치
		int ins = 0;
		
		
		// 입력할 숫자의 갯수는?
		System.out.println("입력할 숫자의 갯수는? : ");
		jcount = scanner.nextInt();
		
		System.out.println(jcount+" 개의 숫자를 입력하세요.");
		
		for(int i = 0; i < jcount; i++) {
			System.out.print((i+1)+"의 숫자");
		    num [i] = scanner.nextInt(); // 배열을 사용해서 값을 지정
			
		}
		
		// 숫자 삽입 위치 및 숫자
		System.out.print("숫자를 삽입하고자 하는 위치는? : ");
		loc = scanner.nextInt();
		
		System.out.print("삽입하고자 하는 숫자는? : ");
		ins = scanner.nextInt();
		
		
		// 배열 위치 조정
		for(int i = jcount-1; i >= loc-1; i--) {
			num[i+1] = num[i];
		}
		
		num [loc - 1] = ins;
		//출력
		
		System.out.println("---------결과----------");
		for(int i = 0; i <= jcount; i++) {
			System.out.println(String.format("%3d", num[i] ));
		}
		
				
	}

}
// 코멘트를 달아서 