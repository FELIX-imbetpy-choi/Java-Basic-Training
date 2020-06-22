package voi;

public class A995_ex22 {
	
	//㈜ 복습 기록 ★20181007 


	public static void main(String[] args) {
		
		// 문제. 10의 0승부터 10승까지의 값을 세로로 나열하라!
		long tot = 1;
		
		for(int a = 0; a <= 10; a++) {
		  
		      System.out.println("10^"+" "+String.format("%2d", a)+" = "+String.format("%13d", tot));
		      tot=tot*10;
		}
	
	}

}
    //String.format("%8d", 100) 이면 0000100 으로 출력
