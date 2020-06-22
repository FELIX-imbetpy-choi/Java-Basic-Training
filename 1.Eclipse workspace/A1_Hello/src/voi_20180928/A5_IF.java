package voi_20180928;

import java.util.Scanner;

public class A5_IF {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 10;

		if (a>b) {
		// a의 값은 10 b의 값은 20 이므로 a>b가 false이다. 고로 if문 안의 println은 실행되지 않는다.
		System.out.println("a가 b보다 큽니다");
		}	
		
		// if문 밖의 println 이므로 조건없이 실행된다.
		System.out.println("***---***---***---***---***");
		
		
		if(a==c) {
		// a 와 c의 값이 같으므로 아래의 모든 구문이 실행된다.
			System.out.println("a와 c가 같습니다");
			System.out.println("-----------");
			System.out.println("***********");
			System.out.println("a와 c의 합은" + (a+c) + "입니다.");
		}


	}
}
	
