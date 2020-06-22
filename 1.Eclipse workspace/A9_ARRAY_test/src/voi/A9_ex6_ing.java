package voi;

import java.util.Scanner;

public class A9_ex6_ing {

	public static void main(String[] args) {

		// 입력할 숫자의 갯수? 입력값 받기
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("입력할 숫자의 갯수? : ");
		int input = scanner.nextInt();
		
		System.out.println(input+"개의 숫자를 입력하세요! : ");
		
		int[] num = new int	[input];
			
		// 입력할 갯수 만큼의 숫자를 입력 받고 배열을 지정하기
		for(int a = 0; a < input; a++ ) {
			System.out.print((a+1)+"의 숫자 : ");
			int put = scanner.nextInt();
			int [a] arr = put;
		}
		// 숫자 검색를 검색하고 검색한 숫자의 위치를 나타내기
		

 }
}