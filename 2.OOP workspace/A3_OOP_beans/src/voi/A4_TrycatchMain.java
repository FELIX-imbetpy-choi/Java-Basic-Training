package voi;

public class A4_TrycatchMain {

	public static void main(String[] args) {
		//20181014 복습완료 ★
		
		int i = 10;
		int j = 0;
		
		System.out.println("Add" + (i+j));
		System.out.println("Sub" + (i-j));
		System.out.println("Mul" + (i*j));
		// 10을 0으로 나누니 에러가 걸릴 것임!
		// 이럴 때 사용 하는 것이 try 문이다
		try {
		// 자신이 없는 에러 걸릴 것 같은 부분을 try문 안에 넣는다
		System.out.println("Dic" + (i/j)); 
		}
		// 에러가 발생하면 프로그램 에러 대신 catch문 안에 소스가 실행되도록 한다. -  예외처리
		catch(Exception e) {    
		System.out.println();
		System.out.println("0으로 나누진 마십시오! ");
		}
		

	}

}
