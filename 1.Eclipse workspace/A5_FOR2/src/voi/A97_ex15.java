package voi;

import java.util.Scanner;

public class A97_ex15 {
	
	//㈜ 복습 기록 ★20181007 

	public static void main(String[] args) {
		
		

		Scanner scanner = new Scanner(System.in);
		System.out.print("입력한 숫자 만큼 별이 출력됩니다 : __ ");
        int i = scanner.nextInt();
        
        
        // 문제. 제일 바깥쪽만 * 이 찍히고 안쪽은 - 이 찍히도록하라
        for(i=0; i<7; i++){
           for(int j=0; j<=i; j++){
        	   
              if(j==0){
                 System.out.print("*");
              }
              else if(i==j){
                 System.out.print("*");
              }
              else{
                 System.out.print("-");
              }
           }
           System.out.println();
        }
        
     }
	}

//int 선언 후 다시 선언하면 오류걸림
