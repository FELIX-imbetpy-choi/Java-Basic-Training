package voi;

import java.util.Scanner;

public class A6_ex5 {
	
	//㈜ 복습 기록 ★20181007 

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		System.out.println("제곱미터를 입력하세요 ");
        int i = scanner.nextInt();
        double k = i*0.3025;
       
        System.out.print(i+"제곱미터의 평수는"+k+"평 입니다");
	}

}

// string.format 다시 알아보기
// double abc = 85 * 0.3025;
//	sysout("평수는: " + String.format("%5.1f",abc); 를 적용하면 전체자릿수 중에 소수점 이하 한자리를 쓰겠다. 라는 뜻
// 10.1625 이면 전체자릿수는 6자리 이고 소숫점 아래는 4자리
