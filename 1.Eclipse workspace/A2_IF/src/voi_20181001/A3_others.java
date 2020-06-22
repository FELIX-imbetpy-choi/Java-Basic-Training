package voi_20181001;

import java.util.Scanner;

public class A3_others {

	public static void main(String[] args) {
		int price = 5000;
		
		if((price > 5000) && (price <8000)) {
			
		}
		
		if(price > 8000) {
			System.out.println("너무 비쌉니다");
		} else if (price> 5000){
		    System.out.println("조금 비쌉니다");	
		} else if (price > 3000) {
			System.out.println("적당한 금액입니다");
		} else {
			System.out.println("싼편입니다");
		}
		
		System.out.println("구매 하실래요?");
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		 System.out.print("국어 점수를 입력하세요:__");
         double i = scanner.nextInt();
         System.out.print("영어 점수를 입력하세요:__");	
         double j = scanner.nextInt();
         System.out.print("수학 점수를 입력하세요:__");	
         double k = scanner.nextInt();
         
         double z = ((i+j+k)/3);
         
         if(i > z) {
 			System.out.println("국어 점수는 평균 보다"+(i-z)+ "점 높습니다");
 		} else if (i == z ){
 		    System.out.println("국어 점수는 평균입니다"); 
 		} else if (i < z) {
 			System.out.println("국어 점수는 평균보다"+(z-i)+"점 낮습니다 ");
 		}
         
       
         if(j > z) {
  			System.out.println("영어 점수는 평균 보다"+(j-z)+ "점 높습니다");
  		} else if (j == z ){
  		    System.out.println("영어 점수는 평균입니다"); 
  		} else if (j < z) {
  			System.out.println("영어 점수는 평균보다"+(z-j)+"점 낮습니다 ");
  		}

         if(k > z) {
  			System.out.println("수학 점수는 평균 보다"+(k-z)+ "점 높습니다");
  		} else if (k == z ){
  		    System.out.println("국어 점수는 평균입니다"); 
  		} else if (k < z) {
  			System.out.println("수학 점수는 평균보다"+(z-k)+"점 낮습니다 ");
  		}
         
         
   
    }
}
