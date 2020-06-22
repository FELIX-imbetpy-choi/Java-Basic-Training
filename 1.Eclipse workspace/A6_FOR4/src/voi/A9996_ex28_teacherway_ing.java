package voi;

import java.util.Scanner;

public class A9996_ex28_teacherway_ing {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
         
         System.out.println("첫번째 숫자를 입력하세요:");      
         int num1= scanner.nextInt();
         double num1d=num1;
         System.out.println("두번째 숫자를 입력하세요:");
         int num2=scanner.nextInt();
         double num2d=num2;
         
         
         //첫번째 숫자를 두번째 숫자로 나누어 몫 구하기.
         
         int resultint = num1/num2;
         double resultd=num1d/num2d;
         
         //첫번째 숫자를 두번째 숫자로 나누어 나머지 구하기.
         int resultElse = num1%num2;
         
         
         
	}

}
