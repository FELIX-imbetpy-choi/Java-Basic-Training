package voi;

import java.util.Scanner;


public class A4_guguMain_close {
	//20181011 ,1014 복습완료 ★★ 

	public static void main(String[] args) {
		
		//문제. 사용자가 입력한 단의 구구단을 출력하시오(메소드 사용)
		//변수선언
		Scanner userscan = new Scanner(System.in);
		A4_guguMain_close main = new A4_guguMain_close();
		
		//사용자로부터 숫자 가져오기
		System.out.print("구구단을 출력할 단을 입력하세요 : ");
		int i = userscan.nextInt();
		
		userscan.close(); 
		//스캐너의 기능들이 메모리에 올라가있음 - close를 해야 메모리를 차지하지 않고 있음 - close 하더라도 변수에 입력값이 저장되어 있음
		
		//방법1 . 다른 class의 메소드 사용하기
		//gugu gu = new gugu();
	    //gu.calc9(i);
		
		//방법2. 클래스 안에서 메소드 선언하고 사용하기.
		//메인 클래스 안에서 메소드를 생성할 수 있다는 것을 알려주려고.
		main.calc9(i);
		
		

	}
	//---------------------------
	public void calc9(int i) {
		for(int j = 1; j <= 9; j++) {
			System.out.println(i+"X"+j+"="+(i*j));
		}
	}
	
	

}
