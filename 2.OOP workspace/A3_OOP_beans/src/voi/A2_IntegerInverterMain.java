package voi;

public class A2_IntegerInverterMain {

	public static void main(String[] args) {
		//20181014 복습완료 ★
		
		// 문자열을 정수로 정수를 문자열로 변환시키는 bean
		
		//초기 값 설정 - 정수와 문자열
		int num1 = 123;
		String str1 = "12345";
		String str2 = "abcde";				// 숫자가 아닌 문자열을 정수로 변환하면 디버그
		
		// 문자열 + 1 = 123451 출력 
		System.out.println(str1+1);
		
		// 문자열 str1 을 정수로 변환시킴
		int num2 = Integer.parseInt(str1); 
		System.out.println(num2+1);        // 변환된 문자열 + 1 = 12346
		
		
		System.out.println("-------------");
		
		// num1 정수값을 문자열로 변환시킴
		String str3 = Integer.toString(num1);
		System.out.println(num1+1);          // 변환 전 정수에 더하면 124
		System.out.println(str3+1);			 // 변환 후 문자열에 더하면 1231
		
		

	}

}
