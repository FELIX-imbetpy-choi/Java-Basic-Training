package voi;

import java.util.Scanner;

public class A5_ex2 {
	
	//㈜ 복습 기록 ★20181007 

	public static void main(String[] args) {
		
		//한 반class 가 5명으로 구성되어있다.
				//이 학급 학생들의 이름과 국어 영어 수학의 점수를 입력받아 반 성적표를 작성하려고 한다.
				// 학생들의 이름을 입력받고 국어 영어 수학의 항목이 출력 되도록 시스템을 구성하시오.
				
		   Scanner scanner = new Scanner(System.in);
		      String[] j = new String[5];
		      
		      int[] a = new int[5];
		      int[] b = new int[5];
		      int[] c = new int[5];
		      
		      int[] tot = new int[5];
		      int[] ava = new int[5];
		      double sum = 0;
		      
		      
		      for(int i = 0; i < j.length; i++) {
		      
		      System.out.println((i + 1) + "번 학생의 이름을 입력하세요 : ");
		      j[i] = scanner.next();
		      System.out.println((i + 1) + "번 학생의 국어 성적을 입력하세요 : ");
		      a[i] = scanner.nextInt();
		      System.out.println((i + 1) + "번 학생의 수학 성적을 입력하세요 : ");
		      b[i] = scanner.nextInt();
		      System.out.println((i + 1) + "번 학생의 영어 성적을 입력하세요 : ");
		      c[i] = scanner.nextInt();
		      
		      System.out.println();
		      
		      
		      tot[i] = a[i] + b[i] + c[i];
		      ava[i] = tot[i]/3;
		      
		      }
		      
		      System.out.println("★--------------------------------------------★");
		      System.out.println("이름" + "\t" + "국어" + "\t" + "수학" + "\t" + "영어" + "\t" + "총점" + "\t" + "평균");
		      System.out.println("★--------------------------------------------★");
		      
		      
		      
		      for(int k = 0; k < j.length; k++) {
		         System.out.println(j[k] + "\t" + a[k] + "\t" + b[k] + "\t" + c[k] + "\t" + tot[k] + "\t" + ava[k]);
		         sum = sum +(a[k]+b[k]+c[k]);
		      }
		      System.out.println("학급의 총점 :"+ sum);
		      System.out.println("학급의 평균 : " + sum/3);
		      System.out.println("개인의 평균 점수는 : "+ (sum/3)/5);
	}   


}
