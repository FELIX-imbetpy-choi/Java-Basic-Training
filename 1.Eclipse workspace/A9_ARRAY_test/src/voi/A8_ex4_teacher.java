package voi;

import java.util.Scanner;

public class A8_ex4_teacher {

	public static void main(String[] args) {

		//변수선언
		Scanner scanner = new Scanner(System.in);
		int[] histo = new int [10];
		
		//사용자로 부터 숫자를 입력받아 배열에 카운트 증가 시키기
		System.out.println("input score");
		for(int i = 0; i < histo.length; i++) {
			histo[i] = 0;
			System.out.print((i+1)+"의 score");
			int kk = scanner.nextInt();
			histo[kk/10]++;
		}
	    // #표시로 화면에 출력하기o
		for(int i = (histo.length-1); i >= 0; i--) {
			System.out.println(String.format("%3d:", i*10));
			for(int j = 1; j <= histo[i]; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		
	}

}
