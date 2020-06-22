package voi;

import java.util.Scanner;

public class A8_ex7 {
	
	//㈜ 복습 기록 ★20181007 

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		 System.out.println("1.남자 2.여자 중 번호를 선택하세요!");
        int i = scanner.nextInt();
        
        
        switch(i) {
        case 1:
        	System.out.println("남자");
        	break;
        case 2:
        	System.out.println("여자");
        	break;
        case 3:
            System.out.println("글 몰라요?");
            break;
            
        default:
            System.out.println("죽고싶어요?");
            	
        }
	}

}
