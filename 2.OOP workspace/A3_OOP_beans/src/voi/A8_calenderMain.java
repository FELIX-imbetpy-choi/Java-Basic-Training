package voi;

import java.util.Calendar;

public class A8_calenderMain {

	public static void main(String[] args) {
		//20181015 복습완료 ★
		
		//달력메소드
		
		// 메소드선언
		Calendar calendar = Calendar.getInstance();
		
		// 년도 가져오기
		int year = calendar .get(Calendar.YEAR);
		System.out.println("year : " + year);
		
		// 달수 가져오기 - 달수는 0부터 센다? +1을 해주어야 현재 달...why?
		// 다른 값들은 그냥 적용하기
		int month = calendar.get(Calendar.MONTH)+1;
		System.out.println("month : " + month);
		
		int day = calendar.get(Calendar.DATE);
		System.out.println("day : " + day);
		
		int hour = calendar.get(Calendar.HOUR);
		System.out.println("hour : " + hour);
		
		int minute = calendar.get(Calendar.MINUTE);
		System.out.println("minute : " + minute);
		
		int second = calendar.get(Calendar.SECOND);
		System.out.println("second : " + second);
		

	}

}
