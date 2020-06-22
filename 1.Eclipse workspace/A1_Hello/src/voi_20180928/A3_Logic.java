package voi_20180928;

public class A3_Logic {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 2;
		int c = 5;
		
		//논리 연산자
		System.out.println((a>b)&&(b>c));  //and 관계
		System.out.println((a>b)||(b>c));  //or 관계
		

		System.out.println("(a>b)&&(b>c)"+ ((a>b)&&(b>c))); //괄호갯수 잘봐 괄호가 하나 더 붙어야 하나로 인정
		System.out.println("(a>b)&&(b>c)"+ ((a>b)&&(b>c)));
		System.out.println( " ( " +a+ ">" +b+ ") && (" +b+ ">" +c+ ")"+ ((a>b)&&(b>c)));	
		    // 더하기는 숫자를 연결해서 표시하기 위해서 쓰는 표식
		

		System.out.println("(" +a+ ">" +b+ ") || ("+b+ ">" +c+")");

		
		//문제. 
		int m = 10;
		int n =2;

		System.out.println("---산술연산자---");
		System.out.println("덧샘: " + " 10+2 " + "=" +(m+n));
		System.out.println("뺄셈: " + " 10-2 " + "=" +(m-n));
		System.out.println("곱셈: " + " 10*2 " + "=" +(m*n));
		System.out.println("나눗셈: " + " 10/2 " + "=" +(m/n));
		System.out.println("나머지: " + " 10%2 " + "=" +(m%n));
			
	}

}
