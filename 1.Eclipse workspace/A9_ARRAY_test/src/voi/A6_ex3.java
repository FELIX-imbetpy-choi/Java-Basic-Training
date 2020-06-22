package voi;

import java.util.Arrays;
import java.util.Scanner;

public class A6_ex3 {
	//학생들의 키값을 입력 받고 그 평균을 구하고 가장큰 학생의 이름과 키 가장 작은 학생의 이름과 키가 입력되도록 하시오

	public static void main(String[] args) {
		
		   String[] name = {"James", "Cathy", "Kenny", "Martin", "Crystal"};
		      
		      int[] height = new int[5];
		      
		      int toth = 0; 
		      double avah = 0;
		      
		      
		      int maxLoc = 0;
		      int minLoc = 0;
		      
		      Scanner scanner = new Scanner(System.in);
		      
		      for(int i = 0; i < name.length; i++) {
		         System.out.print(name[i] + "의 신장을 입력하세요!");
		         int j = scanner.nextInt();
		         height[i] = j;
		         toth = toth + j;
		         avah = toth / name.length;
		      }
		      int max = height[0];
		      int min = height[0];
		      
		      System.out.println("평균 신장은 : " + avah);
		      
		      
		      for(int a = 0; a < name.length; a++ ) {
		         if(max < height[a]) {
		            max = height[a];
		            maxLoc = a;
		         }
		         if(min > height[a]) {
		            min = height[a];
		            minLoc = a;
		         }
		      }System.out.println("가장 큰 학생은 " + name[maxLoc] + "이고" + "그 학생의 키는 " + max);
		        System.out.println("가장 작은 학생은 " + name[minLoc] + "이고" +  "그 학생의 키는 " + min);

	}

}
