package voi_20181001;

import java.util.Scanner;

public class A4_ex {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		 System.out.print("점수를 입력하세요 :__");
        double i = scanner.nextInt();
        
        System.out.println("/＠..＠ //◎..◎//⊙..⊙//＠..＠// ◎..◎// ⊙..⊙/");
        
        if(i>=90) {
        	System.out.println("귀하의 점수는 A 입니다");
        }     
        else if(i>=80) {
        	System.out.println("귀하의 점수는 B 입니다");       
        }else if (i>=70) {
        	System.out.println("귀하의 점수는 C 입니다");
        }else if (i>=60) {
        	System.out.println("귀하의 점수는 D 입니다");
        }else if (60>i) {
        	System.out.println("귀하의 점수는 F90 입니다");
        }
        
         // 더 쉽게 할 수 있는 방법을 찾아야 한다.
        //i 현재 변수가 되는 부분은 십의 자릿수 이므로 i값을 10으로 나누고 그 값을 대조해 나타낼 수도 있다
        
	}

}
