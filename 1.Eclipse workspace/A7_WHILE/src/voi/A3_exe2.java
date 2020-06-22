package voi;

import java.util.Scanner;

public class A3_exe2 {
	
	//1.입력 2.수정 3.삭제  4.종료 ----선택:__  ===> 1.입력 되었습니다 등등 나오게 하기

	public static void main(String[] args) {
		
		  int i = 0;
	      Scanner scanner = new Scanner(System.in);
	      
	      while(i != 4) {
	         
	         System.out.println("1.입력");
	         System.out.println("2.수정");
	         System.out.println("3.삭제");
	         System.out.println("4.종료");
	         System.out.println("-------");
	         System.out.print("선택 : ");
	         i = scanner.nextInt();
	         if(i == 1) {
	            System.out.println("입력 되었습니다.");
	         }else if(i == 2) {
	            System.out.println("수정 되었습니다.");
	         }else if(i == 3) {
	            System.out.println("삭제 되었습니다.");
	         }
	      }
	      System.out.println("감사합니다. ^^");

	
        
      

	}

}


//while(k!=4) {
//	
//	System.out.print("1.입력 2.수정 3.삭제 4.종료 를 선택하세요  ");
//    int k = scanner.nextInt();
//    
//	if(k==1) {
//	System.out.println("1: 입력 되었습니다");
//	}
//	else if(k==2) {
//	System.out.println("2: 수정 되었습니다");
//	}
//	else if(k==3) {
//	System.out.println("3: 삭제 되었습니다");
//	}
//	else if(k==4) {
//	System.out.println("4: 시스템종료___");
//	}
//	
//	
//
//	
//}

