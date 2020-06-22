package voi_20180928;

import java.util.Scanner;

public class A4_threelogic {

	public static void main(String[] args) {
		int a = 5;
		System.out.println("<---삼항연산자--->");
		System.out.println("삼항 연산 결과 (a > 5? 1 : 2) :"+(a > 5 ? "Large" : "Small"));

		
        // <문제. 변수 a 가 홀수인지 짝수인지 판별>
        // 숫자 % 2 = 0 이면 짝수
        // 숫자 % 2 = 1 이면 홀수
		// b는 a를 2로 나눈것의 나머지 값이다. 이 값이 0보다 크다는 것은 true(홀수) 
        // 작다는 것은 false(짝수)인 것이다.
		int b = a%2;
		System.out.println(b > 0 ? "홀수" : "짝수");
		
		
        //** =는 이퀄표시!  ==는 같은지 조건을 묻는 것(true or false) 결과값이 나옴.
		

        //<문제. 사용자가 입력한 숫자를 가지고 홀수 인지 짝수 인지 판별>
        //1. 사용자가 입력할 수 있게 (내장함수 Scanner 사용)  
        Scanner scanner = new Scanner(System.in);

        //여기서 앞의 scanner은 선언이고 뒤의 scanner은 변수이다
		
        // 2. 입력한 숫자를 프로그램으로 가지고 온다 
        System.out.print("숫자를 입력하세요:  ");
        int i = scanner.nextInt();

        //3. 그 수가 홀수인지 짝수인지 판별하여 출력
        System.out.println("당신이 입력한 숫자는 " + i + "이고");
        System.out.println(i%2>0 ? "당신이 입력한 숫자는 2의 배수가 아닙니다" : "당신이 입력한 숫자는 2의 배수입니다");
        System.out.println(i%3>0 ? "당신이 입력한 숫자는 3의 배수가 아닙니다" : "당신이 입력한 숫자는 3의 배수입니다");

        //문제.
        // 사용자가 입력한 숫자를 판단하여 3의 배수인지 아닌지를 결과로 출력

        //삼항 연산자는 하나의 조건 ? "" : "" 에 따라 출력되는 값
		
	}

}
