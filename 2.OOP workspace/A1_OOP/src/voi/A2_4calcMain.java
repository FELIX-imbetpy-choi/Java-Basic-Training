package voi;

import java.util.Scanner;

import voi2.A2_4calcMethod;

public class A2_4calcMain {
	
	//20181011 ,1014 복습완료 ★★ 

	public static void main(String[] args) {

		//문제. 사용자로부터 숫자 2개를 입력받아 ,덧셈 뺄셈 곱셈 나눗셈 의 결과 출력
		//메소드를 각각 만들어서 메인클래스에서 뉴로 선언하여 사용할 수 있게 제작
		//단, 출력은 메인에서
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("사용할 값을 정하세요 1 : ");
		int a = scanner.nextInt();
		System.out.println("사용할 값을 정하세요 2 : ");
		int b = scanner.nextInt();
		
		A2_4calcMethod A2_method = new A2_4calcMethod(); 
		
		int sum = A2_method.sum(a, b);
		System.out.println("입력값의 합은: " + sum);
		int min = A2_method.min(a, b);
		System.out.println("입력값의 차는: " + min);
		int due = A2_method.due(a, b);
		System.out.println("입력값의 곱은: " + due);
		int de = A2_method.de(a, b);
		System.out.println("입력값의 나눔값은: " + de);
				
		
	}

}
