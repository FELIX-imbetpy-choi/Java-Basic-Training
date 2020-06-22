package voi_20181001;

import java.util.Scanner;

public class A1_main {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		if(a>b) {
			System.out.println("a가 b보다 큽니다");
			
		if (b>a) {
			System.out.println("b가 a보다 큽니다");
			
// if문이 많을수록 퍼포먼스 낭비! 조건을 묶어서 만들 수 있는 else 문이 등장!
			
		if(a>b) {
			System.out.println("a가 b보다" +(a-b)+ "만큼 큽니다");
			 //a가 b보다 __ 만큽 큽니다.
		} else {
			System.out.println("b가 a보다"+(b-a)+ "큽니다");
			//b가 a보다  __ 만큼 큽니다.
		}
		System.out.println("계산이 완료 되었습니다!!!");
			
		}
	
//  a의 정수를 입력하세요 : __
//	b의 정수를 입력하세요 : __
//	
//	case1) **결과** a가 b보다 __ 큽니다
//	case2) **결과** b가 a보다 __ 큽니다
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
		    
		    
            System.out.print("i의 정수를 입력하세요:__");
            int i = scanner.nextInt();
            System.out.print("i의 정수를 입력하세요:__");	
            int j = scanner.nextInt();
            

            if(i>j) {
            System.out.println("case1) ** 결과 ** i가 j보다"+(i-j)+"만큼 큽니다");
            }else {
            System.out.println("case2) ** 결과 ** i가 j보다 "+(j-i)+"만큽 작습니다");
            }
		  
		    
              if(i>j) {
              System.out.println("입력하신 값은"+i+"와"+j+"입니다"+"덧셈한 결과는"+(i+j)+"이며"+"뺄셈한 결과는"+(i-j)+"입니다.");
                      }else {
              System.out.println("입력하신 값은"+i+"와"+j+"입니다"+"곱셈한 결과는"+(i*j)+"이며"+"나눗셈한 결과는"+(i/j)+"입니다.");
              
              }
		    
	}
}
}
	
