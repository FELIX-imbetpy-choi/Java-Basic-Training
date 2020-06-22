package voi;

import voi2.A1_AddMetho;

public class A1_AddMain {
	
	//20181011 ,1014 복습완료 ★★ 
	
	
	public static void main(String[] args) {
		
		//문제. 1부터 10까지 모든 숫자의 합을 구하고 그 수가 홀수인지 짝수인지 판별
		//1부터 10까지 반복할 반복문-안에 합할 변수(메소드 사용)
		//합한 수가 홀수인지 짝수인지 판별할 조건문(메소드 사용)
		
		  A1_AddMetho evenOdd = new A1_AddMetho();
	      int sum = evenOdd.sumCalc(1, 10);
	      
	      System.out.println("합계 : " + sum);
	      
	      evenOdd.evenodd(sum);
	      
	   }
	   
	}
