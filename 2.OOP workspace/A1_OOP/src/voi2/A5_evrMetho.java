package voi2;

public class A5_evrMetho {
	
	public A5_evrMetho() {
		
	}
	
	public int sum(int i , int k) {
		// 앗... 처음 숫자를 크게 잡아서 시작할 수 없구나?
		int sum1 = 0;
		for(int a = i; a <= k; a++) {
			sum1 += a;
		}
		return sum1;
	}
	
	
	public double avr(double i, double k ,double j) {
		double avr1 = j/((k+1)-i); 
		return avr1;
	}
	
	

}

