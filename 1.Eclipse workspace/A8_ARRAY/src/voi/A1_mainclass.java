package voi;

import java.util.Scanner;

public class A1_mainclass {
	
	//㈜ 복습 기록 ★20181007

	public static void main(String[] args) {

	//	Scanner scanner = new Scanner(System.in);
	//	String strl = "abc";
//		
//		String[ ] str = new String[7];
//		str[0] = "일요일";
//		str[1] = "월요일";
//		str[2] = "화요일";
//		str[3] = "수요일";
//		str[4] = "목요일";
//		str[5] = "금요일";
//		str[6] = "토요일";
		
		String[] str = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
//		
	    for(int i = 0; i < str.length; i++) {
	    	System.out.println(str[i]);
	    }
	}
}
		

//대문자로 시작하는 것들은 자바에 원래 있던 것이 아니라 다 new 를 쓴다
// 변수를 지정하면 어떤 차이가 있을까? for문에 있다? 배열은 for문을 통해서 작업할 수 있다.